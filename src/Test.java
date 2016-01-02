
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	int fvar;
	static int cvar;
	public static void main(String[] args) {
		Test test = new Test();
		test.fvar = 200;
		String aString = "Hello";
		aString = aString.replace('e', 'E');
		System.out.println(aString);
	}

}
