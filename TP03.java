package org.d3ifcool.ima11;

import java.util.ArrayList;
import java.util.Scanner;

public class TP03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		ArrayList<Integer> data = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int n = 0;
		boolean kondisi = true;
		while (kondisi) {
			n = input.nextInt();
			if (n == -1) {
				kondisi = false;
			} else {
				data.add(n);
			}
		}
		int modus = 0;
		int hasil = 0;

		int i = 0;
		for (; i < data.size();)
		{
			int x = i;
			int temp = 1;
			++i;


			int j = 0;
			for ( ; j<data.size();)
			{
				int x2 = data.get(j);
				if (x == x2)
					temp++;
				if (temp > modus)
				{
					modus = temp;
					hasil = x;
				}
				if (hasil < x2)
				{
					modus = temp;
					hasil = x2;
				}
				++j;
			}
		}
		System.out.println(hasil);
	}
}
