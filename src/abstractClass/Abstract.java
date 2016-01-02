package abstractClass;

 abstract class sup {
	 abstract  void foo();
}

abstract class sub extends sup {
	 synchronized void foo(){ System.out.println("method");}
}

abstract class sub1 extends sup {
	abstract  void foo(); // override a non abstract method to abstract;
}
 public class Abstract {
	
    public static void main(String a[]) {
        my m = new my() {};
        m.mymethod();
        System.out.println();
        
    	sub mySub = new sub(){};
    	//sub mysSub = new sub(); wrong 
    	mySub.foo();
    	
    	sub1 mysSub1 = new sub1() { // must implement foo!!!!!!!!!!!!!!

			@Override
			void foo() {
				// TODO Auto-generated method stub
				
			}
		};
		
    }

}
abstract class my {
    public void mymethod() {
        System.out.print("Abstract");
    }
}

class poly {

}