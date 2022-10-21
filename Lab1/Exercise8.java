package Lab1;
import java.util.*;
public class Exercise8 {
	public static boolean power(int n)
	{
		boolean res=true;
		while(n!=1)
		{
		
		  if(n%2!=0||n==0)
		     {
			System.out.println("not divisible by 2");
			res=false;
			break;
		     }
		  n=n/2;
		}	
	return res;	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean result=power(n);
		if(result==true)
		{
			System.out.println("power of 2");
		}
		else
			System.out.println("not power of 2");
	}
}
