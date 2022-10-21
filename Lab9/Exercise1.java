package Lab9;
@FunctionalInterface
interface Intf1
{
	double power(double x,double y);
}
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf1 p=(x,y)->(Math.pow(x, y));
        System.out.println(p.power(2, 3));

	}

}
