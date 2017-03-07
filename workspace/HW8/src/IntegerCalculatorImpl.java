import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class IntegerCalculatorImpl<T> implements IntegerCalculator{

	
	@Override
	public int perform(String operand1, String operator, String operand2) throws OverflowException {		
		
		if (operand1.length()>12||operand2.length()>12) {
			throw new OverflowException(operand1+" "+operator+" "+operand2+" can not be represented by Integer");
		}
		int a = 0;
		int b = 0;
		
		try{
			 a = Integer.parseInt(operand1);
		}
		
		catch(Exception ex1){
			
			throw new IllegalArgumentException(operand1+" is not a valid Integer");
		}
		
		try{
		
			b = Integer.parseInt(operand2);
		
		}
		
		catch(Exception ex){
		
			throw new IllegalArgumentException(operand2+" is not a valid Integer");
		
		}
		
		if (Long.parseLong(operand2)<-2147483647||
				Long.parseLong(operand1)<-2147483647||
				Long.parseLong(operand1)>2147483647 || 
				Long.parseLong(operand2)>2147483647 ) {
			
		
			throw new OverflowException(operand1+" "+operator+" "+operand2+" can not be represented by Integer");
		
		}
		
	
		boolean c = false;
		
		
		long result=0;
		
		switch (operator) {
			case "/":
				if (b==0)
					throw new IllegalArgumentException("/ by zero");
				
				result = Long.parseLong(operand1) /Long.parseLong(operand2) ;
					break;
			case "*":
				result = Long.parseLong(operand1)*Long.parseLong(operand2);
				break;
			case "-":
				result = Long.parseLong(operand1)-Long.parseLong(operand2);	
				break;
			case "+":
				result = Long.parseLong(operand1)+Long.parseLong(operand2);
				break;
			case "%":
				if (b==0) {
					throw new IllegalArgumentException("/ by zero");
				}
				result = Long.parseLong(operand1)%Long.parseLong(operand2);
				
				break;
				
				default:	
					c=true;
					break;
	}
		
		if (c) {
		
			throw new ArithmeticException(operator+" is not a valid Operator");
		
		}
		
		if (result>2147483647) {
		
			throw new OverflowException(operand1+" "+operator+" "+operand2+" can not be represented by Integer");
		
		}
		
		if (result<-2147483647) {
		
			throw new OverflowException(operand1+" "+operator+" "+operand2+" can not be represented by Integer");
		
		}
		
		return Integer.parseInt( result +"");
	}

	
	
	public Map<String, String> getOperatorDesc() {
		Map<String, String> ope1 = new LinkedHashMap<String, String>();
		
		List<String> a =new ArrayList<>(Arrays.asList("+","Calculates the sum of the given operands"));
		List<String> b =new ArrayList<>(Arrays.asList("-","- Subtracts the second operand from the first one"));
		List<String> c =new ArrayList<>(Arrays.asList("*", "Multiplies the operands"));
		List<String> d =new ArrayList<>(Arrays.asList("/", "Divides the first operand by the second one"));
		List<String> e =new ArrayList<>(Arrays.asList("%", "Finds the remainder after division of first operand by second one"));
		List<T> f =new ArrayList<>();
		

			f.add((T) a);
			f.add((T) b);
			f.add((T) c);
			f.add((T) d);
			f.add((T) e);

		System.out.println(f);
		return ope1;
		
	

	
	}

	

}
