package FATIH;


public class Line {
	private Point Baþlangýç;
	private Point Bitiþ;
	
	public Line(Point  Baþlangýç,Point  Bitiþ){
		this.Baþlangýç=Baþlangýç;
		this.Baþlangýç=Baþlangýç;
	}
	public Point getBaþlangýç(){
		return Baþlangýç;
	
	}
	public Point getBitiþ() {
		return Bitiþ;
	
	}
   
	public void yazdýr(Point point){
    	System.out.println("X= "+point.getX()+"\f"+"Y= "+point.getY());
    }
	
}	
