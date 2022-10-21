package Lab4;

public class Exercise1CurrentAccount extends Exercise1Account{
	final double overDraft=500.0;

	@Override
	public void withdrawal(double withdraw) {
		if((this.balance-withdraw)>overDraft)
		{
		super.withdrawal(withdraw);
		}
		else
		{
			System.out.println("LIMIT EXCEED");
		}
	}
	
}


