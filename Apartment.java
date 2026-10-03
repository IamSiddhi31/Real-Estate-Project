package real_Esate_Project;

public class Apartment extends Property{

	int roomsNo;
	int floorNo;
	
	public Apartment() {

	}
	
	public Apartment(int propertyId, String location, double area, double price, String status, int roomsNo,
			int floorNo) {
		super(propertyId, location, area, price, status);
		this.roomsNo = roomsNo;
		this.floorNo = floorNo;
	}
	@Override
	public double calculatePrice() {
		if(roomsNo >= 3) {
			return price + 500000;
		}
		else {
			return price;
		}
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("No of Rooms: " + roomsNo);
		System.out.println("No of Floor: " + floorNo);
		System.out.println("Final Price of Apartment: " + calculatePrice());
	}
	
	
	
}
