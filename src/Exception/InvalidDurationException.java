package Exception;

public class InvalidDurationException extends RuntimeException {
	
	private static final long serialVersionUID = -5767803237140828554L;

	public InvalidDurationException() {
		super("Dur�e incorrecte. La dur�e de location ne peut pas �tre n�gative.");
	}
}
