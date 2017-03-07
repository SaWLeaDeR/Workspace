package Entity;

public class Musteri extends Insan{
	double borc=0;
	
	
	public Musteri(String ad,String soyadý,int yas){
		this.ad=ad;
		this.soyadý=soyadý;
		this.yas=yas;
	
	}

	public String borcugetir(){
		return "borcu : " +borc;
	}
}
