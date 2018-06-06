package org.wcci.virtual_pet_shelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

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
		VirtualPet foundPet = underTest.findPet(testpet1.getPetName());
		assertThat(foundPet, is(testpet1));
	}
	
	@Test
	public void shouldAddTwoPetsToShelter() {
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
		String callPetGetDescription = testpet2.returnPetDescription();
		assertThat(testpet2.description, is("Likes dentists best."));
		
	}
	
	@Test
	public void shouldReturnCollectionOfPets() {
		Collection<String> allPetNames = underTest.returnAllPetsNames();
		assertThat(allPetNames, containsInAnyOrder("AudreyIII", "AudreyIV"));
	}
	
	@Test
	public void shouldFeedAllPets() {
		testpet1.setHunger(10);
		testpet2.setHunger(9);
		underTest.feedAllPets();
		testpet1.getPetHunger();
		testpet2.getPetHunger();
		assertEquals(testpet1.hunger, 9);
		assertEquals(testpet2.hunger, 8);
	}
	
	@Test
	public void shouldWaterAllPets() {
		testpet1.setThirst(10);
		testpet2.setThirst(9);
		underTest.waterAllPets();
		testpet1.getPetThirst();
		testpet2.getPetThirst();
		assertEquals(testpet1.thirst, 8);
		assertEquals(testpet2.thirst, 7);
	}

	@Test
	public void shouldAllowPlayWithOnePet() {
		testpet1.setBoredom(3);
		testpet2.setBoredom(4);
		underTest.allowPlay(testpet1);
		testpet1.getPetBoredom();
		testpet2.getPetBoredom();
		assertEquals(testpet1.boredom, 1);
		assertEquals(testpet2.boredom,4);
		
	}
	@Test
	public void shouldCallTick() {
		underTest.tick();
		assertThat(testpet1.getPetHunger(), is(1));
		assertThat(testpet1.getPetThirst(), is(1));
		assertThat(testpet1.getPetBoredom(), is(1));
		
	}//everything was working beautifully... until it wasn't. I can't find the error.
}
