package lab4p4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Selectati modul de desenare:");
		System.out.println("Automat (A)");
		System.out.println("Manual (M)");
		String option = sc.nextLine();

		List<Shape> shapes = new ArrayList<Shape>();

		if (option.toUpperCase().compareTo("A") == 0) {

			shapes.add(new Square("#000000", 3, 9));
			shapes.add(new Square("#FFFFFF", 4, 16));
			shapes.add(new Rectangle("#FD23FF", 1, 8, 3));
			shapes.add(new Rectangle("#002F3C", 1, 3, 6));
			shapes.add(new Circle("#CCC908", 1, 3));
			shapes.add(new Circle("#FDAE00", 1, 6));

		}

		else if (option.toUpperCase().compareTo("M") == 0) {

			System.out.println("Selectați forma dorită pentru creare");
			System.out.println("P pentru patrat!");
			System.out.println("D pentru dreptungi!");
			System.out.println("C pentru cerc!");
			String opt = sc.nextLine();

			switch (opt.toUpperCase()) {

			case "P":

				System.out.println("Introduceti codul hexa pentru culoare:");
				String squareColor = sc.nextLine();
				System.out.println("Introduceti lungimea:");
				int size = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti grosimea:");
				int squareBorder = Integer.parseInt(sc.nextLine());

				shapes.add(new Square(squareColor, squareBorder, size));
				break;

			case "C":
				System.out.println("Introduceti codul hexa pentru culoare:");
				String circleColor = sc.nextLine();
				System.out.println("Introduceti raza:");
				int radius = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti grosimea:");
				int circleBorder = Integer.parseInt(sc.nextLine());

				shapes.add(new Circle(circleColor, circleBorder, radius));
				break;

			case "D":
				System.out.println("Introduceti codul hexa pentru culoare:");
				String rectangleColor = sc.nextLine();
				System.out.println("Introduceti lungimea:");
				int rectangleHeight = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti latimea:");
				int rectangleWidth = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti grosimea:");
				int rectangleBorder = Integer.parseInt(sc.nextLine());

				shapes.add(new Rectangle(rectangleColor, rectangleBorder, rectangleHeight, rectangleWidth));
				break;
			}
		}

		for (Shape s : shapes) {

			System.out.println("Nume : " + s.getName());
			System.out.println("Aria : " + s.getArea());
			System.out.println("Culoarea: " + s.getHexFillColor());
			System.out.println("Grosimea: " + s.getBorderWidth());
			System.out.println("Creare . . . . ");

			s.draw();

			System.out.println();
		}

		List<String> colors = new ArrayList<>();

		for (Shape s : shapes) {
			colors.add(s.getHexFillColor());
		}

		System.out.println("Colors: " + colors);

		Set<String> mySet = new HashSet<String>(colors);
		for (String s : mySet) {
			System.out.println(s + " - " + Collections.frequency(colors, s));
		}

		sc.close();
	}
}
