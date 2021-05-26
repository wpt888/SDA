package lab4p4;

public class HexColorValidator {

	public boolean validate(String colorHex) {

		return colorHex.length() == 7 && colorHex.matches("#[0-9[A-F]]+");

	}
}
