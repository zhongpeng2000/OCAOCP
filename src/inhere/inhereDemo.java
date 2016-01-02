package inhere;

class sup {
	int a;

	/**
	 * @param a
	 */
	public sup(int a) {
		super();
		this.a = a;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "sub [a=" + a + "]";
	}
	
}

class sub extends sup {
	
	public sub() {
		//super(a);
		// TODO Auto-generated constructor stub
	}

	int b;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "sub [b=" + b + "]";
	}
	
	
}













public class inhereDemo {

	public inhereDemo() {
		// TODO Auto-generated constructor stub
	}

}
