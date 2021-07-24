package by.academy.Deal;

public class Application {

	public static void main(String[] args) {
		Deal deal = new Deal();
		User seller = new User();
		User buyer = new User();
		Product[] products = new Product[3];
		
		products[0] = new Vino("Autumn", 20.0, 5, "Red", 2000);
		products[1] = new Cheese("Rocfor", 40, 2, 2019, "hard");
		products[2] = new Vino("Magic", 50, 3, "White", 1995);
		
		deal.setBuyer(buyer);
		deal.setSeller(seller);
	}

}
