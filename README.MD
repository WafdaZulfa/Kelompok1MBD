ManajemenBasisData-A-Kelompok1

Anggota kelompok
Aini Nur Fadilah (1207050007)
Alfin zyogi Setyawan (1207050010)
Wafda Zulfa Husna (1187050100)

Dokumentasi CRUD dengan Spring boot RESTful API HSQLDB
1. Pertama-tama download eclipse IDE terlebih dahulu
2. Kemudian download dan install postman desktop 
3. Selanjutnya generate project nya menggunakan website spring initializr
4. Run IDE eclipse yang sudah terinstall kemudian import file project yang sudah di extract
5. Buat package baru bernama controller, exception, model dan repository di src/main/java
6. didalam package controller buatlah java class untuk membuat endpoint
7. kemudian pada package exception buat java class untuk meng handle error
8. kemudian pada package model buat java class untuk membuat table ke database
9. kemudian pada package repository buat java interface
10. kemudian buka net.kelompok1.springboot.crudrestfulwebservice, lalu klik kanan kemudian run as java application
11. setelah di run akan muncul console seperti gambar di bawah
gambar11
12. jika sudah jalan, selanjutnya kita buka postman yang sudah diinstall, lalu buat http request baru
13. selanjutnya masukan endpoint yang sudah dibuat ke dalam postman
endpoint untuk mengambil data di database
endpoint untuk mengirim data ke database
endpoint untuk menghapus data di database
endpoint untuk mengupdate data di database
