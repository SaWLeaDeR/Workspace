package convert;

import java.util.HashMap;
import java.util.Map;

public class NumberToTextConverter {

	Map<Integer,String> map = new HashMap<>();
	public void addConversion(int number, String string){
	map.put(number, string);
	}
	
	public String convert(int number){
		String inmap = map.get(number);
		if(inmap != null){
			if((number == 100)   || (number == 1000) || number == 10000 )
				return map.get(1) + " " + inmap;
			return inmap;
		
		
		}else if(number < 100){
			return convert((number/10)*10) +" " +map.get(number%10);
		
		}else if(number < 1000){
			return convert(number/100) + " " + "hundred" + " " + convert(number % 100);
		}else if(number < 1000000){
			return convert(number/1000) + " tousand " + map.get(number< 1000) + " " + convert(number % 1000);
		}
		
		return "can not convert;" + number;
	}
}
