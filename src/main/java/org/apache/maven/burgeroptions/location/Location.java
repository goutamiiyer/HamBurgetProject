package org.apache.maven.burgeroptions.location;

import java.util.ArrayList;
import java.util.Scanner;

public class Location implements LocationOperationInterface {
	private String address;
	private String contact;
	
	Scanner sc = new Scanner(System.in);
	ArrayList<String> locationList;
	
	public Location(ArrayList<String> locationList) {
		locationList = new ArrayList<String>();
	}

	public void createLocation() {
		System.out.println("Enter the Address \n");
		String address = sc.nextLine();
		System.out.println("Enter the Contact \n");
		String contact = sc.nextLine();	
		String locationItem = address + "," + contact;
		locationList.add(locationItem);
	}

	public void getLocation() {
		for (String place : locationList) {
			System.out.println(place + "\n");
		}
	}

	public void updateLocation() {
//		System.out.println("Enter the Address to be updated \n");
//		String address = sc.nextLine();
		System.out.println("Enter the Contact to be updated \n");
		String contact = sc.next();	
		System.out.println("Enter the new Contact \n");
		String newContact = sc.next();
		for (int i = 0; i < locationList.size(); i++) {
			String[] locArray = locationList.get(i).split(",");
			ArrayList<String> addressContact = new ArrayList<>();
			if (addressContact.contains(contact)) {
				addressContact.remove(contact);
				addressContact.add(newContact);
				String newAddress = "";
				for (String addr: addressContact) {
					newAddress = newAddress + addr + ",";
				}
				locationList.set(i, newAddress);
				break;
			}
		}		
	}

	public void deleteLocation() {
		System.out.println("Enter the Contact to be Deleted \n");
		String contact = sc.next();	
		for (int i = 0; i < locationList.size(); i++) {
			String[] locArray = locationList.get(i).split(",");
			ArrayList<String> addressContact = new ArrayList<>();
			if (addressContact.contains(contact)) {
				locationList.remove(i);
				break;
			}
		}	
	}
	
}
