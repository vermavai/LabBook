package Lab1;
import java.util.*;
public class Exercise6 {
	static int calDiff(int n)
	{
	int r=0,s=0,sq=0,diff=0;
	for(int i=0;i<=n;i++)
	{
		r=r+(i*i);
		s=s+i;
		sq=s*s;
		diff=(r-sq);
	}
	return diff;
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		//calDiff(n);
		System.out.println("calculated differnece="+calDiff(n));
	}
}

