package entities;

public class ProductFileHandling {
	
	private String name;
	private Double price;
	private Integer quantity;
	
	public ProductFileHandling() {
	}

	public ProductFileHandling(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	public Double valueTotal() {
		return price * quantity;
	}

}
