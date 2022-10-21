package Lab1;
import java.util.*;
public class Exercise7 {
	
	static boolean checkInc(int a[])
	{
		boolean res=true;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				res=false;
				break;
			}		
		}
		return res;	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean result=checkInc(a);
		if(result==true) {
			System.out.println("this is increasing");
		}
			else
			{
				System.out.println("this is not increasing");
			}
		}
				
		
	}


