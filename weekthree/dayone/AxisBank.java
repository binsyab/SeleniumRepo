package weekthree.dayone;

public class AxisBank extends BankInfo  {

	@Override
	public void deposit()
	{
		System.out.println("Child Deposit");
		
	}
	public static void main(String[] args)
	{
		AxisBank ab = new AxisBank();
		
		ab.saving();
		
		ab.fixed();
		
		ab.deposit();
		
	}
}
