package real_Esate_Project;

public class Villa extends Property{

	int rooms;
	boolean swimmingPool;
	
	public Villa() {

	}
	
	public Villa(int propertyId, String location, double area, double price, String status, int rooms,
			boolean swimmingPool) {
		super(propertyId, location, area, price, status);
		this.rooms = rooms;
		this.swimmingPool = swimmingPool;
	}
	@Override
	public double calculatePrice() {
		if(swimmingPool == true) {
			return price + 1000000;
		}
		else {
			return price;
		}
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("No of Rooms: " + rooms);
		System.out.println("Swmming Pool: " + swimmingPool);
		System.out.println("Final Price of villa:" + calculatePrice());
	}
	
	
}
