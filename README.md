Jawaban percobaan 1: Penerapan IF dan IF-ELSE untuk mencetak KRS
1. Karena nilai yang dicek berupa tipe data boolean (true/false).
Artinya, kondisi sudah bernilai logika tanpa perlu dibandingkan dengan operator relasional seperti <, >, ==, dan sebagainya.
2. Jika pengguna memasukkan nilai false, maka blok IF tidak akan dijalankan, karena kondisinya tidak terpenuhi.
3. else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        }

4. git add .
git commit -m "Modifikasi Percobaan 1"
git push origin main

Jawaban percobaan 2: 
1. Sintaks break digunakan untuk menghentikan atau keluar dari blok switch-case setelah satu kondisi terpenuhi.
Tanpa break, program akan melanjutkan eksekusi ke case berikutnya (disebut fall-through), meskipun kondisinya sudah cocok.
2. Bagian default berfungsi untuk menangani kondisi yang tidak sesuai dengan semua case yang ada.
3. import java.util.Scanner;

public class ifElseCetakKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak SKS SIAKAD ---");
        System.out.println("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS Semester 1 ditampilkan.");
        } else if (semester == 2) {
            System.out.println("KRS Semester 2 ditampilkan.");
        } else if (semester == 3) {
            System.out.println("KRS Semester 3 ditampilkan.");
        } else if (semester == 4) {
            System.out.println("KRS Semester 4 ditampilkan.");
        } else if (semester == 5) {
            System.out.println("KRS Semester 5 ditampilkan.");
        } else if (semester == 6) {
            System.out.println("KRS Semester 6 ditampilkan.");
        } else if (semester == 7) {
            System.out.println("KRS Semester 7 ditampilkan.");
        } else if (semester == 8) {
            System.out.println("KRS Semester 8 ditampilkan.");
        } else {
            System.out.println("Semester tidak valid.");
            
        }
    }
    
}
4. 