package by.academy.Deal;

public class Beer extends Product {
	private String sort;
	private double alcohol;

	public Beer(String name, double price, int quantity, String sort, double alcohol) {
		super(name, price, quantity);
		this.sort = sort;
		this.alcohol = alcohol;
	}

	public Beer() {
		super();
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(alcohol);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sort == null) ? 0 : sort.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beer other = (Beer) obj;
		if (Double.doubleToLongBits(alcohol) != Double.doubleToLongBits(other.alcohol))
			return false;
		if (sort == null) {
			if (other.sort != null)
				return false;
		} else if (!sort.equals(other.sort))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Beer [sort=");
		builder.append(sort);
		builder.append(", alcohol=");
		builder.append(alcohol);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double discount() {
		if (sort.equals("light")) {
			return price * 0.15;
		} else {
			return 0.0;
		}

	}

}
