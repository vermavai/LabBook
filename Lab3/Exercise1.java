package Lab3;
import java.util.*;
public class Exercise1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your desired string");
		String s=sc.nextLine();
		System.out.println(s);
		int n=Integer.parseInt(s);
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("sum of the given string number="+sum);

}
}