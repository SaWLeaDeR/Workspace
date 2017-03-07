package binary;

public class binary { 
	public static int binaryToInteger(String binary) {
		    char[] numbers = binary.toCharArray();
		    int result = 0;
		    
		    for(int q=numbers.length - 1; q>=0; q--){
		    	
		    	int k=1;
		    	int a=numbers.length-1-q;
		    	System.out.println("i="+q+ "   "+ "numberi      "+numbers[q]);
		    	System.out.println(result);
		        if(q==numbers.length-1 && numbers[q]=='1'){
		        	result+=1;
		        	System.out.println("result "+result);
		       
		        }else if(numbers[q]=='1'){
		        	while(a>0){
		        		k=k*2;
		        		a--;
		        		System.out.println("k        "+k+" ajýaosuasýotsaoýasýo");
		        	
		        	System.out.println(result);
		        	}result+=k;
		        	
		        
		        }
		    	
		        
		    }
		    return result;
	}
	public static void main(String[] args) {
		System.out.println(binaryToInteger("1111"));
	//	System.out.println(Integer.toBinaryString(343));
	}

}
