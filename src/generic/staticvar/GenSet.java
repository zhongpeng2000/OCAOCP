package generic.staticvar;

public class GenSet<T> {
	
	T t1;

	/**
	 * @return the t1
	 */
	public T getT1() {
		return t1;
	}

	/**
	 * @param t1 the t1 to set
	 */
	public void setT1(T t1) {
		this.t1 = t1;
	}
	
	// static is not OK!!!
//	static T t2;
	
	public static void main(String[] args) {
		GenSet<String> genSet = new GenSet<>();
		genSet.setT1("String");
		System.out.println(genSet.getT1());
		
		genSet.setT1(new Integer(2));
	}



}
