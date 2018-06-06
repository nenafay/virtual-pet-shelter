package org.wcci.virtual_pet_shelter;

import java.util.ArrayList;
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

	public Collection<String> returnAllPetsNames() {
		
		Collection<String> names = new ArrayList<>();
		names = pets.keySet();
		return names;

	}

	public void feedAllPets() {
		for(VirtualPet pets:getAllPets()) {
			pets.beFed();
		}
	}

	public void waterAllPets() {
		for(VirtualPet pets:getAllPets()) {
			pets.beWatered();
		}
	}

	public void allowPlay(VirtualPet pet) {
		pets.get(pet);
		pet.beSungTo();
		
	}
	
	public boolean hasPets() {
		if (pets.size()>0){
	}
		return true;
		
	}
}
