package Demo;
import java.util.ArrayList;
import FATIH.*;
public class PolylineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Point p1=new Point(4,5);
	    Point p2=new Point(7,9);
		Point p3=new Point(3,5);
		Point p4=new Point(2,8);
		Point p5=new Point(1,2);
		Point p6=new Point(4,2);
		Point p7=new Point(5,3);
			
		Line  l1=new Line(p4,p2);
		ArrayList<Point> list=new ArrayList<Point>();
		list.add(p3);
		list.add(p1);
		list.add(p5);
		Polyline polyline1=new Polyline(list);
		polyline1.addPoint(p7);
		polyline1.addLine(l1);
		polyline1.addPointwithindex(p6,0);
		polyline1.removePoint(polyline1.sizeList()-1);
		polyline1.printList();
			

	}
}

