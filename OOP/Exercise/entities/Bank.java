package entities;

public class Bank {

	private String accountId;
	private String holder;
	private double transition;
	private double value;
	
	public Bank(String accountId, String holder, double transition) {
		this.accountId = accountId;
		this.holder = holder;
		this.transition = transition;
	}
	
	public Bank(String accountId, String holder) {
		this.accountId = accountId;
		this.holder = holder;
	}
	
	public String getAccountId() {
		return accountId;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getTransition() {
		return transition;
	}
	
	public double getValue() {
		return value;
	}
	
	public double totalAccountValue() {
		return value + transition;
	}
	
	public void addValue(double transition) {
		this.value += transition;
	}
	
	public void removeValue(double transition) {
		this.value -= transition + 5.00;
	}
	
	public String toString() {
		return "Account "
			+ accountId
			+ ", Holder: "
			+ holder
			+ ", Balance: $ "
			+ String.format("%.2f", totalAccountValue());
	}
}
