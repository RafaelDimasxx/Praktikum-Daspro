# LAPORAN PRAKTIKUM DASPRO
# JOBSHEET 5 PEMILIHAN
## RAFAEL DIMAS CAHYO L. TI-1C

## PRAKTIKUM
## 2.1 Percobaan 1
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
2. Mengapa terdapat null pada daftar nama penonton?
3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut
4. Tambahkan kode program sebagai berikut: Jelaskan fungsi dari penonton.length dan penonton[0]length! Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?
5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array menggunakan for loop. Compile, run, lalu amati hasilnya.
6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.
7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop. Compile, run, lalu amati hasilnya.
8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop. Compile, run, lalu lakukan amati hasilnya.
9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.
10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
11. Berapa indeks baris maksimal untuk array penonton?
12. Berapa indeks kolom maksimal untuk array penonton?
13. Apa fungsi dari String.join()?

## Jawaban
1. Tidak, pengisian elemen array tidak harus urut dari index ke 0, asalkan saat pengisian array, index berapa yang ingin kita isi harus jelas.
2. Karena nama penonton belum kita isi. Jika nilai dari nama penonton belum terisi maka akan menjadi null.
4. Fungsi dari penonton.length adalah untuk mengetahui jumlah baris dari array 2 dimensi penonton. Kalau penonton[0].length adalah untuk mengetahui jumlah kolom dari array 2 dimensi penonton. Jadi, penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama karena sudah dideklarasikan diawal dengan nilai yang sama.
10. Kelebihan: 
    * Penulisan lebih sederhana dan mudah dibaca, terutama untuk iterasi data dalam array atau koleksi.
    * Cocok saat kita hanya perlu mengambil nilai dari setiap elemen tanpa peduli posisi indeksnya.
    Kekurangan: 
    * Tidak bisa mengakses indeks elemen secara langsung.
    * Tidak aman untuk memodifikasi struktur koleksi (misalnya menambah atau menghapus elemen) saat sedang looping.
11. 4
12. 2
13. Untuk menggabungkan beberapa string menjadi satu string dengan pemisah tertentu.

## 2.2 Percobaan 2
1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai
dari indeks ke-0? Jelaskan!
2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut:
    * Menu 1: Input data penonton
    * Menu 2: Tampilkan daftar penonton
    * Menu 3: Exit
3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang tidak tersedia
4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan baris dan kolom kembali
5. Pada menu 2, jika kursi kosong, ganti null dengan ***

## Jawaban
1. Selama indeks yang digunakan masih berada dalam batas ukuran array, kita bebas mulai mengisi dari indeks mana pun. Pengecualian hanya berlaku jika data perlu ditampilkan secara berurutan.

## 2.3 Percobaan 3
1. Tambahkan kode program sebagai berikut
2. Apa fungsi dari Arrays.toString()?
3. Apa nilai default untuk elemen pada array dengan tipe data int?
4. Tambahkan kode program berikut
5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi setelah diinstansiasi?

## Jawaban
2. Mengubah isi array menjadi satu string.
3. 0
5. Jika panjang array tidak sama, maka panjang array tidak dapat dimodifikasi setelah diinstansiasi.

## 2.4 Percobaan 4
1. Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? Modifikasi kode program SIAKAD untuk mengakomodasi jumlah siswa dan jumlah mata kuliah yang dinamis.

