package com.bilgeadam.lesson024;

public class EksiDegerException extends RuntimeException {

	String msj;

	public EksiDegerException() {
		// TODO Auto-generated constructor stub
	}

	public EksiDegerException(String msj) {
		super();
		this.msj = msj;
	}

	public String getMsj() {
		return msj;
	}

	@Override
	public String getMessage() {

		return msj;
	}

}
