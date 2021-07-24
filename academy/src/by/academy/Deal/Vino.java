package by.academy.Deal;

import java.util.Objects;

public class Vino extends Product {
	private String sort;
	private int year;

	public Vino(String name, double price, int quantity, String sort, int year) {
		super(name, price, quantity);
		this.sort = sort;
		this.year = year;
	}
	
	public Vino() {
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
		result = prime * result + Objects.hash(sort, year);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Vino other = (Vino) obj;
		return Objects.equals(sort, other.sort) && year == other.year;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vino [sort=");
		builder.append(sort);
		builder.append(", year=");
		builder.append(year);
		builder.append("]");
		return builder.toString();
	}
	
	protected double discount() {
		if (year > 2005) {
			return price * 0.2;
		} else {
			return 0.0;
		}
	}

}
