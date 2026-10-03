package real_Esate_Project;

public class Plot extends Property{

	String plotyType;
	boolean cornerPlot;
	
	public Plot() {
		
	}
	
	public Plot(int propertyId, String location, double area, double price, String status, String plotyType,
			boolean cornerPlot) {
		super(propertyId, location, area, price, status);
		this.plotyType = plotyType;
		this.cornerPlot = cornerPlot;
	}

	@Override
	public double calculatePrice() {
		if(cornerPlot == true) {
			return price + 400000;
		}
		else {
			return price;
		}
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Plot Type: " + plotyType);
		System.out.println("Corner Plot: " + cornerPlot);
		System.out.println("Final Price of Plot: " + calculatePrice());
	}
	
	
	
}
