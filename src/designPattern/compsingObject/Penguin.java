package designPattern.compsingObject;

public class Penguin {
	private final Flippers flippers;
	private final WebbedFeet webbedFeet;
	
	public Penguin() {
		this.flippers = new Flippers();
		this.webbedFeet = new WebbedFeet();
	}
	
	public void flap() {
		this.flippers.flap();
	}
	
	public void kick() {
		this.webbedFeet.kick();
	}
	
	public static void main(String[] args) {
		Penguin penguin = new Penguin();
		penguin.kick();
		penguin.flap();
	}
}
