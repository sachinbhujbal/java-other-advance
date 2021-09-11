package ToStringMethod;

public class Person {
	
	// to string method
	String name;
	int age;
	Person(String name, int age ){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name : " + name + "\n" + "Age : "+ age;
		
	}
	
}
