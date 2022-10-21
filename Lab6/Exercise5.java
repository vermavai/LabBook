package Lab6;
import java.util.*;
public class Exercise5 
{
	public static int[] getSmallest(int[] arr) 
	{
		List<Integer>lst=new ArrayList<>();
		for(int i:arr) {
			lst.add(i);
		}
		Collections.sort(lst);
		for(int i=0;i<lst.size();i++) {
			arr[i]=lst.get(1);
		}
		return arr;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i:getSmallest(arr)) {
			System.out.println("second smallest="+getSmallest(arr));
		}		
	
}
}
