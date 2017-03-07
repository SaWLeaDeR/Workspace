
public class BinaryConverter {
	public static String IntToBinary(String value){
		int v=Integer.parseInt(value);
		String s = "";
	    while (v > 0){
	        s =  ( (v % 2 ) == 0 ? "0" : "1") +s;
	        v = v / 2;
	    }
	    return s;
	}
	public static int BinaryToInteger(String value){
		char[] numbers = value.toCharArray();
	    int result = 0;
	    for(int q=numbers.length - 1; q>=0; q--){
	    	int k=1;
	    	int a=numbers.length-1-q;
	        if(q==numbers.length-1 && numbers[q]=='1'){
	        	result+=1;
	        }else if(numbers[q]=='1'){
	        	while(a>0){
	        		k=k*2;
	        		a--;
	        	}result+=k;
	        }
	    }
	    return result;	
		}
	public static void main(String[] args) {
		int value =Integer.parseInt(args[1]);
		String k=args[0];
		if(k.equals("b2i")){
			System.out.println(BinaryToInteger(args[1]));
		}else if (k.equals("i2b")){
			System.out.println(Integer.toBinaryString(value));
		}
	}
}
