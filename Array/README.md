# Laporan Praktikum Daspro 
# JOBSHEET 7 ARRAY
## RAFAEL DIMAS CAHYO L. TI-1C

### 2.1 Percobaan 1
#### 1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
#### 2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
#### 3. Ubah statement pada langkah No 4 menjadi seperti berikut Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
#### 4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?

### Jawaban
#### 1. Program tidak dapat dijalankan karena tipe data dari array bil adalah integer yang hanya bisa untuk bilangan bulat. Jadi, jika diisi dengan bilangan desimal, maka akan terjadi error.
#### 3. Output yang dihasilkan dari perubahan kode program sama seperti sebelumnya. Bedanya hanya bagaimana cara menampilkan outputnya. Sebelumnya menggunakan cara manual, yaitu dengan menggunakan System.out.println(bil[index yang ingin ditampilkan]) berkali-kali. Sedangkan sekarang menggunakan for-loop untuk menampilkan output. 
#### 4. Program akan mengeluarkan output dari isi bilangan array yang disertai dengan error karena kelebihan muatan dari jumlah index array.

### 2.2 Percobaan 2
#### 1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini: Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
#### 2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
#### 3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70): Jalankan program dan jelaskan alur program!
#### 4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, seperti ilustrasi output berikut:

### Jawaban 
#### 1. Tidak terjadi perubahan, karena nilaiAkhir.length maksudnya adalah jumlah elemen dalam array yang dimana jumlah elemen dalam array ada 10, maka output akan sama jika kita menggunakan i < 10. Perbedaan hanya terdapat pada kondisinya saja, jika menggunakan nilaiAkhir.length akan lebih fleksibel jika nantinya kita ingin menambahkan jumlah elemen pada array.
#### 2. Kondisi i < nilaiAkhir.length berarti bahwa program akan berulang saat kondisi nilai i kurang dari jumlah elemen di dalam array nilaiAkhir.
#### 3. Alur dari kode program berikut adalah di dalam loop for yang akan berulang selama i < nilaiAkhir.length akan memeriksa nilaiAkhir yang diinput, jika nilaiAkhir[i] lebih dari 70 maka akan menampilkan mahasiswa ke- i lulus. Jika tidak sesuai dengan kondisi maka tidak akan menampilkan apa-apa.

### 2.3 Percobaan 4
#### 1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di
atas.
#### 2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari.
#### 3. Modifikasi program pada percobaan 4 di atas, sehingga program akan memberikan pesan "Nilai yang dicari tidak ditemukan" jika nilai yang dicari (key) tidak ada di dalam array. 
### Jawaban
#### 1. Maksud dari statement break di baris 10 adalah untuk menghentikan perulangan jika sesuai dengan kondisi yang telah ditentukan.


