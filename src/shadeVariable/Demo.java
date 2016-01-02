package shadeVariable;





public class Demo {
	static int var;
	static int var2;
	
	public Demo() {

	}
	
	public static void main(String[] args) {
		int var = 3;
		if (var2 == 0) {
			var = 3;
			var = var + 1;
			System.out.println(var);
		}
		System.out.println(Demo.var);
	}

}
