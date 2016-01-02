package designPattern.demo;

import java.util.Arrays;

import designPattern.builder.AnimalBuilder;
import designPattern.immutableObject.Animal;

public class builderDemo {

	public builderDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder
			.setAge(4)
			.setFavoriteFoods(Arrays.asList("grass","fish"))
			.setSpecies("duck");
		Animal duck = duckBuilder.build();
		
		Animal flamingo = new AnimalBuilder()
			.setFavoriteFoods(Arrays.asList("algae", "insects"))
			.setSpecies("flamingo")
			.build();
	}

}
