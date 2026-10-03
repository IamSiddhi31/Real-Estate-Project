package real_Esate_Project;

public class Property {

	private int propertyId;
	private String location;
	protected double area;
	
	protected double price;
	protected String status;
	
    static int totalProperties = 0;

    final String COMPANY_NAME = "Smart Real Estate";
    final double REGISTRATION_CHARGE = 50000;

    public Property() {

    }

	public Property(int propertyId, String location, double area, double price, String status) {
		this.propertyId = propertyId;
		this.location = location;
		this.area = area;
		this.price = price;
		this.status = "Available";
		
		totalProperties ++;
	}
	
	public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public double calculatePrice() {
        return price;
    }
	
    public void displayDetails() {

        System.out.println("Property ID: " + propertyId);
        System.out.println("Location: " + location);
        System.out.println("Area: " + area + " sq.ft");
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }
    
    
}
