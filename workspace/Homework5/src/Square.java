
public class Square extends Rectangle{
    
    
    public Square(double side) {
		super();
    	super.setLength(side);
		

	}
	public Square(double side , String color, boolean filled) {
		super(color,filled);
		super.setLength(side);
		super.setWidth(side);

	}


	public String toString() {
		return "a Square with side= " +super.getLength()+" which is a subclass of =" +super.toString(); 
	}
	
	
	
    
}
