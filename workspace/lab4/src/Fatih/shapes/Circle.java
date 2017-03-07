package Fatih.shapes;

public class Circle {

	private double radius;
	public final static double pi = 3.14;
	public void Circle(double r) {
		this.radius = r;
	
	}	
		
	public double calculatearea() {
		double area;
	    area = pi * radius * radius;
	    return area;
	     
	    		 
	}
	
}
