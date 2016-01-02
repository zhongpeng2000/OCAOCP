class MyClass<T extends Number> {

	T ob;
	T vals[];

	MyClass(T o, T[] nums) {
		ob = o;
		vals = nums;
	}
}

public class GenericRes {
	public static void main(String args[]) {
		Integer n[] = { 1 };
		MyClass<Integer> iOb = new MyClass<Integer>(50, n);
		// Can't create an array of type-specific generic references.
		// Gen<Integer> gens[] = new Gen<Integer>[10];
		MyClass<?> gens[] = new MyClass<?>[10]; // OK
	}
}