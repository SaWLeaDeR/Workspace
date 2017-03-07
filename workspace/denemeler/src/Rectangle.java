
public class Rectangle extends Shape{

	private double width;
	private double length;
	
	
	public Rectangle(String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}
		public Rectangle() {
	// TODO Auto-generated constructor stub
				}
	public Rectangle(double width,double length ,String color, boolean filled) {
		super(color, filled);
		this.width=width;
		this.length=length;
		
		
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*length;
	}

	@Override
	public double getperimeter() {
		// TODO Auto-generated method stub
		return 2*width+2*length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle Area= " + getArea() + ", perimeter= " + getperimeter() + "";
	}
	

}
