package Lab5;
import java.util.*;
public class Exercise1AgeException extends Exception
{
	public Exercise1AgeException(String s)
	{
		System.out.println(s);	
	}


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age of person");
		int age=sc.nextInt();
		try
		{
			if(age<15)
				throw new Exercise1AgeException("Invalid age");
			else 
				System.out.println("valid age");
		}
		catch(Exercise1AgeException a)
		{
			System.out.println(a);
		}
	}
}
	
	


