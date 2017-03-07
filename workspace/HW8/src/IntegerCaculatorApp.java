import java.util.Iterator;
import java.util.Scanner;

public class IntegerCaculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntegerCalculator calc = new IntegerCalculatorImpl();
		
		System.out.println("Welcome to Integer Calculator! You can use the following operators.");
		
		
		Iterator<String> itr = calc.getOperatorDesc().keySet().iterator();
		
		
		while (itr.hasNext()){
		String operator = itr.next();
		System.out.println(operator + " " + calc.getOperatorDesc().get(operator));
		
		}
		
		boolean exit = false;
		
		Scanner scan = new Scanner(System.in);
		
		while (!exit){
		
			System.out.println();
			System.out.print("Enter first operand: ");
			String operand1 = scan.nextLine();
			System.out.print("Enter operator: ");
			String oper = scan.nextLine();
			System.out.print("Enter second operand: ");
			String operand2 = scan.nextLine();
		
			try{
		
				int result = calc.perform(operand1,oper,operand2);
		
				System.out.println("Result: " +result);
		
			}catch(OverflowException ex){
		
				System.out.println("Overflow: " + ex.getMessage());
		
			}catch(IllegalArgumentException | ArithmeticException ex){
		
				System.out.println("Error: " + ex.getMessage());
		
			}
		}

		scan.close();
		
	}
	
}


