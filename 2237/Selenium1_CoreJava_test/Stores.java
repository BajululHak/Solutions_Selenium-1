package com.htc.corejava.exam;

import java.util.ArrayList;
import java.util.List;

import com.htc.corejava.exam.ProductNotFoundException;
import com.htc.corejava.exam.InsufficientQuantityException;

public class Stores {

	
	
	private List<Product> listOfProduct = new ArrayList<Product>();
	Product prod=new Product();
	
	public Stores(List<Product> listOfProduct)
	 {
		 this.setListOfProduct(listOfProduct);
	 }

	
	public Stores() {
		super();
	}

	public double sellItem(int productCode, int qtyRequired) throws ProductNotFoundException,InsufficientQuantityException
	{
		double totalPrice = 0;
		for (Product prod : listOfProduct) {
		//	System.out.println(prod.getProductName());
		if(prod.getProductId() == productCode)
			{
				if(prod.getQuantityOnHand()>= qtyRequired)
					{
						totalPrice=qtyRequired*prod.getPrice();
						System.out.println("Purchase Order is made for the Product :" + prod.getProductName());
					}
				else if (prod.getQuantityOnHand()<=qtyRequired)
				{
					prod.getReorderLevel();
					System.out.println("Raise Order is Made for the Product:" + prod.getProductName());
					throw new InsufficientQuantityException();
				}
			}
		else
		{
			throw new ProductNotFoundException();
		}
		}
		return totalPrice;
		
	}
	public void updateStock(int productCode, int arrivedQty) throws ProductNotFoundException
	{
		Boolean item_found=false;
		for (Product prod:listOfProduct){
		
			if(prod.getProductId()==productCode)
			{
				prod.setQuantityOnHand(prod.getQuantityOnHand()+arrivedQty);
				System.out.println("Product Arrived and its added in the System");
				item_found=true;
			}
		}
		if (item_found == false)
		{
			throw new ProductNotFoundException();
		}
	}


	public List<Product> getListOfProduct() {
		return listOfProduct;
	}


	public void setListOfProduct(List<Product> listOfProduct) {
		this.listOfProduct = listOfProduct;
	}

}
