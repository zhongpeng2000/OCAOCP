package abstractClass;

public class bitwise {

//	public static void main(String[] args) {
//		String[] horses = new String[5];
//		//horses[4] = null;
//		for(int i = 0; i < horses.length;i++){
//			if(i < args.length){
//				horses[i] = args[i];
//			}
//			//System.out.println(horses[i].toUpperCase() + " ");
//			System.out.println(horses[i]);
//		}
//		
//	}
	
    public static void main(String[] args) {
        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        final String s4 = s3.intern();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3.intern());
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s2 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));
    }

}
