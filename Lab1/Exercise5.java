package Lab1;
import java.util.*;
public class Exercise5 {
	static int CalculateSum(int n)
	{
		int s=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
			s=s+i;
			}
		}
	
	return s;
	
	}

public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	
	int ret=CalculateSum(n);
	System.out.println("Sum="+ret);
	
}

}

