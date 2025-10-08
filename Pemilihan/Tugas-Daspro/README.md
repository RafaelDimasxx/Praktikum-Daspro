# LATIHAN DASPRO
## RAFAEL DIMAS CAHYO L. TI-1C

### 1. Sistem perpustakaan kampus memberikan izin masuk dengan dua syarat:
* Jika mahasiswa membawa kartu mahasiswa, atau sudah melakukan registrasi
online, maka boleh masuk.
* Jika tidak memenuhi salah satu dari dua syarat tersebut, maka ditolak masuk.
### Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!
![flowchart1](flowchart1.drawio.png)
```
Deklarasi
    boolean bawaKTM
    boolean registOnline
Algoritma
    Output("Apakah Anda membawa KTM? (true/false)")
    Input(bawaKTM)
    If (bawaKTM) Then
        Output("Selamat Datang")
    Else
        Output("Apakah Anda sudah registrasi online? (true/false)")
        Input(registOnline)
        If (registOnline) Then
            Output("Selamat Datang")
        Else
            Output("Mohon membawa KTM atau lakukan registrasi online dahulu!")
        EndIf
    EndIf
```
### 2. Di kampus tersedia layanan WiFi gratis yang hanya bisa diakses oleh civitas akademika. Sistem hotspot kampus akan melakukan pengecekan sebagai berikut:
* Jika jenis pengguna adalah dosen, maka tampilkan “Akses WiFi diberikan (dosen)”. 
* Jika jenis pengguna adalah mahasiswa, maka sistem akan memeriksa jumlah SKS yang diambil:
    * Jika SKS ≥ 12, maka tampilkan “Akses WiFi diberikan (mahasiswa aktif)”. 
    * Jika SKS < 12, maka tampilkan “Akses ditolak, SKS kurang dari 12”.
* Jika bukan mahasiswa maupun dosen, maka tampilkan “Akses ditolak”.
### Buatlah flowchart dan pseudocode untuk menyelesaikan masalah tersebut!
![flowchart2](flowchart2.drawio.png)
```
Deklarasi
    String statusAkademik
    int sks
Algoritma
    Output("Apa Status Akademik Anda? (Dosen/Mahasiswa)")
    Input(statusAkademik)
    If (statusAkademik == "Dosen") Then
        Output("Akses Wifi Diberikan (Dosen)")
    Else If (statusAkademik == "Mahasiswa") Then
        Output("Berapa jumlah SKS yang anda ambil?")
        Input(sks)
        If (sks >= 12) Then
            Output("Akses Wifi Diberikan (Mahasiswa)")
        Else
            Output("Akses Wifi Tidak Diberikan")
        EndIf
    Else
        Output("Akses Wifi Tidak Diberikan")
    EndIf
```
