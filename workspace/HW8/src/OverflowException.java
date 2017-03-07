
public class OverflowException extends RuntimeException {
	private String Message="";
	
		public OverflowException(String message) {
			Message = message;
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		/**
		 * 
		 */
	

		public String getMessage(){
			
			return Message;	
		
		}

}
