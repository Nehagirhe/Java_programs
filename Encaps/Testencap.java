package neha;

public class Testencap {

	public static void main(String[] args) {
		Account acc= new Account();
		acc.setAccno(675548976);
		acc.setName("Neha Girhe");
		
		acc.setEmail("nehagirhe23@gmail.com");
		acc.setAmount(25000f);
		
		System.out.println("Account Number :  "+acc.getAccno());
	    System.out.println("Name : "+acc.getName());
		System.out.println("Email : "+acc.getEmail());
        System.out.println("Amount : "+acc.getAmount());
	}

}
