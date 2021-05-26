package t3_sda;

public class Square implements Shape {

	private String fillColor;
	private int borderWidth;
	private int size;
	private HexColorValidator valid = new HexColorValidator();
	
	public Square(String fillColor,int borderWidth,int size) {
		setFillColor(fillColor);
		setBorderWidth(borderWidth);
		setSize(size);
	}
	

	
	public void setFillColor(String fillColor) {
			
				if(valid.validate(fillColor))
					this.fillColor = fillColor;
				else
			throw new IllegalArgumentException("Cod hexa invalid pentru culoare");
			
		
			
		
	}
	
	public int getBorderWidth() {
		return borderWidth;
	}
	
	public void setBorderWidth(int borderWidth) {
		if(borderWidth>0)
		this.borderWidth = borderWidth;
		else
			throw new IllegalArgumentException("Grosimea marginii trebuie sa fie o valoare pozitivă!");
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		
		if(size>0)
		this.size = size;
		else
			throw new IllegalArgumentException("Mărimea trebuie să fie o valoare pozitivă!");
		
	}

	
	@Override
	public double getArea() {
		
		return size*size;
	}

	@Override
	public String getName() {
		return "Square";
	}

	@Override
	public String getHexFillColor() {
		
		return fillColor;
	}
	
	@Override
	public void draw() {
		int i,j;
		for(i=0;i<size;i++)
		{
			
			for(j=0;j<size;j++) {
			 
			if(i==0 || i== size-1 || j==0 || j== size-1)
			
				
				System.out.print("* ");
			else
				System.out.print("  ");
			
			

			}	
			
			
			System.out.println();
		}
		
	}
	
	
	
}