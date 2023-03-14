/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest_2_PBO;

/**
 *
 * @author Grylz
 */
public class Pasien {
    private String nama, diagnosis;
    private int umur;
    
    public Pasien(String a, int b, String c){
        this.nama = a;
        this.umur = b;
        this.diagnosis = c;
    }
    
//    public void readData() {
//        System.out.println("Nama Pasien      : " + this.nama);
//        System.out.println("Umur Pasien      : " + this.umur);
//        System.out.println("Diagnosis Pasien : " + this.diagnosis);
//    }

    public String getNama() {
        return nama;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getUmur() {
        return umur;
    }
    
    public void setNama(String Nama) {
        this.nama = Nama;
    }

    public void setUmur(int Umur) {
        this.umur = Umur;
    }
    
    public void setDiagnosis(String Diagnosis) {
        this.diagnosis = Diagnosis;
    }
}
