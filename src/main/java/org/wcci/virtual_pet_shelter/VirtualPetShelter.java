package org.wcci.virtual_pet_shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
	
	public void adopt(VirtualPet pet) {
		pets.remove(pet.getPetName(), pet);
	}

	public void tick() {
		for (VirtualPet pets:getAllPets()) {
			pets.tick();
			}
	}

	public void callPet(VirtualPet pet) {
		pets.get(pet.returnPetDescription());
	}

	public Collection<VirtualPet> returnAllPetsNames() {
		for (Entry<String, VirtualPet> entry: pets.entrySet()) {
		 pets.keySet();
		}
		return pets.keySet();
	}
}
