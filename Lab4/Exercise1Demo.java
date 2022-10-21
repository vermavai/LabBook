package Lab4;
import java.util.*;
public class Exercise1Demo
{
		public static void main(String[] args)
		{
		Exercise1Person p1 = new Exercise1Person("Smith",30f);
		Exercise1Account acc1= new Exercise1Account(2000, p1);
		
		Exercise1Person p2=new Exercise1Person("Kathy",45f);
		Exercise1Account acc2= new Exercise1Account(3000,p2);
		
		acc1.deposit(2000);
		acc2.withdrawal(2000);
		ExerciseSavingsAccount sacc = new ExerciseSavingsAccount();
		Exercise1Person p3= new Exercise1Person("Michael",42f);
		sacc.setAccHolder(p3);
		sacc.setAccNum(5);
		sacc.setBalance(1000);
		sacc.withdrawal(1000);
		
		Exercise1CurrentAccount curacc = new Exercise1CurrentAccount();
		Exercise1Person p4= new Exercise1Person("Angela",22f);
		curacc.setAccHolder(p4);
		curacc.setAccNum(6);
		curacc.setBalance(1000);
		curacc.withdrawal(450);
		System.out.println(curacc.toString());
		
		System.out.println(sacc.toString());
		System.out.println(acc1.getBalance());
		System.out.println(acc1.accNum);
		System.out.println(acc2.accNum);
		System.out.println(acc2.getBalance());
		System.out.println(acc2.toString());
	}
	}


