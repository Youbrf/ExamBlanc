package Exception;

public class InvalidDurationException extends RuntimeException {
	
	private static final long serialVersionUID = -5767803237140828554L;

	public InvalidDurationException() {
		super("Durée incorrecte. La durée de location ne peut pas être négative.");
	}
}
