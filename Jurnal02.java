package org.d3ifcool.ima11;
import java.util.*;

public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		 Scanner input = new Scanner(System.in);
        ArrayList<Integer> poin = new ArrayList<>();

        int angka;
        angka = input.nextInt();

        while(angka != -1){
              poin.add(angka);
              angka = input.nextInt();
        }
        Collections.sort(poin, Collections.reverseOrder());
        String hasil = poin.toString().replace("[", "").replace(",", "").replace("]", "");
        System.out.println(hasil);
	}
}
