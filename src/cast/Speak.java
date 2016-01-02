package cast;

public class Speak {

	public Speak() {
		Speak speakIt = new Tell();
		Tell tellIt = new Tell();
		(Truth)speakIt.tellItLikeItIs();
		((Truth)speakIt).tellItLikeItIs();
		tellIt.tellItLikeItIs();
		(Truth)tellIt.tellItLikeItIs();
		((Truth)tellIt).tellItLikeItIs();
	} 

}

class Tell extends Speak implements Truth{
	public void tellItLikeItIs(){
		System.out.println("Right on!");
	}
}

interface Truth{
	public void tellItLikeItIs();
}