package by.academy.Deal;

import java.util.Objects;

public class Cheese extends Product {
	private int age;
	private String mark;

	public Cheese(String name, double price, int quantity, int age, String mark) {
		super(name, price, quantity);
		this.age = age;
		this.mark = mark;
	}

	public Cheese() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
		result = prime * result + Objects.hash(age, mark);
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
		Cheese other = (Cheese) obj;
		return age == other.age && Objects.equals(mark, other.mark);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cheese [age=");
		builder.append(age);
		builder.append(", mark=");
		builder.append(mark);
		builder.append("]");
		return builder.toString();
	}

	protected double discount() {
		if (age < 2018) {
			return price * 0.2;
		} else {
			return 0.0;
		}
	}
}
