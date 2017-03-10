
public class Circle extends Shape {

	private double radius;
	
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double getperimeter() {
	
		return 2*Math.PI*radius;
	}

	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "A Circle with radius = " + getArea() + ", getperimeter()=" + getperimeter() + "]";
	}

	
    
}
