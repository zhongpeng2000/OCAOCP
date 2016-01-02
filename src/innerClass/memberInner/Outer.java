package innerClass.memberInner;

public class Outer {
	private String greeting = "Hi";
	public int x;

	protected class Inner {
		public int repeat = 3;

		public void go() {
			for (int i = 0; i < repeat; i++) {
				System.out.println(greeting);
			}
		}
	}

	public void callInner(){
		//Outer outer = new Outer();
		Inner inner = new Inner();
		inner.go();
		//outer.new Inner().go();
		this.new Inner().go();
		
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.callInner();
		Inner inner = outer.new Inner();
		inner.go();
	}
	
	
}
