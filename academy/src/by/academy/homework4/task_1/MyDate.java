package by.academy.homework4.task_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyDate {
	private Day day;
	private Month month;
	private Year year;
	private LocalDate date;

	public MyDate(String date) {
		if (Validator.validate(date)) {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			this.date = LocalDate.parse(date, format);
			Day day = new Day(this.date.getDayOfMonth());
			Month month = new Month(this.date.getMonthValue());
			Year year = new Year(this.date.getYear());
		} else {
			System.out.println("Введите верный формат даты");
		}
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	class Day {
		private int day;

		public Day(int day) {

			this.day = day;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Day [day=");
			builder.append(day);
			builder.append("]");
			return builder.toString();
		}

	}

	class Month {
		private int month;

		public Month(int month) {
			super();
			this.month = month;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Month [month=");
			builder.append(month);
			builder.append("]");
			return builder.toString();
		}
	}

	class Year {
		private int year;

		public Year(int year) {
			super();
			this.year = year;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Year [year=");
			builder.append(year);
			builder.append("]");
			return builder.toString();
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyDate [day=");
		builder.append(day);
		builder.append(", month=");
		builder.append(month);
		builder.append(", year=");
		builder.append(year);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}
}
