package real_Esate_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoProperty {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<Property> properties = new ArrayList<>();

		properties.add(new Apartment(101, "Pune", 1200, 6500000, "Available", 4, 3));

		properties.add(new Villa(203, "Goa", 3000, 15000000, "Available", 5, true));

		properties.add(new CommercialProperty(306, "Mumbai", 2000, 2000000, "Available", "Office", 10));

		properties.add(new Plot(405, "Pune", 5000, 2000000, "Available", "Residentail", true));

		int choice;

		while (true) {

			System.out.println("\n=================================");
			System.out.println("   REAL ESTATE MANAGEMENT SYSTEM");
			System.out.println("=================================");

			System.out.println("1. Display All Properties");
			System.out.println("2. Search Property");
			System.out.println("3. Buy Property");
			System.out.println("4. Display Total Properties");
			System.out.println("5. Display Available Properties");
			System.out.println("6. Exit");
			
			System.out.println("\n\nEnter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\nAll Properties: ");
				for (int i = 0; i <= properties.size()-1; i++) {
					properties.get(i).displayDetails();
					System.out.println("\n---------------------------------------");
				}
				break;

			case 2:
				System.out.print("\nEnter Property ID to search: ");				
				int searchId = sc.nextInt();
				boolean found = false;
				for (int i = 0; i <= properties.size()-1; i++) {
					if (properties.get(i).getPropertyId() == searchId) {
						System.out.println("\nProperty found");
						properties.get(i).displayDetails();
						found = true;
					}
					if (found == false) {
						System.err.println("\nProperty not found...");
					}
				}
				break;

			case 3:
			    System.out.print("\nEnter Property ID to buy: ");
			    int buyId = sc.nextInt();

			    boolean propertyFound = false;

			    for (int i = 0; i < properties.size(); i++) {

			        if (properties.get(i).getPropertyId() == buyId) {

			            propertyFound = true;

			            if (properties.get(i).getStatus().equals("Available")) {

			                properties.get(i).setStatus("Sold");

			                double finalPrice = properties.get(i).calculatePrice();

			                System.out.println("\nProperty purchased successfully.");

			                System.out.println("Property ID: " + properties.get(i).getPropertyId());

			                System.out.println("Location: " + properties.get(i).getLocation());

			                System.out.println("Property Price: " + finalPrice);

			                System.out.println("Registration Charge: " + properties.get(i).REGISTRATION_CHARGE);

			                System.out.println("Total Amount: " + (finalPrice + properties.get(i).REGISTRATION_CHARGE));

			            } else {

			                System.out.println("Property is already sold.");
			            }

			            break;
			        }
			    }

			    if (propertyFound == false) {

			        System.out.println("Property not found.");
			    }

			    break;
                     

			case 4:
				System.out.println("\nTotal Properties: ");
				System.out.println("\nTotal Properties: " + Property.totalProperties);

				break;

			case 5:
				System.out.println("\nAVAILABLE PROPERTIES");

				for (int i = 0; i < properties.size(); i++) {

					if (properties.get(i).getStatus().equals("Available")) {

						properties.get(i).displayDetails();
					}
					System.out.println("\n---------------------------------");
				}
				break;

			case 6:
				System.out.println("\nExit: ");
				System.out.println("\nThank you for using " + "Real Estate Management System.");

				sc.close();
				return;

			default:

				System.out.println("Invalid choice.");
			}

		}
	}
}
		