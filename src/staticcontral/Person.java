package staticcontral;

public class Person {
	public static int id = 0;
	int age;
	/**
	 * @param age
	 */
	public Person(int age) {
		super();
		this.age = age;
	}

	public void print() {
		System.out.println(age);
	}
	
	public static void main(String[] args) {

		

		
		

		
		Person.id++;
		
		
		
		
		System.out.println(Person.id);
		
		Math.abs(-10);
	}

}
