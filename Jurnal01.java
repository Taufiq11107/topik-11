package org.d3ifcool.ima11;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		ArrayList<String> data = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		String nama = "null";
		do {
            nama = input.next();
            //membuat berhenti ketika input = "-"
            if (!nama.equals("-")) {
                data.add(nama);
            }
        } while (!nama.equals("-"));
		//membuat output random
		Random rand = new Random();
		int banyakOrang = data.size();
		int acak = rand.nextInt(banyakOrang);
		System.out.print(data.get(acak));
	}
}