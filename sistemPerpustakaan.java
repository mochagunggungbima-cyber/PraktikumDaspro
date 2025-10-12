import java.util.Scanner;

public class sistemPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Systyaem.out.print("Apakah membawa kartu mahasiswa? (ya/tidak): ");
        boolean kartuMahasiswa = sc.nextLine().toLowerCase().trim().equals("ya");
        
        System.out.print("Apakah sudah registrasi online? (ya/tidak): ");
        boolean registrasiOnline = sc.nextLine().toLowerCase().trim().equals("ya");

        if (kartuMahasiswa || registrasiOnline) {
            System.out.println("Boleh meminjam buku.");
        } else {
            System.out.println("Tidak boleh meminjam buku.");
        }
    }
}
