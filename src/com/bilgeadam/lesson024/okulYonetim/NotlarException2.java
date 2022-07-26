package com.bilgeadam.lesson024.okulYonetim;

public class NotlarException2 extends Exception {

	String msj;

	public NotlarException2() {
		// TODO Auto-generated constructor stub
	}

	public NotlarException2(String msj) {
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
