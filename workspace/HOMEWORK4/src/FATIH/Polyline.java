package FATIH;


import java.util.ArrayList;




public class Polyline {

	private ArrayList<Point> liste;
	
	public Polyline(ArrayList<Point> liste){
		this.liste=liste;
	}	
		
	public void printList(){
		
		for(int i=0;i<liste.size();i++){
			System.out.println("Point"+i+":x= "+liste.get(i).getX()+"// y="+liste.get(i).getY());
		}
		
	}
	
	public void addPoint(Point  point){
		liste.add(point);
		
	}
	public void addPointwithindex(Point point,int index){
		liste.add(index,point);
	}
    
    public void removePoint(int index){
	    liste.remove(index);
    }
	    
	public void addLine(Line line){
		liste.add(0,line.getBaşlangıç());
		liste.add(0,line.getBitiş());
    }


	public int sizeList(){
		return liste.size();
	}

}

