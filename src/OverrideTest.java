class X{
	public void mX() {
		System.out.println("Xm1");
	}
}

class Y extends X {
	public void mX() {
		System.out.println("Xm2");
	}
	public void mY() {
		System.out.println("Ym");
	}
}




public class OverrideTest {

	public OverrideTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
//		X xRef = new Y();
//		Y yRef = (Y) xRef;
//		yRef.mY();
//		xRef.mX();
		int ar1[] = {2, 4 ,6 ,8};
		int ar2[] = {1, 3, 5, 7, 9};
		ar2 = ar1;
		for(int e2 : ar2){
			System.out.println(" " + e2);
		}
	}

}
