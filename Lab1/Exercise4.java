package Lab1;
import java.util.*;
public class Exercise4 
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int i,count=0;
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i==0||i==1)
				continue;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				count=0;
				break;
			}
			else 
			{
				count=1;
			}
		}
		if(count==1)
		{
			System.out.println(i);
		}
	}
	}	
	}


