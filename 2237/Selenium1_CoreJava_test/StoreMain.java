package com.htc.corejava.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.htc.corejava.exam.ProductNotFoundException;
import com.htc.corejava.exam.InsufficientQuantityException;

public class StoreMain {

	public static void main(String[] args) throws ProductNotFoundException,InsufficientQuantityException {
		
		List<Product> prodList= new ArrayList<Product>();
		Stores store=new Stores();
		Product product=new Product();
					
		Product prodOne		=new Product(100,"Milk",85.00,75);
		Product prodTwo		=new Product(101,"Ghee",385.00,50);
		Product prodThree	=new Product(102,"Curd",55.00,40);
		Product prodFour	=new Product(104,"Butter",125.00,14);
		
		prodList.add(prodOne);
		prodList.add(prodTwo);
		prodList.add(prodThree);
		prodList.add(prodFour);
		
		System.out.println("Sorted by Product Price");
		
		SortProductPriceWise priceSort = new SortProductPriceWise();
		Collections.sort(prodList,priceSort);
		
		 for (Product prod: prodList)
	            System.out.println(prod.getPrice() + "  " +
	            				   prod.getProductId()+"  "+
	                               prod.getProductName() + "  " +
	                               prod.getQuantityOnHand());
		 
		
		for(Product p: prodList)
		{
			if(p.getQuantityOnHand()<=10)
			{
				p.setReorderQty(p.getReorderQty());
			}
		}
		
		try 
		{
			store.sellItem(101,5);
			
		} 
		catch (InsufficientQuantityException iqe) {
			iqe.getMessage();
			iqe.printStackTrace();
		}
		catch (ProductNotFoundException pnf) {
			pnf.getMessage();
			pnf.printStackTrace();
		}
		try {
		store.updateStock(104,product.getReorderQty());
		}	
		catch (ProductNotFoundException pnf) {
			pnf.getMessage();
			pnf.printStackTrace();
		}

	}

}
