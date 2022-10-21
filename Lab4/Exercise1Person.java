package Lab4;

public class Exercise1Person {

	String name;
	float age;
	Exercise1Person()
	{	
	}
	Exercise1Person(String nam, float ag)
	{
		name=name;
		age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}