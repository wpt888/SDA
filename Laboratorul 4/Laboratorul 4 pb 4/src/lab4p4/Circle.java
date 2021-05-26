package lab4p4;

public class Circle implements Shape {

	private String fillColor;
	private int borderWidth;
	private int radius;
	private HexColorValidator valid = new HexColorValidator();

	public Circle(String fillColor, int borderWidth, int radius) {

		setBorderWidth(borderWidth);
		setFillColor(fillColor);
		setRadius(radius);
	}

	public void setFillColor(String fillColor) {

		if (valid.validate(fillColor))
			this.fillColor = fillColor;
		else
			throw new IllegalArgumentException("Invalid hex code.r");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if (radius > 0)
			this.radius = radius;
		else
			throw new IllegalArgumentException("Invalid Radius.");
	}

	public void setBorderWidth(int borderWidth) {

		if (borderWidth > 0)
			this.borderWidth = borderWidth;
		else
			throw new IllegalArgumentException("Invalid borderWidth.");
	}

	public void draw() {

		double dist;

		for (int i = 0; i <= 2 * radius; i++) {
			for (int j = 0; j <= 2 * radius; j++) {
				dist = Math.sqrt(Math.pow(i - radius, 2) + Math.pow(j - radius, 2));

				if (dist > radius - 0.5 && dist < radius + 0.5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

	@Override
	public double getArea() {

		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String getName() {

		return "Circle";
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