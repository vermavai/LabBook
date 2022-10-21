package Lab2;
import java.util.*;
public class Exercise2 {
	static String sortString(String a[])
	{
		Arrays.sort(a);
		String countries=Arrays.toString(a);
	
	return countries;
	}
	public static void main(String args[])
	{
		String a[]= {"kanpur","hardoi","lucknow","balrampur","banglore","pune","bihar","chattisgarh"};
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("enter the elements of the string");
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextLine();
		}*/
		String result=sortString(a);
		System.out.println("sorted string="+result);
		
	}

}
