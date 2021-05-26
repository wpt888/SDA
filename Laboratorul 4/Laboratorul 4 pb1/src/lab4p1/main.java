package lab4p1;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int i;
		int n = 10;
		int[] v = new int[n];
		for (i = 0; i < n; i++) {
			v[i] = new Random().nextInt(255);
		}

		System.out.print("Pozitia cautata : ");
		int z = x.nextInt(); // Pozitia cautata
		System.out.print("Numarul de adaugat : ");
		int a = x.nextInt(); // Numarul de adaugat
		System.out.println("Vector inainte de modificare");
		for (i = 0; i < n; i++) {
			System.out.println(v[i] + " ");
		}
		n = n + 1;
		v = Arrays.copyOf(v, v.length + 1);
		
		//Parcurge sir pana la pozitia introdusa si adaugare numar
		for (int j = n - 1; j > 0; j--) {
			v[j] = v[j - 1]; 
			if (z == j) {
				v[j] = a; //Adaugarea numarului introdus la pozitia aleasa
				break;
			}
		}

		System.out.println("Vector dupa modificare");
		for (i = 0; i < n; i++) {
			System.out.println(v[i] + " ");
		}
	}
}
