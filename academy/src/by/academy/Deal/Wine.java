package by.academy.Deal;

public class Wine extends Product {
	private String sort;
	private int year;

	public Wine(String name, double price, int quantity, String sort, int year) {
		super(name, price, quantity);
		this.sort = sort;
		this.year = year;
	}

	public Wine() {
		super();
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((sort == null) ? 0 : sort.hashCode());
		result = prime * result + year;
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
		Wine other = (Wine) obj;
		if (sort == null) {
			if (other.sort != null)
				return false;
		} else if (!sort.equals(other.sort))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wine [sort=");
		builder.append(sort);
		builder.append(", year=");
		builder.append(year);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double discount() {
		if (year > 2010) {
			return price * 0.25;
		} else {
			return 0.0;
		}

	}

}
