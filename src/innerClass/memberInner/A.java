package innerClass.memberInner;

public class A {
	private int x = 10;
	private class B {
		private int x = 20;
		private class C {
			//public static int abc =2;
			private int x = 30;
			public void allTheX() {
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(A.B.this.x);
				System.out.println(A.this.x);
			}
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.allTheX();
		
		
//		A a = new A();
//		B b = a.new B();
//		B.C c = b.new C();
//		c.allTheX();
	}

}
