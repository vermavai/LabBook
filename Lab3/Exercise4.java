package Lab3;
import java.util.*;
public class Exercise4 {
	static int modifyNumber(int num) {
		String str=String.valueOf(num);int i;
		StringBuffer sb=new StringBuffer();
		for(i=0;i<str.length()-1;i++) {
		 sb.append(Math.abs(Integer.parseInt(String.valueOf(str.charAt(i))) - Integer.parseInt(String.valueOf(str.charAt(i+1)))));
		}
		sb.append(String.valueOf(str.charAt(i)));
		num=Integer.parseInt(sb.toString());
		return num;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the desired number");
		int num=sc.nextInt();
		System.out.println(modifyNumber(num));
	}

}