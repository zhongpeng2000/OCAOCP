package equals;

public class StringHashCode {
	String aString;
	
	public static void main(String[] args) {
//		String aString = "hello World";
//		String bString = "hello World";
//		System.out.println(aString.equals(bString));
//		System.out.println(aString.hashCode());
//		System.out.println(bString.hashCode());
		StringHashCode aCode = new StringHashCode();
		aCode.aString = "Hello";
		StringHashCode bCode =  new StringHashCode();
		bCode.aString = "Hello";
		System.out.println(aCode.equals(null));
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof StringHashCode)) {
			return false;
		}
		else{
			StringHashCode stringHashCode = (StringHashCode)obj;
			return stringHashCode.aString.equals(this.aString);
		}
	}
}
