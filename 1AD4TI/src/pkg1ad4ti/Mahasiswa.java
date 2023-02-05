/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1ad4ti;

/**
 *
 * @author limit
 */

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    // State
    /* atribut dibungkus menggunakan jenis private agar lebih aman dan
    data tidak bisa sembarang di ubah dengan assignmen biasa dan harus
    melalui sette, dan menampilkannya pun harus menggunakan getter */
    private String namaMhs;
    private String nim;
    private List<MataKuliah> mataKuliah;
    
    /* Membuat objek dari class MataKuliah use -a */
    MataKuliah mk = new MataKuliah();
    
    // Constructor
    public Mahasiswa(String namaMhs, String nim){
        this.namaMhs = namaMhs;
        this.nim = nim;
        this.mataKuliah = new ArrayList<MataKuliah>();
    }
    
    // Method
    public void setNamaMhs(String namaMhs){
        this.namaMhs = namaMhs;
    }
    
    public String getNamaMhs(){
        return namaMhs;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public List<MataKuliah> getMataKuliah(){
        return mataKuliah;
    }

    public void tambahMataKuliah(MataKuliah mk){
        this.mataKuliah.add(mk);
    }

    public void dispMhs(){
        System.out.println("======================================");
        System.out.println("Nama : " + namaMhs);
        System.out.println("Nim  : " + nim);
        System.out.println("----------------------------------");
        System.out.println("Kode    Nama Mata Kuliah  :  Nilai");
        System.out.println("----------------------------------");
        for(MataKuliah mk : getMataKuliah()){
            System.out.println("- " + mk.getkodeMk() + " " + mk.getNamaMk() + " : " + mk.getNilaiMk());
        }
        System.out.println("----------------------------------");
        System.out.println("======================================");
        System.out.println();    
    }
    
}