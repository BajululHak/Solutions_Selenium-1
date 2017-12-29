package com.htc.corejava.exam;

@SuppressWarnings("serial")
public class ProductNotFoundException extends Exception{
	

	String errorMsg="Product Not Found !!";

	public ProductNotFoundException() {
		super();
		
	}

	public ProductNotFoundException(String notFound) {
		super(notFound);
		
	}

	@Override
	public String getMessage() {
		
		return errorMsg;
	}

}