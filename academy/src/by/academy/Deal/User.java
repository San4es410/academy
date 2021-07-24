package by.academy.Deal;

import java.util.Objects;

public class User {
	private String name;
	private int money;

	public User(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public int hashCode() {
		return Objects.hash(money, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		User other = (User) obj;
		return money == other.money && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", money=");
		builder.append(money);
		builder.append("]");
		return builder.toString();
	}

}
