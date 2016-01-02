enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;

	private Animals(String s) {
		// TODO Auto-generated constructor stub
		sound = s;
	}
}

public class enumAnimal {
	static Animals a;
	
	public static <T extends Comparable<T>, V extends Comparable<V>> boolean isEqual( T x, V y) {
		return x.equals(y);
		
		
	}

	public static void main(String[] args) {
		System.out.println(a.DOG.sound + " " + a.FISH.sound);
		Integer aInteger = 5;
		Double bdDouble = 5.0;
		Double cDouble = 5.00;
		System.out.println(aInteger.equals(bdDouble)); // compare class first not value!!!!
		System.out.println(bdDouble.equals((double)aInteger));
		System.out.println(bdDouble.equals(bdDouble));
		
		System.out.println(isEqual(aInteger,bdDouble));
		System.out.println(isEqual(bdDouble,aInteger));
		System.out.println(isEqual(bdDouble,cDouble));
		System.out.println();
	}


}
