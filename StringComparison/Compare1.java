package StringComparison;

public class Compare1 {
	
	public static void main(String[] args) {
	//equals()
	//Compares the original content of the string 
		
	String password1 = "Dipraj";
	String password2 = "Dipraj";
	String pass3 = new String("Dipraj");
	String pass4 = new String("Dipraj");
	
	System.out.println(pass3.equals(pass4));
	// == compare the reference of the objects not the value
	System.out.println(password1 == password2); //true
	System.out.println(password1 == pass3); // false
	}
}
