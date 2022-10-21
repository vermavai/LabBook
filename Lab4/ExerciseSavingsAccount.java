package Lab4;
public class ExerciseSavingsAccount extends Exercise1Account
{
		final double minBalance=500.0;

		@Override
		public void withdrawal(double withdraw) {
			if((this.balance -withdraw)>minBalance)
			{
				super.withdrawal(withdraw);
			}
			else
			{
				System.out.println("Cannot withdraw amount from the savings account");
			}
		}
		
	}


