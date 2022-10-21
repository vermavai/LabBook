package Lab2;
import java.util.*;
import java.lang.*;
import java.util.*;
public class Exericse3 {
    static int[] getSorted(int[] ar) {
        for(int i=0;i<ar.length;i++) {
            StringBuffer sb2=new StringBuffer();
            ar[i]=Integer.parseInt(sb2.append(String.valueOf(ar[i])).reverse().toString());
        }
        Arrays.sort(ar);
        return ar;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
        	 arr[i]=sc.nextInt();
           
        }
        int[] sortarray=getSorted(arr);
        for(int i=0;i<n;i++) {
            System.out.println(sortarray[i]);
        }


    }
}
