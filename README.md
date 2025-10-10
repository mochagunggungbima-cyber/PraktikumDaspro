Jawaban percobaan 1: Penerapan IF dan IF-ELSE untuk mencetak KRS
1. Karena nilai yang dicek berupa tipe data boolean (true/false).
Artinya, kondisi sudah bernilai logika tanpa perlu dibandingkan dengan operator relasional seperti <, >, ==, dan sebagainya.
2. Jika pengguna memasukkan nilai false, maka blok IF tidak akan dijalankan, karena kondisinya tidak terpenuhi.
3. else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        }


Jawaban percobaan 2: SWITCH-CASE untuk Mencetak KRS
1. Sintaks break digunakan untuk menghentikan atau keluar dari blok switch-case setelah satu kondisi terpenuhi.
Tanpa break, program akan melanjutkan eksekusi ke case berikutnya (disebut fall-through), meskipun kondisinya sudah cocok.
2. Bagian default berfungsi untuk menangani kondisi yang tidak sesuai dengan semua case yang ada.

Jawaban percobaan 3:
1. Jika mahasiswa menjawab "No" (tidak bebas kompen), maka program akan menolak proses pencetakan KRS.
2. digunakan untuk memeriksa kelayakan mahasiswa berdasarkan jumlah bimbingan dengan dua pembimbing.
Program hanya akan lanjut jika kedua pembimbing sudah cukup jumlah bimbingannya.
3. Langkah 1 — Periksa status UKT

Jika mahasiswa belum melunasi UKT, program langsung menolak:
“UKT belum lunas, tidak dapat mencetak KRS.”

Jika sudah lunas, lanjut ke langkah 2.

Langkah 2 — Periksa status bebas kompen

Jika mahasiswa tidak bebas kompen, program menolak:
“Anda belum bebas kompen, tidak dapat mencetak KRS.”

Jika bebas kompen, lanjut ke langkah 3.

Langkah 3 — Semua syarat terpenuhi

Jika UKT lunas dan bebas kompen, maka:
“Selamat, Anda dapat mencetak KRS.”