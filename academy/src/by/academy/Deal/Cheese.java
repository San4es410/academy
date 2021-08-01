package by.academy.Deal;

public class Cheese extends Product {
	private int weight;
	private String mark;

	public Cheese(String name, double price, int quantity, int weight, String mark) {
		super(name, price, quantity);
		this.weight = weight;
		this.mark = mark;
	}

	public Cheese() {
		super();
	}

	public int getAge() {
		return weight;
	}

	public void setAge(int weight) {
		this.weight = weight;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		result = prime * result + weight;
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
		Cheese other = (Cheese) obj;
		if (mark == null) {
			if (other.mark != null)
				return false;
		} else if (!mark.equals(other.mark))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cheese [weight=");
		builder.append(weight);
		builder.append(", mark=");
		builder.append(mark);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double discount() {
		if (weight > 500) {
			return price * 0.2;
		} else {
			return 0.0;
		}
	}

}
