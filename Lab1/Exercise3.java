package Lab1;
import java.util.*;
public class Exercise3 {
	// FIBONACCI WITHOUT RECURSION
	/*public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int a=0,b=1,c;
		System.out.print(a+"  "+b+"  ");
		for(int i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(c+"  ");
			a=b;
			b=c;
		}
		
	}*/

   //FIBIONACCI WITH RECURSION
	static int a=0,b=1,c;
	static void Fibonacci(int n)
	{
		if(n>0)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print("  "+c);
			Fibonacci(n-1);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.print(a+"  "+b);
		Fibonacci(n-2);
	}

}