
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sphere Spr = new Sphere(5);
       System.out.println(Spr.calculatearea());
       
       Sphere Spr1 = new Sphere(2);
       System.out.println(Spr1.calculatevolume());
       
       
       RectangularPrism Rect = new RectangularPrism(5,3,4);
       System.out.println(Rect.calculatearea());
       
       RectangularPrism Rect1 = new RectangularPrism(6,2,5);
       System.out.println(Rect1.calculatevolume());
       
       
       Cylinder Cydr = new Cylinder(5,8);
       System.out.println(Cydr.calculatevolume());
       
       Cylinder Cydr1 = new Cylinder(6,10);
       System.out.println(Cydr1.calculatearea());
       
	}

}
