package Lab2;
import java.util.*;
public class Exercise1 {
	public static int getSecondSmallest(int a[])
	{
		Arrays.sort(a);
		return a[1];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int result=getSecondSmallest(a);
		System.out.println("second smallest digit="+result);

	}

}
