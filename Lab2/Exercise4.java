package Lab2;
import java.util.*;
public class Exercise4 {
	static int removeDuplicates(int a[])
	{
		int n=a.length;
		if(n==0||n==1)
		{
			return n;
		}
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
		}
			temp[j++]=a[n-1];
		
		
		for(int i=0;i<j;i++)
		{
			a[i]=temp[i];
		}
		return j;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int l=sc.nextInt();
		int a[]=new int[l];
		System.out.println("enter the elements");
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		int r=removeDuplicates(a);
		for(int i=0;i<r;i++)
		{
		System.out.print(" "+a[i]+" ");
		}
	}
	

}
