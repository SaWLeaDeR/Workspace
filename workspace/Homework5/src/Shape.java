
public abstract class Shape {
	private String color;
	private boolean filled;
	
	public Shape(String color, boolean filled){
		this.color=color;
		this.filled=filled;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return true;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public abstract double getArea();
	public abstract double getperimeter();
	
	public Shape() {
		String red=null;
		color=red;
		filled=true;
	}
	
}
