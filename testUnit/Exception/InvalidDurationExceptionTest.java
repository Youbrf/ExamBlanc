package Exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import index.RentedDisc;

class InvalidDurationExceptionTest {

	@Test
	void testIncalidDurationException() {
		assertThrows(InvalidDurationException.class, () -> {
			RentedDisc rdisc = new RentedDisc("Youssef",2.5F,-2);
		});
	}

}
