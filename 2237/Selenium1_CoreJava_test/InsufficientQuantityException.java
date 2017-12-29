package com.htc.corejava.exam;

@SuppressWarnings("serial")
public class InsufficientQuantityException extends Exception{
	

	String errorMsg="In Sufficient Quantity !!";

	public InsufficientQuantityException() {
		super();
		
	}

	public InsufficientQuantityException(String lessQty) {
		super(lessQty);
		
	}

	@Override
	public String getMessage() {
		
		return errorMsg;
	}

}