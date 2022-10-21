package Lab5;
import java.util.*;
public class Exercise2ValidateName extends Exception
{
	Exercise2ValidateName(String s)
	{
		System.out.println(s);
	}
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name of the employee");
		String fname=sc.nextLine();
		System.out.println("Enter the last name of employee");
		String lname=sc.nextLine();
		String firstname,lastname;
		try
		{
			if(fname==""||lname=="")
			{
				throw new Exercise2ValidateName("invalid name of employee");
			}
			else
				System.out.println("valid name of the employee");
		}
		catch(Exercise2ValidateName vn)
		{
			System.out.println(vn);
		}
		
	}
	
	

}
