package org.wcci.virtual_pet_shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

// make map
	Map<String, VirtualPet> pets = new HashMap<>();
	
	public void addPet(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);
	}

	public VirtualPet findPet(String petName) {
		return pets.get(petName);
	}

	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}
	
	// Should accept a String instead of a VirtualPet
	// Should call .remove() and pass that petName
	// 
	public void adoptPet(String petName) {
		pets.remove(petName);
	}

	public VirtualPet tick(String petName, int petHunger, int petThirst, int petBoredom) {
		return pets.values();
	}

}
