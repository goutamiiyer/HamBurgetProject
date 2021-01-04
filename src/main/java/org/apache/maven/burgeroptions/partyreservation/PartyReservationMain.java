package org.apache.maven.burgeroptions.partyreservation;

import java.util.HashMap;
import java.util.Scanner;

public class PartyReservationMain implements ReservationInterface {
	HashMap<String, Double> partyMap = new HashMap<String, Double>();
	
	Scanner sc = new Scanner(System.in);
	
	public PartyReservationMain(HashMap<String, Double> partyMap) {	
		this.partyMap = partyMap;
	}

	public void createPartyReservation() {
		String typeOfParty = sc.next();
		double price = sc.nextDouble();
		partyMap.put(typeOfParty, price);
	}

	public void getPartyReservation() {
		String typeOfParty = sc.next();
		partyMap.get(typeOfParty);
	}

	public void updatePartyReservation() {
		String typeOfParty = sc.next();
		double price = sc.nextDouble();
		partyMap.put(typeOfParty, price);
	}

	public void deletePartyReservation() {
		String typeOfParty = sc.next();
		partyMap.remove(typeOfParty);
	}
	

}
