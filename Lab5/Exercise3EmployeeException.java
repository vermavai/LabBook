package Lab5;
import java.util.*;
public class Exercise3EmployeeException extends Exception {
	Exercise3EmployeeException(String s)
	{
		System.out.println(s);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the salary of an employee");
		int salary=sc.nextInt();
		try
		{
			if(salary<3000)
				throw new Exercise3EmployeeException("salary is less than 3000");
			else
				System.out.println("salary is more than 3000");
		}
		catch(Exercise3EmployeeException ee)
		{
			System.out.println(ee);
		}
	}

}
