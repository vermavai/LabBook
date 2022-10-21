package Lab1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		
		String s=sc.nextLine();
		s=s.toLowerCase();
		switch(s)
		{
		case "red":
		{
			System.out.println("Stop");
			break;
		}
		case "yellow":
		{
			System.out.println("ready");
			break;
		}
		case "green":
		{
			System.out.println("GO");
			break;
		}
		default:
		{
			System.out.println("default");
		}
		}
		
		// TODO Auto-generated method stub

	}

}
