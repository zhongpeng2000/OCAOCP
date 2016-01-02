package generic.array.checked;

import java.lang.reflect.Array;

public class GenSet<E> {

    private E[] a;

    public GenSet(Class<E> c, int s) {
        // Use Array native method to create array
        // of a type only known at run time
        @SuppressWarnings("unchecked")
        final E[] a = (E[]) Array.newInstance(c, s);
        this.a = a;
    }

    E get(int i) {
        return a[i];
    }
    
    public static void main(String[] args) {
 		GenSet<String> genSet = new GenSet<>(String.class,10);
 		genSet.a[0] = "string";
 		
 		//compile error
 		genSet.a[1] = new StringBuilder("string");
 		
 		
 		System.out.println(genSet.get(0));
 		
 		//thrwo a runtime exception!!!!!!
 		System.out.println(genSet.get(1));
 	}
}
