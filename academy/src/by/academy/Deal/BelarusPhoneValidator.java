package by.academy.Deal;

public class BelarusPhoneValidator implements Validator {

	@Override
	public boolean validate(String line) {
		return line.matches("[+][3][7][5]\\d{9}");
		
	}

}
