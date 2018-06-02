package org.wcci.virtual_pet_shelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPetShelter underTest;
	VirtualPet pet1;
	VirtualPet pet2;
	
	@Before
	public void setup() {
		underTest = new VirtualPetShelter();
		pet1 = new VirtualPet("AudreyIII", "Prefers to eat people raw", 0, 0, 0, 0, 0);
		pet2 = new VirtualPet("AudreyIV", "Likes dentists best.", 0, 0, 0, 0, 0);
			
	}
	
	@Test
	public void shouldAddPetToShelter() {
		//Act
		underTest.addPet(pet1);
		VirtualPet foundPet = underTest.findPet(pet1.getPetName());
		assertThat(foundPet, is(pet1));
	}
	
	@Test
	public void shouldAddTwoPetsToShelter() {
		//Act
		underTest.addPet(pet1);
		underTest.addPet(pet2);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		assertThat(allPets, containsInAnyOrder(pet1, pet2));
		
//	}
//	@Test
//	public void shouldReturnCollectionOfPets() {
//		underTest.addPet(pet1);
//		underTest.addPet(pet2);
//		Collection<VirtualPet> allPets = underTest.getAllPets();
//		for(VirtualPet);
	}
	@Test
	public void allowsAdoption() {
		underTest.addPet(pet1);
		underTest.adopt(pet1);
		VirtualPet foundPet = underTest.findPet(pet1.getPetName());
		assertThat(foundPet, is(nullValue()));
	}
	@Test
	public void retursnSpecificPetGivenName() {
		underTest.addPet(pet1);
		underTest.addPet(pet2);
		
	}
//	@Test
//	public void shouldFeedAllPets() {
//		underTest.addPet(pet1);
//		underTest.addPet(pet2);
//	}
//	@Test
//	public void shouldWaterAllPets() {
//		
//	}
//	@Test
//	public void shouldPlayWithOnePet() {
//		
//	}
	@Test
	public void shouldCallTick() {
		underTest.addPet(pet1);
		underTest.tick(pet1.getPetName(), 1, 1, 1);
		assertThat(pet1.getPetHunger(), is(1));
		assertThat(pet1.getPetThirst(), is(1));
		assertThat(pet1.getPetBoredom(), is(1));
		
	}
}
