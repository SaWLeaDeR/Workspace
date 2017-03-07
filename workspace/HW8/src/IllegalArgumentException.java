
public class IllegalArgumentException extends RuntimeException{
	
	public String Message="";
	
	public IllegalArgumentException(String message) {
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
