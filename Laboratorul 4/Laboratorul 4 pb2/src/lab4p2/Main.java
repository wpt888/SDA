package lab4p2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int i;
		int n = 10;
		int[] v = new int[n];
		for (i = 0; i < n; i++) {
			v[i] = new Random().nextInt(255);
		}
		
		System.out.println("Vector inainte de modificare");
		for (i = 0; i < n; i++) {
			System.out.print(v[i] + " ");
		}

		System.out.print("\nPozitia cautata : ");
		int z = x.nextInt(); // Pozitia cautata
		
		//Parcurgere sir pana la pozitia introdusa si stergere numar
		for (i = 0; i < n; i++) {
			if (z == i) {
				for (int j = i; j < n; j++) {
					v[j - 1] = v[j]; //Stergerea
				}
			}
		}
		System.out.println("Vector dupa modificare");
		for (i = 0; i < n; i++) {
			if (i < n - 1) {
				System.out.print(v[i] + " ");
			} else {
				System.out.println("null");
			}
		}
	}
}
