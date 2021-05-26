package lab4p3;

import java.util.*;

public class Main {

	public static boolean Cautare(int n, int[] v) {

		boolean m;
		int x = 0;
		int stanga = 0;
		int dreapta = v.length - 1;
		int mijloc = (stanga + dreapta) / 2;
		while (stanga <= dreapta) {
			if (v[mijloc] < n) {
				stanga = mijloc + 1;
			}
			if (v[mijloc] > n) {
				dreapta = mijloc - 1;
			}
			mijloc = (stanga + dreapta) / 2;
			if (v[mijloc] == n) {
				x = 1;
				break;
			}
		}

		if (x == 1) {
			m = true;
		} else {
			m = false;
		}

		return m;

	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Lungimea vectorului : ");
		int n = x.nextInt(), i, j, aux = 0;
		int[] v = new int[n];
		for (i = 0; i < n; i++) {
			v[i] = new Random().nextInt(255);
		}
		for (i = 0; i < n - 1; i++) //sortarea sirului
			for (j = i + 1; j < n; j++)
				if (v[i] > v[j]) {
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}

		System.out.print("Introduce-ti numarul cautat :");
		int a = x.nextInt();
		System.out.print("Vectorul generat random : ");
		for (i = 0; i < n; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println("\nNumarul a fost gasit ? " + Cautare(a, v));
	}
}
