
public class ArithmeticException extends RuntimeException{

	public String Message="";
	
		public ArithmeticException(String message) {
			Message = message;
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		/**
		 * 
		 */
	

		public String getMessage()
		{
			return Message;	
		}
	
}
