package staticFinal;

abstract class Cat{
	String name = "The Cat";
	void clean(){
		
	}
}

//interface Cat{
//	String name = "The Cat";
//	void clean();
//}

class Lion extends Cat{
	void clean(){
		
	}
}

//class Lion implements Cat{
//	public void clean(){
//		
//	}
//}


public class Test {
	public static void main(String[] args) {
		Cat cat = new Lion();
		System.out.println(cat.name);
		cat.name = "aaa";
		System.out.println(cat.name);
	}
}
