package org.d3ifcool.ima11;

import java.util.Random;
import java.util.Scanner;

public class TP01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		String[] nama = new String[n];
		for(int i = 0; i < n; i++){
			nama[i] = input.next();
		}
		Random rand = new Random();
		int random = rand.nextInt(n);
		System.out.print(nama[random]);
	}
}
