package Lab9;
@FunctionalInterface
interface Intf3
{
	boolean authentication(String username,int password);
}
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf3 c=(username,password)->{if(username.equals("vaibhav")&&(password==2)){return true;}else {return false;}};
		System.out.println(c.authentication("vaibhav",2));
	
		

	}

}
