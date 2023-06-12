package neha;

public class Account {

	private long accno;
	private String name,email;
	private float amount;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public void setAccno(long accno) {
		this.accno =accno;
	}
	
	public long getAccno()
	{
		return accno;
	}
}
