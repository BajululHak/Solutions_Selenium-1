package com.htc.corejava.exam;

import java.util.Comparator;

class SortProductPriceWise implements Comparator<Product> {

	@Override
	public int compare(Product price1, Product price2) {
		if (price1.getPrice() < price2.getPrice())
			return -1;
		if (price1.getPrice() > price2.getPrice())
			return 1;
		else
			return 0;
		
	}

}
