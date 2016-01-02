package generic.array.unchecked;

public class GenSet<E> {

    private Object[] a;

    public GenSet(int s) {
        a = new Object[s];
    }

    E get(int i) {
        @SuppressWarnings("unchecked")
        final E e = (E) a[i];
        return e;
    }
    
    
    
    public static void main(String[] args) {
		GenSet<String> genSet = new GenSet<>(10);
		genSet.a[0] = "string";
		genSet.a[1] = new StringBuilder("string");
		
		
		System.out.println(genSet.get(0));
		
		//thrwo a runtime exception!!!!!!
		System.out.println(genSet.get(1));
	}
}