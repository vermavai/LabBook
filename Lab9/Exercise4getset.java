package Lab9;
@FunctionalInterface
interface Intf5
{
	void show();
}
public class Exercise4getset {
	String name;int marks;
	Exercise4getset(String a,int b)
	{
		this.name=a;
		this.marks=b;
	}
	public void setName(String a) {
		this.name=a;
	}
	public String getName() {
		return this.name;
	}
	public int getMarks()
	{
		return this.marks;
	}
	public void setMarks(int b)
	{
		this.marks=b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf5 e=Exercise4getset::setName("vaibhav");
		e.show();

	}

}


