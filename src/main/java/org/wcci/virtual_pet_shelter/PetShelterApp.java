package org.wcci.virtual_pet_shelter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetShelterApp {

	public static void main(String[] args) {
		
		Map<String, VirtualPet>pets = new HashMap<String, VirtualPet>(0,6);
		
		Scanner input = new Scanner(System.in);
		
		VirtualPetShelter sunniside = new VirtualPetShelter();
		
		VirtualPet pet1 = new VirtualPet ("AudreyIII", "would like barbeque sauce next time, please.", 0, 0, 0, 3, 0);
		VirtualPet pet2 = new VirtualPet ("AudreyIV", "has the most wonderful voice.", 0, 0, 0, 6, 0);
		VirtualPet pet3 = new VirtualPet ("AudreyV ", "thinks dentists are delicious", 0, 0, 0, 4, 0);
		VirtualPet pet4 = new VirtualPet ("Seymour", "loves Audrey. We're not sure which one.", 0, 0, 0, 1, 0);
		
		System.out.println("Welcome to the Sunniside Virtual Pet House and Conservatory" + 
		"\n" + " We are a certified Dangerous Carnivorous Plant Rescue Facility and, as such," +
		"\n" + " must follow strict health and safety guidelines, " +
		"\n" + "but we're desperate for volunteers, " + "\n" + 
		"particularly those with solid entertainment backgrounds and strong singing voices. " +
		"\n" + "What is your name?");
		String userName = input.nextLine();
		System.out.println("Audrey says, \" Hi, " + userName + ". What would you like to do here at Sunniside? " +
		"\n" + "You can interact with Audrey in the following ways:");

			while (sunniside.hasPets()==true) { 
				System.out.println("press 1 to feed the plants" +
				"\n" + "press 2 to water the plants" +
				"\n" + "press 3 to select a plant to sing to" +
				"\n" + "press 4 to leave alone" +
				"\n" + "press 5 to adopt a plant" +
				"\n" + "press 6 to relinquish your dangerous carniverous plant to our care");
				
				int interaction = input.nextInt();
				sunniside.tick();
				input.nextLine();
				if (interaction == 1) {
					System.out.println("Please type the name of a person you would like our plants to eat.");
					String plantFood = input.nextLine();
					sunniside.feedAllPets();
					System.out.println("\"Thanks, " + userName + "! All our pets thought " + plantFood + " was tasty!\"");
				} else if (interaction == 2) {sunniside.waterAllPets();
					System.out.println("All plants sing together,\"Why does it always rain on me?\"");
				} else if (interaction == 3){ 
					System.out.println(sunniside.returnAllPetsNames());
					System.out.println("Please type the name of a plant from the list above to serenade.");
					String chosenPet = input.nextLine();
//						if 
//					VirtualPet.getEntertained();
//				} else if (interaction == 4) {sunniside.tick();
//				} 			
//			audrey.getFullness();
//			if (audrey.fullness < 4 && audrey.fullness > 1) {
//				audrey.isHungry();
//				System.out.println("\"FEED ME, " + userName.toUpperCase() +" !\"");
//			} else if (audrey.fullness <= 1) {
//				audrey.feedsSelf();
//				System.out.println("Audrey has eaten an innocent person.\n Oh, the humanity!");
//				audrey.eatPerson();
//			} else if (audrey.fullness > 7) {
//				audrey.grow();
//				System.out.println("Audrey sings the themesong from 'Growing Pains'.");
//				audrey.getsize();
//				if (audrey.size % 3 == 0) {
//					System.out.println("Audrey needs to be re-potted." +
//							"\n" + "To re-pot Audrey, press 1"
//							+ "\n"+ "To do nothing, press 2");
//					audrey.roottick();
//					int repot = input.nextInt();
//					if (repot == 1) {
//						audrey.rootConstriction--;
//						System.out.println("Audrey sings: \"Ooooh! Talk dirty to me!\"");
//						} else {audrey.roottick();
//						System.out.println("Audrey says, \"It's gettin tight in here!");
//						}
//				} else {
//				} 
//			}else {
//			}
//			audrey.getRootConstriction();
//			if (audrey.rootConstriction > 3) {audrey.hasPerished();
//			System.out.println("You were just too lazy to give poor Audrey a new pot."
//					+ "\n" + "Now she's dead. We hope you're proud of yourself.");
//			System.exit(0);
//			}
//			audrey.getTurgorPressure();
//			if (audrey.turgorPressure < 5 && audrey.turgorPressure > 2) {
//				audrey.isWilted();
//				System.out.println("Audrey sings: \"Gimme some water!" + 
//				"\n" +"'Cause I shot a man at the Mexican border." +
//				"\n Cool, cool water!\"");
//			} else if (audrey.turgorPressure <= 2) {
//				audrey.isDry();
//				System.out.println("Audrey sings: \"All my leaves are brown and the sky is gray.\"");
//			} else if (audrey.turgorPressure == 0) {
//				audrey.hasPerished();
//				System.out.println("Audrey has withered away and died due to lack of water." + 
//				"/n Your friends are now safe, but so are your enemies.");
//				System.exit(0);
//			}else {
//			}
//			audrey.getEntertained();
//			if (audrey.entertainment < 4 && audrey.entertainment >=2) {
//				audrey.complains();
//				System.out.println("Audrey says: \"" + userName.toUpperCase() + ", I'm bored!\n Sing me something jazzy!\"");
//			} else if (audrey.entertainment == 1) {
//				audrey.isAnnoyed();
//				System.out.println("Audrey says: \"" + userName.toUpperCase() + ", Sing to me NOW! \n I'm warning you!");
//			} else if (audrey.entertainment > 10) {
//				audrey.singsAndDances();
//				System.out.println("Audrey sings: \n \"He started an explosion. Holy cow!\r\n" + 
//						"\r\n" + 
//						"That thing went Bang! Kaboom!\r\n" + 
//						"And he's havin' some fun now.\r\n" + 
//						"\r\n" + 
//						"Some fun now.\r\n" + 
//						"Pop Quiz!\r\n" + 
//						"What's he havin'?\r\n" + 
//						"Some fun now.\r\n" + 
//						"Sure Is!\r\n" + 
//						"He's a havin' some fun now.\r\n" + 
//						"Oh Boy!\r\n" + 
//						"Ain't he havin' some fun now!\r\n" + 
//						"Now!\"");
//			}else if (audrey.entertainment == 0) {
//				audrey.murdersUser();
//				System.out.println("Audrey has grown bored with you and decided that you would be worth more as lunch. RIP " + userName + ".");
//				System.exit(0);
//			}
//			System.out.println("\n Stats: \n" + audrey.fullness + " = fullness" +
//				"\n" + audrey.turgorPressure + " = soil moisture"
//				+ "\n" + audrey.entertainment + " = entertainment"
//				 + "\n" + audrey.size + " = size");
//				
//				
//		}
//	
//		
//		System.out.println("There are" + pets.size() + "in our map");
//		
//		pets.put(tv1.getProductKey(), tv1);
//		
//		System.out.println("There are "+ pets.size()+ "in our map");
//		
//		pets.remove(tv1.getProductKey());
//		
//		System.out.println("Thre are "+ pets.size()+ "in our map");
//		
//		pets.put(tv1.getProductKey(), tv1);
//		pets.put(tv2.getProductKey(), tv2);
//		pets.put(tv3.getProductKey(), tv3);
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Entr product ky to remov");
//		String userProductKey = input.nextLine();
//		System.out.println("You Enterd:"+ userProductKey);
//		pets.remove(tv1.getProductKey());
				}
			}
	}
}
