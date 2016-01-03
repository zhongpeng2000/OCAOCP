package generic.classDemo;

public class Hello<T> {
	
	T t;
	public Hello(T t) {
		this.t= t;
	}
	
	@Override
	public String toString() {
		return t.toString();
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(new Hello<String>("hi"));
		
		// using generic type object implicitly
		System.out.println(new Hello("there"));
		System.out.println(new Hello(2));
	}
	
	

}
