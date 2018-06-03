package org.wcci.virtual_pet_shelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPetShelter underTest;
	VirtualPet testpet1;
	VirtualPet testpet2;
	
	@Before
	public void setup() {
		underTest = new VirtualPetShelter();
		testpet1 = new VirtualPet("AudreyIII", "Prefers to eat people raw", 0, 0, 0, 0, 0);
		testpet2 = new VirtualPet("AudreyIV", "Likes dentists best.", 0, 0, 0, 0, 0);
			
	}
	@Test
	public void shouldAddPetToShelter() {
		underTest.addPet(testpet1);
		VirtualPet foundPet = underTest.findPet(testpet1.getPetName());
		assertThat(foundPet, is(testpet1));
	}
	
	@Test
	public void shouldAddTwoPetsToShelter() {
		underTest.addPet(testpet1);
		underTest.addPet(testpet2);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		assertThat(allPets, containsInAnyOrder(testpet1, testpet2));
		
	}
	@Test
	public void allowsAdoption() {
		VirtualPet foundPet = underTest.findPet(testpet1.getPetName());
		assertThat(foundPet, is(nullValue()));
		
	}
	@Test
	public void returnsSpecificPetGivenName() {
		underTest.callPet(testpet2);
		String callPetGetDescription = testpet2.returnPetDescription();
		assertThat(testpet2.description, is("Likes dentists best."));
		
	}
	@Test
	public void shouldReturnCollectionOfPets() {
		underTest.addPet(testpet1);
		underTest.addPet(testpet2);
		Collection<VirtualPet> allPetNames = underTest.returnAllPetsNames();
		assertThat(allPetNames, containsInAnyOrder("AudreyIII", "AudreyIV"));
	}
	
//	}
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
		underTest.addPet(testpet1);
		underTest.tick();
		assertThat(testpet1.getPetHunger(), is(1));
		assertThat(testpet1.getPetThirst(), is(1));
		assertThat(testpet1.getPetBoredom(), is(1));
		
	}
}
