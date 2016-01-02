package enumDemo;

public class Swimmer {
	enum AnimalClass {
		MAMAL, FISH {
			public boolean hasFins() {
				return true;
			}
		}, BIRD, REPITLE, AMPHIBIAN, INVERTEBRATE;
		public abstract  boolean hasFins();

	}
}
