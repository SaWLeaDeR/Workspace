package Entity;

public class Musteri extends Insan{
	double borc=0;
	
	
	public Musteri(String ad,String soyad�,int yas){
		this.ad=ad;
		this.soyad�=soyad�;
		this.yas=yas;
	
	}

	public String borcugetir(){
		return "borcu : " +borc;
	}
}
