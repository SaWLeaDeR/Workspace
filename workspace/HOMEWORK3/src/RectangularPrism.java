
public class RectangularPrism {
	
	double height;    
    double width;
    double width2;
    
    RectangularPrism(double h, double w, double e) {
    	height = h;
    	width = w;
        width2 = e;
    }
    public double calculatevolume() {
       return (width*width2*height);
    }    
    public double calculatearea() {
       return 2*(width*height + height*width2 + width*width2);
    }
        
}
