package Lab1;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		while(n>0)
		{
			int r=n%10;
			s=s+(r*r*r);
			n=n/10;
		}
		System.out.println("sum of the digits="+s);

	}

}
