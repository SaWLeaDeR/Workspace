package primenumbers_HW1;

public class primenumbers_HW1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub 
    	// (f=Fatih) (k=koyuncuoðlu)
    	int number; 
		for(int f=2; f<=100; f++){ 
		    number=0; 
		    for(int k=2; k<=f/2; k++){ 
		        if(f%k==0) number++; 
		        } 
		        if(number==0) System.out.println(+f); 
		    } 
		} 
    }
