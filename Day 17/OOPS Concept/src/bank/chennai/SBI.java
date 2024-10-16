package bank.chennai;

public class SBI {
	String empName, empId;
	static String branch_name = "chennai";
	public static void main(String[] args) {
		SBI sb=new SBI();
		sb.get_loan(20000);
		sb.create_account();

	}
	public void  get_loan(int amount) {
		System.out.println("Loan credited "+ amount);
	}
	public void create_account() {
		System.out.println("account  created");
	}

}
