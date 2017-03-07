
public class Sphere {
	
     double radius;
     Sphere(double r){
    	 radius = r;
     }
     
     public double calculatevolume() {
            return 4/3 * 3.14 * radius * radius * radius;
     }    
        
     public double calculatearea() {
            return (4 * 3.14* radius * radius);
     }
        
}
