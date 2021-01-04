package org.apache.maven.texasburger.burgercompany;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.maven.burgeroptions.location.Location;
import org.apache.maven.burgeroptions.menu.MainMenu;
import org.apache.maven.burgeroptions.partyreservation.PartyReservationMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final Logger log = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Texas HamBurger Company" );
        
        Scanner sc = new Scanner(System.in);
        
        HashMap<String, Double> menuMap = new HashMap<String, Double>();
        menuMap.put("Hamburger", 6.00);
        menuMap.put("Bacon Cheeseburger", 7.50);
        menuMap.put("Cheeseburger", 6.50);
        menuMap.put("Chili Cheese Burger", 7.25);
        menuMap.put("Garden Burger ", 7.15);
        
        while(true) {
        	System.out.println("Enter the choice you want");
        	System.out.print("L.Location" + "     " + "M.Menu" + "     " + "P.Party Reservations" + "     " + "C. Close"
					+ "     " + "\n");
        	String input = sc.next();
        	char choice = input.charAt(0);
        	
        	switch(choice) {
        	case 'M':
        		System.out.println("Here is the menu");
        		System.out.print("C.Create Menu Item" + "     " + "R.Retrieve Menu Item" + "     " + "U.Update Menu Item"
						+ "     " + "D. Delete Menu Item" + "     " + "\n");
        		String crud = sc.next();
        		char option = crud.charAt(0);
        		MainMenu menu = new MainMenu(menuMap);
        		if (option == 'C') {
        			menu.createMenuItem();
        		} else if (option == 'R') {
        			menu.getMenuItem();
        		} else if (option == 'U') {
        			menu.updateMenuItem();
        		} else if (option == 'D') {
        			menu.deleteMenuItem();
        		}
        	case 'L':
        		System.out.println("Here is the Location");
        		System.out.print("C.Create Location" + "     " + "R.Retrieve Location" + "     " + "U.Update Location"
						+ "     " + "D. Delete Location" + "     " + "\n");
        		String locationcrud = sc.next();
        		char locationOption = locationcrud.charAt(0);
        		ArrayList<String> locationList = new ArrayList<String>();
        		locationList.add("Irving,508123456");
        		locationList.add("Arlington,508123457");
        		locationList.add("Frisco,508123458");
        		locationList.add("Plano,508123459");
        		locationList.add("Austin,508123450");
        		
        		Location location = new Location(locationList);
        		if (locationOption == 'C') {
        			location.createLocation();
        		} else if (locationOption == 'R') {
        			location.getLocation();
        		} else if (locationOption == 'U') {
        			location.updateLocation();
        		} else if (locationOption == 'D') {
        			location.deleteLocation();
        		}
        	case 'P':
        		System.out.println("Here is the Party Reservation");
        		System.out.print("C.Create Party Reservation" + "     " + "R.Retrieve Party Reservation" + "     " + "U.Update Party Reservation"
						+ "     " + "D. Delete Party Reservation" + "     " + "\n");
        		String partycrud = sc.next();
        		char partyOption = partycrud.charAt(0);
        		HashMap<String, Double> partyMap = new HashMap<String, Double>();
        		partyMap.put("Graduation", 75.50);
        		partyMap.put("Wedding", 100.00);
        		partyMap.put("Birthday", 50.00);
        		partyMap.put("Career", 150.50);
        		partyMap.put("Baby Shower", 200.00);
        		PartyReservationMain party = new PartyReservationMain(partyMap);
        		if (partyOption == 'C') {
        			party.createPartyReservation();
        		} else if (partyOption == 'R') {
        			party.getPartyReservation();
        		} else if (partyOption == 'U') {
        			party.updatePartyReservation();
        		} else if (partyOption == 'D') {
        			party.deletePartyReservation();
        		}
        	case 'C':
        		System.out.println("Close");
        		break;
        	default:
        		System.out.println("Wrong choice");	
        		break;
        	}
        }
    }
}
