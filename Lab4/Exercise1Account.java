package Lab4;

public class Exercise1Account extends Exercise1Person {
	long accNum;
	double balance;
	Exercise1Person accHolder;
	Exercise1Account()
	{	
	}
	Exercise1Account(double b, Exercise1Person p)
	{
		balance=b;
		accHolder=p;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum++;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Exercise1Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Exercise1Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double dep)
	{
		balance=balance+dep;
	}
	public void withdrawal(double withdraw)
	{
		balance=balance-withdraw;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder.name + "]";
	}	
}


