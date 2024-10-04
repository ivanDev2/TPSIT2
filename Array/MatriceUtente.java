package Array;

import java.util.Scanner;

public class MatriceUtente {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("inserisci il numero di righe della matrice");
		int righe = scanner.nextInt();
		
		System.out.println("inserisci il numero delle colonne della matrice");
		int colonne = scanner.nextInt();
		
		int[][] matrice = new int[righe][colonne];
		
		System.out.println("inserisci i numeri nella matrice");
		
		for(int i=0; i<righe; i++) {
			for(int j=0; j<colonne; j++) {
				System.out.println("elemento [" + i +"][" + j +"]:");
				matrice[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("\n Matrice caricata:");
		
		for(int i=0; i<righe; i++) {
			for(int j=0; j<colonne; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			
			System.out.println();
		}
		
		scanner.close();
	}
}