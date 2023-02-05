/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1ad4ti;

/**
 *
 * @author limit
 */



public class MataKuliah {
    // State
    private String namaMk;
    private String kodeMk;
    private double nilaiMk;
    
    // Pembangun
    public MataKuliah(){}
    
    public MataKuliah(String namaMk, String kodeMk, double nilaiMk){
        this.namaMk = namaMk;
        this.kodeMk = kodeMk;
        this.nilaiMk = nilaiMk;
    }
    
    // Method
    public void setNamaMk(String namaMk){
        this.namaMk = namaMk;
    }
    
    public String getNamaMk(){
        return namaMk;
    }
    
    public void setkodeMk(String kodeMk){
        this.kodeMk = kodeMk;
    }
    
    public String getkodeMk(){
        return kodeMk;
    }
    
    public void setNilaiMk(double nilaiMk){
        this.nilaiMk = nilaiMk;
    }
    
    public double getNilaiMk(){
        return nilaiMk;
    }
 
}
