package Lab3;
import java.util.*;
public class Exercise2
{
	static String getImage(String s)
	{
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String revstring=new String(sb);
		return revstring;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the desired string");
		String s=sc.nextLine();
		System.out.println(s+"|"+getImage(s));
	}
}

