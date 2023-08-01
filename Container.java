package container;

public class Container {

	private String name;
	private double length;
	private double width;
	private double height;
	private double cost;
	private double capacity;
	



      public Container(String name, double length, double width, double height, double cost, double capacity) {
		super();
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
		this.cost = cost;
		this.capacity = 0;
	}

      
      










	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public double getLength() {
		return length;
	}






	public void setLength(double length) {
		this.length = length;
	}






	public double getWidth() {
		return width;
	}






	public void setWidth(double width) {
		this.width = width;
	}






	public double getHeight() {
		return height;
	}






	public void setHeight(double height) {
		this.height = height;
	}






	public double getCost() {
		return cost;
	}






	public void setCost(double cost) {
		this.cost = cost;
	}






	public double getCapacity() {
		return capacity;
	}






	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}








		// method
		public double Volume() {
			
			return height*width*length;
		}
		
	
		
	
	
	
}
