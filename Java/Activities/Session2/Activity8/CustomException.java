
public class CustomException extends Exception {

	private String message;
	
	public  CustomException(String aNewMessage){
		this.message=aNewMessage;
	}
	
	@Override
	public String getMessage() {
	    return message;
	}
}
