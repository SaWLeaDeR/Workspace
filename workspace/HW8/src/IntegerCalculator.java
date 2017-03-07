import java.util.Map;

public interface IntegerCalculator {

	int perform(String operand1, String operator, String operand2);
	
	Map<String, String> getOperatorDesc();
}
