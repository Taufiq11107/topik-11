package org.d3ifcool.ima11;
import java.util.*;

public class TP02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<Integer> poin = new ArrayList<>();
		
		for (int i = 0; i < n; i++){
			poin.add(input.nextInt());
		}
		
		Collections.sort(poin, Collections.reverseOrder());
		String hasil = poin.toString().replace("[", "").replace(",", "").replace("]", "");
		System.out.println(hasil);
		}
	}