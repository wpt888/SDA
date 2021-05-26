
package t3_sda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Alegeți modul de creare:");
		System.out.println("A --> automat");
		System.out.println("M --> manual");
		String option = sc.nextLine();

		if (option.toUpperCase().compareTo("A") == 0) {

			List<Shape> shapes = new ArrayList<Shape>();

			shapes.add(new Square("#000000", 3, 9));
			shapes.add(new Square("#FFFFFF", 4, 16));
			shapes.add(new Rectangle("#FD23FF", 1, 8, 3));
			shapes.add(new Rectangle("#002F3C", 1, 3, 6));
			shapes.add(new Circle("#CCC908", 1, 3));
			shapes.add(new Circle("#FDAE00", 1, 6));

			for (Shape s : shapes) {
				System.out.println("Nume : " + s.getName());
				System.out.println("Aria : " + s.getArea());
				System.out.println("Culoarea: " + s.getHexFillColor());
				System.out.println("Grosimea: " + s.getBorderWidth());
				System.out.println("Creare . . . . ");

				s.draw();

				System.out.println();
			}

		}

		else if (option.toUpperCase().compareTo("M") == 0) {

			System.out.println("Selectați forma dorită pentru creare");
			System.out.println("P pentru patrat!");
			System.out.println("D pentru dreptungi!");
			System.out.println("C pentru cerc!");

			String opt = sc.nextLine();

			switch (opt.toUpperCase()) {
			case "P":
				System.out.println("Introduceti o culoare de forma '#000000' !");
				String squareColor = sc.nextLine();
				System.out.println("Introduceti lungimea pătratului!");
				int size = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceti grosimea conturului!");
				int squareBorder = Integer.parseInt(sc.nextLine());

				Shape s = new Square(squareColor, squareBorder, size);
				System.out.println("Shape Name : " + s.getName());
				System.out.println("Shape Area : " + s.getArea());
				System.out.println("Shape FillColor : " + s.getHexFillColor());
				System.out.println("Shape BorderWidth : " + s.getBorderWidth());
				System.out.println("Drawing . . . . ");
				s.draw();
				break;

			case "C":
				System.out.println("Introduceți o culoare de forma '#000000' !");
				String circleColor = sc.nextLine();
				System.out.println("Introduceți raza cercului!");
				int radius = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceți grosimea conturului!");
				int circleBorder = Integer.parseInt(sc.nextLine());

				Shape s1 = new Circle(circleColor, circleBorder, radius);
				System.out.println("Shape Name : " + s1.getName());
				System.out.println("Shape Area : " + s1.getArea());
				System.out.println("Shape FillColor : " + s1.getHexFillColor());
				System.out.println("Shape BorderWidth : " + s1.getBorderWidth());
				System.out.println("Drawing . . . . ");
				s1.draw();
				break;

			case "D":
				System.out.println("Introduceti o culoare de forma '#000000' !");
				String rectangleColor = sc.nextLine();
				System.out.println("Introduceti lungimea dreptunghiului!");
				int rectangleHeight = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceți lățimea dreptunghiului!");
				int rectangleWidth = Integer.parseInt(sc.nextLine());
				System.out.println("Introduceți grosimea conturului!");
				int rectangleBorder = Integer.parseInt(sc.nextLine());

				Shape s2 = new Rectangle(rectangleColor, rectangleBorder, rectangleHeight, rectangleWidth);
				System.out.println("Shape Name : " + s2.getName());
				System.out.println("Shape Area : " + s2.getArea());
				System.out.println("Shape FillColor : " + s2.getHexFillColor());
				System.out.println("Shape BorderWidth : " + s2.getBorderWidth());
				System.out.println("Drawing . . . . ");
				s2.draw();
				break;
			}

		}

		sc.close();

	}
}