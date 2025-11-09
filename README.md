**Praktikum PBO - Inheritance**

Tugas Pertemuan 7 - Pemrograman Berorientasi Objek (PBO)

Topik utama: Inheritance (Pewarisan) - memungkinkan suatu class mewarisi atribut dan method dari class lain agar kode lebih efisien, terstruktur, dan mendukung polymorphism.

**Tujuan**

Memahami konsep inheritance (pewarisan class) dalam OOP.

Menerapkan overriding method.

Menggunakan polymorphism dan casting dengan instanceof.

Mengenal abstract class dan penggunaannya.

**Struktur Program**
```
Praktikum-PBO-Inheritance/
│
├── Latihan1Kendaraan.java
├── Latihan2Bank.java
└── Latihan3Shape.java
```
**Penjelasan Latihan**

**1. Latihan 1 – Kendaraan**

Konsep: Pewarisan dan method overriding.

Vehicle sebagai superclass dengan method start().

Car dan Motorcycle mewarisi Vehicle dan meng-override method start().

Kode Output:

Toyota car starts with a key

Honda motorcycle starts with a button

Suzuki car starts with a key


Penjelasan:

Method start() pada subclass menimpa (override) method milik superclass.

Saat v.start() dipanggil, Java memilih method sesuai objek aktual, bukan tipe referensi.

Ini disebut runtime polymorphism.

**2. Latihan 2 – Bank (Inheritance + Casting)**

Konsep: Pewarisan, instanceof, dan casting.

Account sebagai superclass.

SavingsAccount menambah fitur bunga (method addInterest()).

CheckingAccount menambah fitur overdraftLimit.

Kode Output:

A001 balance: 1050.0

B002 balance: 1500.0

C003 balance: 2060.0


Penjelasan:

Setiap objek SavingsAccount diberi bunga sesuai interestRate.

Program memeriksa tipe dengan instanceof sebelum casting agar aman.

Menunjukkan bahwa array Account[] bisa berisi berbagai subclass.

**3. Latihan 3 – Shape dengan Abstrak**

Konsep: Abstract class dan polymorphism.

Shape dideklarasikan abstract dengan method area().

Rectangle, Triangle, dan Circle meng-override method area().

Total area dihitung dari seluruh elemen dalam array Shape[].

Kode Output:

Area of Rectangle = 12.0

Area of Triangle = 6.0

Area of Circle = 30.566370614359172

Total area = 48.56637061435917


**Penjelasan:**

Abstract class tidak bisa diinstansiasi langsung.

Setiap subclass wajib mengimplementasikan method area().

Program menampilkan hasil polimorfik dari beberapa bentuk geometris.

**Cara Menjalankan Program**

Kompilasi dan jalankan tiap file Java dengan perintah berikut di terminal:

javac Latihan1Kendaraan.java && java Latihan1Kendaraan

javac Latihan2Bank.java && java Latihan2Bank

javac Latihan3Shape.java && java Latihan3Shape

**Identitas**

Nama: Milla Agustin

NIM: L0324020

Pertemuan: 7 - Inheritance

Mata Kuliah: Pemrograman Berorientasi Objek
