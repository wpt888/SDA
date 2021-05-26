package t3_sda;

public class HexColorValidator {
	
	public boolean validate(String colorHex)
	{
		
		return colorHex.length()==7 && colorHex.matches("#[0-9[A-F]]+");
		
	}

}