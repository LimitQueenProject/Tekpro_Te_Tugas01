/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1ad4ti;

/**
 *
 * @author limit
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /* Membuat objek pada class MataKuliah */
        MataKuliah mk1 = new MataKuliah("Teknik Pemrograman", "21TI1005", 0);
        MataKuliah mk2 = new MataKuliah("Struktur Data", "21TI1006", 0);
        
        /* Contoh penerapan class yang sudah di buat pada file terpisah */
        
        /* Pada pembuatan objek yang banyak sebenarnya lebih baik
        jika membuat sebuah objek array agar bisa menampung banyak 
        data. namun pada projek kali ini saya lebih memilih untuk menggunakan
        variabel tunggal statis agar lebih mudah untuk memahami konsep
        class terlebih dahulu.
        */
        
        /* Membuat objek mhs1 pada class Mahasiswa  */
        Mahasiswa mhs1 = new Mahasiswa("Roy Aziz Barera", "221524030");
        // Inisialisasi
        mk1.setNilaiMk(100);
        mk2.setNilaiMk(99.9);
        // mengisi List mataKuliah yang ada di mhs1
        mhs1.tambahMataKuliah(mk1);
        mhs1.tambahMataKuliah(mk2);
        // Menampilkan isi dari mhs1
        mhs1.dispMhs();
        
        /* Membuat objek mhs2 pada class Mahasiswa  */
        Mahasiswa mhs2 = new Mahasiswa("Limit", "221524031");
        // Inisialisasi
        mk1.setNilaiMk(98.9);
        mk2.setNilaiMk(99.9);
        // mengisi List mataKuliah yang ada di mhs2
        mhs2.tambahMataKuliah(mk1);
        mhs2.tambahMataKuliah(mk2);
        // Menampilkan isi dari mhs2
        mhs2.dispMhs();
    }   
}
