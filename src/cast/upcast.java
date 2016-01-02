package cast;



class Animal{}
class Dog extends Animal{}


public class upcast {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal animal2 = new Animal();
		Dog dog = (Dog) animal;
		Dog dog2 = animal2;
		Dog animal3 = new Animal();
	}

}
