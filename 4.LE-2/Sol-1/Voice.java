class Voice {
	Animal[] animals = new Animal[5];
	int size = 5;
	void prepareVoice() {
	    animals[0] = new Cow();
	    animals[1] = new Dog();
	    animals[2] = new Pig();
	    animals[3] = new Goat();
	    animals[4] = new Lion();
	}
	
	void hear() {
	    for (int i = 0; i < size; i++) {
            animals[i].makeVoice();  // Calls the overridden makeVoice method of each animal
        }
	}
}