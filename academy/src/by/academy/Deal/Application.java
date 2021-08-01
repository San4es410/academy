package by.academy.Deal;

public class Application {

	public static void main(String[] args) {
		Deal deal = new Deal();
		User seller = new User();
		User buyer = new User();
		Product[] products = new Product[3];
		
		products[0] = new Wine("Autumn", 60.0, 5, "Red", 2000);
		products[1] = new Cheese("Rocfor", 40, 2, 2019, "Hard");
		products[2] = new Beer("Hunt", 25, 3, "Dark", 8.5);
		
		deal.setBuyer(buyer);
		deal.setSeller(seller);
	}

}
