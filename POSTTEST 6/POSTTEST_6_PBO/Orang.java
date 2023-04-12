/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest_6_PBO;

/**
 *
 * @author Grylz
 */
public abstract class Orang {
    protected String nama;
    protected int umur;
    
    public Orang(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public abstract void display();
    
//    public void display(){
//        System.out.println("Nama Dokter     : " + this.nama);
//        System.out.println("Umur Dokter     : " + this.umur);
//    }
    
}