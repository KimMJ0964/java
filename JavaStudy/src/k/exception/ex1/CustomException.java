package k.exception.ex1;

public class CustomException extends RuntimeException{
	
	public CustomException() {}
	
	public CustomException(String message) {
		super(message);
	}
}
