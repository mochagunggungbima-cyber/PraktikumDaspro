package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS13 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/False): ");
        boolean uktLunas= sc.nextBoolean();


        if (uktLunas) {
        System.out.println("Pembayaran UKT terverifikasi");
        System.out.println("Silakan cetas KRS dan minta tanda tangan DPA");
        }

    }
}
