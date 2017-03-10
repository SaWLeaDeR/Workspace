package ozgur.shapes;

public class Circlelab {
	
	private double radius;
	private static final double pi = 3.14;
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double calculateArea(){
		double area;
		area = pi * radius * radius;
		return area;
		
	}
}
