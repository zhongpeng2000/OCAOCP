package lambda;

interface IntPredicate{
	boolean test(int n);
//	boolean test2(int n, int m);
//	static void test2(){
//		
//	}
//	default void test2(){
//		
//	}
}

interface MyIntNumPredicate{
	boolean test(MyIntNum mv, int n);
}

class MyIntNum{
	private int v;
	
	public MyIntNum(int x) {
		v =x;
	}
	int getNum(){
		return v;
	}
	
	boolean isFactor(int n) {
		return (v % n) == 0;
	}
}


public class LambdaDemo {

	public static void main(String[] args) {
		boolean result;
		
		MyIntNum myNum = new MyIntNum(12);
		MyIntNum myNum2 = new MyIntNum(16);
		
		MyIntNumPredicate ip = MyIntNum::isFactor;
		
		result = ip.test(myNum,3);
		if(result) System.out.println("3 is a factor of " + myNum.getNum());
		
		ip = MyIntNum::isFactor;
		result = ip.test(myNum2,3);
		if(!result) System.out.println("3 is not a factor of " + myNum2.getNum());
	}

}
