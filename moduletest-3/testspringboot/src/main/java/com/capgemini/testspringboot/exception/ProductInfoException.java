package com.capgemini.testspringboot.exception;

public class ProductInfoException extends RuntimeException {
	
	String msg;
	
	public ProductInfoException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
	

}
