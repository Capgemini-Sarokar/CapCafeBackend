package com.capgemini.capcafe.helpdesk.exception;

/**
 * Exception for Order Not Found Condition
 * @author Anwesha Das
 */
public class HelpdeskException extends Exception{

	public HelpdeskException() {
		super();
	}

	public HelpdeskException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public HelpdeskException(String message, Throwable cause) {
		super(message, cause);
	}

	public HelpdeskException(String message) {
		super(message);
	}

	public HelpdeskException(Throwable cause) {
		super(cause);
	}
}
	