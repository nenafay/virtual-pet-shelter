package org.wcci.virtual_pet_shelter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetShelterApp {

	public static void main(String[] args) {
		
		Map<String, Television>tvs = new HashMap<String, Television>();
		
		Television tv1 = new Television ("Samsung", "1234");
		Television tv2 = new Television ("LG", "1235");
		Television tv3 = new Television ("Zenith ", "1236");
		
		System.out.println("There are" + tvs.size() + "in our map");
		
		tvs.put(tv1.getProductKey(), tv1);
		
		System.out.println("There are "+ tvs.size()+ "in our map");
		
		tvs.remove(tv1.getProductKey());
		
		System.out.println("Thre are "+ tvs.size()+ "in our map");
		
		tvs.put(tv1.getProductKey(), tv1);
		tvs.put(tv2.getProductKey(), tv2);
		tvs.put(tv3.getProductKey(), tv3);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Entr product ky to remov");
		String userProductKey = input.nextLine();
		System.out.println("You Enterd:"+ userProductKey);
		tvs.remove(tv1.getProductKey());
		
		
	}

}
