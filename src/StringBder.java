//import org.apache.commons.lang3.builder.EqualsBuilder

public class StringBder {
	public static void main(String[] args) {
//		StringBuilder sBuilder = new StringBuilder("HAHA");
//		StringBuilder sBuilder2 = new StringBuilder("HAHA");
		StringBuffer sBuilder = new StringBuffer("HAHA");
		StringBuffer sBuilder2 = new StringBuffer("HAHA");
		System.out.println(sBuilder.equals(sBuilder2));
		System.out.println(sBuilder);
		System.out.println(sBuilder.toString().equals(sBuilder2.toString()));
	}
	
//	public boolean equals(Object obj) {
//		return EqualsBuilder.
//	}

}
