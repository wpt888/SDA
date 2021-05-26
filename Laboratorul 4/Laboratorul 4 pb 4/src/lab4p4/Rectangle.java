package lab4p4;

public class Rectangle implements Shape {

	private String fillColor;
	private int borderWidth;
	private int height, width;

	private HexColorValidator valid = new HexColorValidator();

	public Rectangle(String fillColor, int borderWidth, int height, int width) {

		setBorderWidth(borderWidth);
		setFillColor(fillColor);
		setHeight(height);
		setWidth(width);
	}

	public void setFillColor(String fillColor) {
		if (valid.validate(fillColor))
			this.fillColor = fillColor;
		else
			throw new IllegalArgumentException("Invalid hex code.");
	}

	public void setBorderWidth(int borderWidth) {

		if (borderWidth > 0)
			this.borderWidth = borderWidth;
		else
			throw new IllegalArgumentException("Invalid borderWidth.");
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height > 0)
			this.height = height;
		else
			throw new IllegalArgumentException("Invalid Height.");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {

		if (width > 0)
			this.width = width;
		else
			throw new IllegalArgumentException("Invalid Width.");
	}

	@Override
	public void draw() {
		int i, j;

		for (i = 0; i < width; i++) {

			for (j = 0; j < height; j++) {
				if (i == 0 || i == width - 1 || j == 0 || j == height - 1)

					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	@Override
	public double getArea() {

		return height * width;
	}

	@Override
	public String getName() {

		return "Rectangle";
	}

	@Override
	public String getHexFillColor() {

		return fillColor;
	}

	@Override
	public int getBorderWidth() {

		return borderWidth;
	}
}
