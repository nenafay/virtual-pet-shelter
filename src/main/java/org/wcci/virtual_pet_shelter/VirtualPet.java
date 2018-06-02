package org.wcci.virtual_pet_shelter;

public class VirtualPet {
	int hunger = 0;
	int thirst = 0;
	int boredom = 0; 
	int size = 1;
	int rootConstriction = 1;
	
	String name = "";
	String description = "";
	
	// constructor 
	public VirtualPet(String petName, String petDescription, 
		int petHunger, int petThirst, int petBoredom, int petSize, int rootConstriction) {
		this.name = petName;
		this.description = petDescription;
		this.hunger = petHunger;		
		this.thirst = petThirst;
		this.boredom = petBoredom;
		this.size = petSize;
		this.rootConstriction = rootConstriction;
		
	}
	
	// getters
	public String getPetName() {
		return name;
	}	
	public int getPetHunger() {
		return hunger;
	}

	public int getPetThirst() {
		return thirst;
	}
	public int getPetBoredom() {
		return boredom;
	}
	public int getRootConstriction() {
		return rootConstriction;
	}
	public void eatPerson() {
		hunger = hunger - 1;
		
	}
	public boolean isHungry() {
		return hunger > 5;
	}

	public boolean feedsSelf() {
		return hunger > 10;
		
	}

	public void beWatered() {
		thirst = thirst -2;
	}

	public boolean isWilted() {
		return thirst < 5 && thirst > 2;
	}

	public boolean isDry() {
		return thirst <= 2;
		
	}

	public void beSungTo() {
		boredom = boredom +2;

	}

	public boolean complains() {
		return boredom < 5;
	}

	public int getsize() {
		return size;
	}

	public void grow() {
		size = size + 1;
	
	}

	public void tick(int petHunger, int petThirst, int petBoredom) {
		hunger++;
		thirst++;
		boredom++;
	}
	public void roottick() {
		rootConstriction++;
		
		
	}
	public boolean hasPerished( ) {
		return ((thirst== 15)||(rootConstriction == 5));
		
		
	}
	public boolean murdersUser() {
		return (boredom==12);
			
	}
	public boolean isAnnoyed() {
		return boredom <10;

	}
	
	
}

