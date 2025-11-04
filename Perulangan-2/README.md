# LAPORAN PRAKTIKUM DASPRO
# JOBSHEET 7 PERULANGAN 2
## RAFAEL DIMAS CAHYO L. TI-1C

## PRAKTIKUM
### 2.1 Percobaan 1
### Pertanyaan
#### 1. Jika pada perulangan for, inisialisasi i=1 diubah menjadi i=0, apa akibatnya? Mengapa bisa demikian?
#### 2. Jika pada perulangan for, kondisi i<=n diubah menjadi i < n, bagaimana bentuk outputnya jika input n = 5? Mengapa hasilnya berbeda?
#### 3. Jika pada perulangan for, kondisi i <= n diubah menjadi i > n, apa akibatnya? Mengapa bisa demikian?
#### 4. Jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? Mengapa bisa demikian?
#### 5. Jika pada perulangan for, step i++ diubah menjadi i += 2, bagaimana pola outputnya jika input n = 6? Apa yang menyebabkan perubahan tersebut?
### Jawaban
#### 1. Jika inisialisasi i=0 maka output bintang akan bertambah 1 karena perhitungan mulai dari 0 sampai n. Maka dari itu jika ingin menggunakan i = 0, maka kondisi harus diubah menjadi i < n.
#### 2. Jika kondisi i <= n diubah menjadi i < n, maka output bintang akan berkurang 1 karena jika menggunakan operator < maka perhitungan akan berhenti sebelum n.
#### 3. Jika kondisi i <= n diubah menjadi i > n, maka program tidak akan menghasilkan output apapun karena kondisi i > n tidak akan terpenuhi.
#### 4. Jika step i++ diubah menjadi i-- maka output bintang akan mengalami infinite loop karena i akan terus berkurang dan tidak akan mencapai kondisi berhenti i < = n.
#### 5. Jika step i++ diubah menjadi i += 2, pola output jika n = 6 maka hanya akan menampilkan 3 bintang saja. Kenapa? Karena jika i += 2 maka penjumlahan i akan bertambah 2, karena i = 1 maka penjumlahan akan menjadi 1, 3, 5, 7, dst. Karena 6 merupakan bilangan yang kurang dari 7 maka bintang yang tampil hanya 3 saja.

### 2.2 Percobaan 2
### Pertanyaan
#### 1. Perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? Mengapa bisa demikian?
#### 2. Kembalikan program semula dimana inisialisasi iOuter=1. Kemudian perhatikan perulangan dalam. Jika pada sintaks for, inisialisasi i=1 diubah menjadi i=0, apa yang akibatnya? Mengapa bisa demikian?
#### 3. Apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada di dalamnya?
#### 4. Mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? Apa akibatnya jika sintaks tersebut dihilangkan?
#### 5. Silakan commit dan push ke repository Anda.

### Jawaban
#### 1. Jika inisialiasi iOuter = 1 diubah menjadi iOuter = 0, maka baris dari kotak bintang akan bertambah 1, karena perhitungan iOuter dimulai dari 0 sampai ke n.
#### 2. Jika inisialisasi i = 1 diubah menjadi i = 0, maka kolom dari kotak bintang akan bertambah 1, karena perhitungan i dimulai dari 0 sampai ke n.
#### 3. Perulangan luar digunakan untuk menentukan baris dari kotak bintang, sedangkan perulangan dalam digunakan untuk menentukan kolom dari kotak bintang.
#### 4. System.out.println(); digunakan untuk memberikan baris baru / jeda setelah perulangan dalam selesai. Jika dihilangkan maka output akan menjadi baris yang panjang.

### 2.3 Percobaan 3
### Pertanyaan
#### 1. Perhatikan, apakah output yang dihasilkan dengan nilai n = 5 sesuai dengan tampilan berikut?
#### 2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan.
#### 3. Silakan commit dan push ke repository Anda.
#### 4. Jelaskan peran masing-masing variabel i dan j dalam program ini. Mengapa j di-set ulang ke 0 di awal setiap iterasi outer loop? Apa yang akan terjadi jika j tidak di-reset?

### Jawaban
#### 1. Tidak
#### 2. Untuk memperbaiki kita perlu menambahkan sout kosong setelah loop dalam agar dapat memberikan jeda setelah setiap baris bintang dan output menjadi sesuai seperti yang diharapkan.
#### 3. 
#### 4. Peran dari variabel i adalah untuk mewakili baris dari segitiga yang akan dicetak. Peran dari variabel j adalah untuk mewakili jumlah bintang yang akan dicetak di barisnya / jumlah kolom. Jika variabel j tidak direset maka output tidak akan menghasilkan segitiga karena setiap barisnya hanya menampilkan satu bintang saja.

### 2.4 Percobaan 4
#### 1. Jelaskan apa yang terjadi pada variabel totalNilai di setiap iterasi outer loop dan mengapa inisialisasinya (total = 0) berada di dalam outer loop, bukan di luar.
#### 2. Modifikasi program di atas, sehingga dapat mencari kelompok dengan rata-rata nilai tertinggi dan tampilkan nomor kelompok tersebut.

### Jawaban
#### 1. karena total nilai tersebut berfungsi untuk menjumlahkan semua nilai dari kelompok penilai jika ditaruh di luar maka dia akan menjumlahkan semua kelompok bukan tiap kelompok.




