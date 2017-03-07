package main.shapes;

import java.util.ArrayList;
import java.util.List;

import Fatih.shapes.Circle;

public class main {

	public static void main(String[] args) {
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle(6);
		Circle circle3 = new Circle(7);
		
		
		List<Circle> list = new ArrayList<>();
		
		list.add(0, circle1);
		list.add(1, circle2);
		list.add(2, circle3);
		
		for (int i=0;  i<list.size(); i++) {
			Circle circle =(list.get(i);
			System.out.println(i + );
		}

	}

}
