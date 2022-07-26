package com.bilgeadam.lesson024.okulYonetim;

public class IsımException extends RuntimeException {

	String msj;

	public IsımException() {
		// TODO Auto-generated constructor stub
	}

	public IsımException(String msj) {
		super();
		this.msj = msj;
	}

	public String getMsj() {
		return msj;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return getMsj();
	}

}
