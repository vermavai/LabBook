package Lab6;
import java.util.*;
public class Exercise3 {
public static Map getSquares(int[] arr) {
		Map<Integer,Integer> mp=new LinkedHashMap<>();
		for(int i:arr) {
			mp.put(i,i*i);
		}
		return mp;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the desired size of the array");
		int n=sc.nextInt();
		int[] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(getSquares(arr));
	}
}