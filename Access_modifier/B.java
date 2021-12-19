package Access_modifier;

public void display(){
	System.out.println("This is display method");
}
public void display2(int s){
	System.out.println("This is display2 method"+s);
}
protected void nothing(){
	System.out.println("this method return nothing");
}
		
public class test {
 public static void main(String[] args) {
	A a = new A();
	a.display();
	a.display2(34);
	a.nothing();
}
}
