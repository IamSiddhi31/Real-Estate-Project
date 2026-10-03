package real_Esate_Project;

public class CommercialProperty extends Property{

	String bussinessType;
	int parkingSpaces;
	
	public CommercialProperty() {

	}
	
	public CommercialProperty(int propertyId, String location, double area, double price, String status,
			String bussinessType, int parkingSpaces) {
		super(propertyId, location, area, price, status);
		this.bussinessType = bussinessType;
		this.parkingSpaces = parkingSpaces;
	}

	@Override
	public double calculatePrice() {
		if(area > 2000) {
			return price + 900000;
		}
		else {
			return price;
		}
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Business Type: " + bussinessType);
		System.out.println("Praking Space: "+ parkingSpaces);
		System.out.println("Final Price of Office: " + calculatePrice());
	}
	
	
}
