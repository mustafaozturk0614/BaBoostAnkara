package com.bilgeadam.lesson024.okulYonetim;

public class OgrenciException extends RuntimeException {

	String msj;

	public OgrenciException() {
		// TODO Auto-generated constructor stub
	}

	public OgrenciException(String msj) {
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
