package Lab9;
@FunctionalInterface
interface Intf4
{
	void say();
}
public class Exercise5 {
	public static void methodReference()
	{
		int i,fact=1;
		for(i=1;i<=5;i++)
		{
			fact=fact*i;}
		
			System.out.println("Factorial of a number="+fact);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf4 d=Exercise5::methodReference;
		d.say();

	}

}
