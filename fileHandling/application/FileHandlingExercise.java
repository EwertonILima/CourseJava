package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProductFileHandling;

public class FileHandlingExercise {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProductFileHandling> product = new ArrayList<>();
		
		
		String pathIn = "c:\\temp\\in.txt";
		String pathOut = "c:\\temp\\out\\summary.csv";
		String pathCreate = "c:\\temp";
		
		boolean success = new File(pathCreate + "\\out").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		try(BufferedReader br = new BufferedReader(new FileReader(pathIn))){
			
			String line = br.readLine();
			String[] fields = null;
			
			while(line != null) {
				fields = line.split(",");
				
				product.add(new ProductFileHandling(fields[0], Double.parseDouble(fields[1]),Integer.parseInt(fields[2])));
			
				line = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))){
				for(ProductFileHandling out : product) {
					bw.write(out.getName() + "," + String.format("%.2f", out.valueTotal()));
					bw.newLine();
				}
			}
			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		}
		catch(IOException e) {
			System.out.println("Error reading file " + e.getMessage());
		}

	}

}
