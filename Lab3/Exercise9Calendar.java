package Lab3;
import java.time.LocalDate;
import java.util.*;
import java.util.Date.*;

public class Exercise9Calendar {

	/*public static void getDayMonthYear(String date)
	{
		LocalDate currentDate=LocalDate.parse(date);
		int day=currentDate.getDayOfMonth();
		Month month=currentDate.getMonth();
		int year=currentDate.getYear();
		
	}*/
	
	public static void main(String args[])
	{
		
		/*Calendar cal=new GregorianCalendar(2022,10,16);
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int month=cal.get(Calendar.MONTH);
		int year=cal.get(Calendar.YEAR);
		System.out.println("DAY:"+day);
		System.out.println("MONTH:"+month);
		System.out.println("YEAR:"+year);*/
		
		Calendar c1=Calendar.getInstance();
		System.out.println("current date");
		int d=c1.get(Calendar.DATE);
		int m=c1.get(Calendar.MONTH);
		m++;
		int y=c1.get(Calendar.YEAR);
		System.out.println(d+"_"+m+"_"+y);
		System.out.println("current time");
		int h=c1.get(Calendar.HOUR);
		int min=c1.get(Calendar.MINUTE);
		int s=c1.get(Calendar.SECOND);
		System.out.println(h+":"+min+":"+s);
		int x=c1.get(Calendar.AM_PM);
		if(x==0)
			System.out.println("Good MoRNing");
			else
				System.out.println("Good Evening");
		}
		
	}


