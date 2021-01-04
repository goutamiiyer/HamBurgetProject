package org.apache.maven.burgeroptions.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DailySpecials implements MenuOptionInterface {
	Scanner sc = new Scanner(System.in);
	HashMap<String, Double> menu;
	
	public DailySpecials (HashMap<String, Double> menu) {
		this.menu = menu;
	}
	public void createMenuItem() {
		System.out.println("Enter the name and price");
		String itemName = sc.next();
		double price = sc.nextDouble();
		menu.put(itemName, price);
	}

	public void getMenuItem() {
		for (Map.Entry<String, Double> mapElement: menu.entrySet()) {
			String itemName = mapElement.getKey();
			double price = (double) mapElement.getValue();
			System.out.println(itemName + "-" + price);
		}
		
	}

	public void updateMenuItem() {
		System.out.println("Enter the name and modified price");
		String itemName = sc.next();
		double price = sc.nextDouble();
		menu.put(itemName, price);
	}

	public void deleteMenuItem() {
		System.out.println("Enter the name to be deleted");
		String itemName = sc.next();
		menu.remove(itemName);
		
	}
}
