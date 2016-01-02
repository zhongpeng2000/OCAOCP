package overrideDemo;

import access.modifiers.cat.BigCat;

class Bobcat{
	public void findDen(){
		
	}
}

 class BobcatKitten extends Bobcat{
	 @Override
	 public void findDen() {
		
	}
	 public void findDen(boolean b) {
		
	}
	 public int findden() throws Exception {
		 return 0;
		
	}
	 
	public int sum(int i, int j){
		return i+j;
	}
	public int sum(Integer i, Integer j){
		return i+j+100;
	}
//	public In sum(int i, int j){
//		return i+j+100;
//	}

	
 }

public class Demo {
	public static void main(String[] args) {
		BobcatKitten bobcatKitten = new BobcatKitten();
		System.out.println(bobcatKitten.sum(new Integer(100), 100));
	}
}
