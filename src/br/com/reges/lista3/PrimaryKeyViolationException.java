package br.com.reges.lista3;

public class PrimaryKeyViolationException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public PrimaryKeyViolationException(String message) {
		super(message);
	}
}
