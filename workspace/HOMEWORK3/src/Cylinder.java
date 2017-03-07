
public class Cylinder {

	double radius;
	double height;
	
	Cylinder(double r, double h) {
        radius = r;
    	height = h;	   
	}
	public double calculatevolume() {
	       return 3.14 * radius * radius * height;
	       
	}       
	public double calculatearea() {
	       return 2 * 3.14 * radius * height;
	       
	}

}

	
