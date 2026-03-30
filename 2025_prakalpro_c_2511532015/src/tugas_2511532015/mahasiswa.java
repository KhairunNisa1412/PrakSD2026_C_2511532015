package tugas_2511532015;

import java.util.Scanner;

//============================================
//CLASS MAHASISWA (tanpa nested class!)
//============================================
class Mahasiswa {
 private String nim;
 private String nama;
 private double ipk;

 // KONSTRUKTOR
 public Mahasiswa(String nim, String nama, double ipk) {
     this.nim = nim;
     this.nama = nama;
     this.ipk = ipk;
 }

 // FUNCTION: VALIDATOR
 public static boolean isValidNIM(String nim) {
     return nim.length() == 10;
 }

 // PROCEDURE: SETTER
 public void setNim(String newNim) {
     if (isValidNIM(newNim)) {
         this.nim = newNim;
         System.out.println("✓ NIM berhasil diubah");
     } else {
         System.out.println("ERROR: NIM harus 10 digit");
     }
 }

 // FUNCTION: GETTER
 public String getNim() {
     return nim;
 }

 public String getNama() {
     return nama;
 }

 public double getIpk() {
     return ipk;
 }

 public void tampil() {
     System.out.println(nim + " - " + nama + " (" + ipk + ")");
 }
}

//============================================
//CLASS STACK MAHASISWA (tanpa nested class!)
//============================================
class StackMahasiswa {
 private Mahasiswa[] data = new Mahasiswa[100];
 private int top = -1;

 // PROCEDURE: PUSH
 public void push(Mahasiswa m) {
     top++;
     data[top] = m;
     System.out.println("✓ Mahasiswa ditambahkan ke stack");
 }

 // PROCEDURE: POP
 public Mahasiswa pop() {
     Mahasiswa m = data[top];
     top--;
     System.out.println("✓ Mahasiswa dihapus dari stack");
     return m;
 }

 // FUNCTION: PEEK
 public Mahasiswa peek() {
     return data[top];
 }

 public boolean isEmpty() {
     return top == -1;
 }
}


