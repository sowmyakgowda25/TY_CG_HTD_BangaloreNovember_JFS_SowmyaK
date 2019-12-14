package customchecked;

public class AgeLimitException extends Exception{
	String msg="age limit for voting should be more than 18";

	public AgeLimitException() {
		super();
	}

	public AgeLimitException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}
}
