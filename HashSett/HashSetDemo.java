package HashSett;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet<String> fruits = new HashSet<String>();
		
		fruits.add("Alu");
		fruits.add("Orange");
		fruits.add("Banana");
		
		System.out.println(fruits);
		System.out.println(fruits.size());
	}
}
