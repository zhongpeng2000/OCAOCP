package enumDemo;

enum FourSeason {
	WINTER, SPRING, SUMMER, FALL;
}

enum FourSeason2 {
	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
	private String vistor;
	private FourSeason2(String vistor) {
		this.vistor = vistor;
	}
	public void print() {
		System.out.println(vistor);
	}
//	@Override
//	public String toString(){
//		return vistor;
//	}
}

//enum ExtendFourSeason extends FourSeason{
//	
//}

public class Season{
	public static void main(String[] args) {
		FourSeason s = FourSeason.SUMMER;
		System.out.println(FourSeason.SUMMER);
		System.out.println(s == FourSeason.SUMMER);
		System.out.println(s);
		
		for(FourSeason fs: FourSeason.values()){
			System.out.println(fs.name() + " " + fs.ordinal());
		}
		
		FourSeason s1 = FourSeason.valueOf("SUMMER");
		//FourSeason s2 = FourSeason.valueOf("summer");
		System.out.println(s1 == FourSeason.SUMMER);
		System.out.println(s1);
		
		FourSeason fall = FourSeason.FALL;
		switch (fall) {
		case WINTER:
			
			break;
		case SUMMER:
			
			break;
		case SPRING:
			
			break;
		case FALL:
			System.out.println(fall);
			break;
			

		default:
			break;
		}
		
		FourSeason2 fourSeason2 = FourSeason2.FALL;
		System.out.println(fourSeason2);
		System.out.println(FourSeason2.FALL);
		System.out.println(fourSeason2.valueOf("WINTER"));
	}
}
