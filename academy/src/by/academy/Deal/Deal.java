package by.academy.Deal;

import javax.xml.crypto.Data;

public class Deal {
	private Product products[];
	private User seller;
	private User buyer;
	Data dealDate;

	public Deal(Product[] products, User seller, User buyer, Data dealDate) {
		super();
		this.products = products;
		this.seller = seller;
		this.buyer = buyer;
		this.dealDate = dealDate;
	}
	
	public Deal() {
		super();
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}
	
	public Data getDealDate() {
		return dealDate;
	}
	
	public void setDealDate(Data dealdate) {
		this.dealDate = dealdate;
	}
	
	public double countFullPrice() {
		double sum = 0;
		for (int i = 0; i < products.length; i++) {
			sum += products[i].countPrice();			
		}
		return sum;
	}

}
