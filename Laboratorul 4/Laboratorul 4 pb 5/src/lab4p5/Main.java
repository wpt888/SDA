package lab4p5;

import java.util.*;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner x = new Scanner(System.in);
		int pixel = 3, n, m, i, j, sum = 0, k, l, media = 0;

		System.out.print("Numarul de linii :"); //introducere de la tastatura
		n = x.nextInt();
		System.out.print("Numarul de coloane :");
		m = x.nextInt();

		int[][] matrice = new int[n][m]; //declararea matricei

		for (i = 0; i < n; i++) {     //generare nr. random matrice
			for (j = 0; j < n; j++) {
				matrice[i][j] = new Random().nextInt(255);
			}
		}
		System.out.println("Matricea generata random :"); //afisam matricea generata random
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (j == n - 1) {
					System.out.println(matrice[i][j]);
				} else {
					System.out.print(matrice[i][j] + " ");

				}
			} 
		}

		for (i = 0; i < n; i = i + pixel) {
			for (j = 0; j < m; j = j + pixel) {
				int px = Math.min(pixel, m - j);
				int py = Math.min(pixel, n - i);

				for (k = 0; k < py; k++) {
					for (l = 0; l < px; l++) {
						sum += matrice[i + k][j + l];
					}
				}
				media = (int) sum / (px * py);
				for (k = 0; k < py; k++) {
					for (l = 0; l < px; l++) {
						matrice[i + k][j + l] = media;
					}
				}

			}
		}
		System.out.println("Matricea generata dupa filtrare :");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (j == n - 1) {
					System.out.println(matrice[i][j]);
				} else {
					System.out.print(matrice[i][j] + " ");
				}
			} 
		}
	}
}
