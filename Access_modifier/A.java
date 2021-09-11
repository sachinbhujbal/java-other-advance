package Access_modifier;

public class A {
	public void display() {
		System.out.println("HI I am private");
	}
	protected void display2() {
		System.out.println("Hi I am protected");
	}
	
	void nothing() {
		System.out.println("Default, We can only use in Same package");
	}
}
