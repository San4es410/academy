package by.academy.Deal;

import java.util.Calendar;
import java.util.Date;

public class Deal {
	private Product[] products;
	private User seller;
	private User buyer;
	private Calendar dealDate;
	private Calendar deadLineDate;

	public Deal(Product[] products, User seller, User buyer, Calendar dealDate) {
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

	public Calendar getDealDate() {
		return dealDate;
	}

	public void setDealDate(Calendar dealdate) {
		this.dealDate = dealdate;
	}

	public Calendar getDeadLineDate() {
		Calendar calendar = Calendar.getInstance();
		return calendar.add(Calendar.DAY_OF_MONTH, 10);
	}

	public void setDeadLineDate(Calendar deadLineDate) {
		this.deadLineDate = deadLineDate;
	}

	public double countFullPrice() {
		double sum = 0;
		for (int i = 0; i < products.length; i++) {
			sum += products[i].countPrice();
		}
		return sum;
	}

}
