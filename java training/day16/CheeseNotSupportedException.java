public class CheeseNotSupportedException extends  RuntimeException{

	public CheeseNotSupportedException(){
	}

	public CheeseNotSupportedException(String message){
		super(message);
	}
}