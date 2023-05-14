package spring.core.session07.tx.exception;

public class InsufficientStock extends Exception {
	public InsufficientStock(String message) {
		super(message);
	}
}
