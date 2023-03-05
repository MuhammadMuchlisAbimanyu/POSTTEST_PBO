/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest_1_pbo;

/**
 *
 * @author Grylz
 */
public class Pasien {
    public String nama, diagnosis;
    public int umur;
    
    public Pasien(String a, int b, String c){
        this.nama = a;
        this.umur = b;
        this.diagnosis = c;
    }
    
    public void readData() {
        System.out.println("Nama Pasien      : " + this.nama);
        System.out.println("Umur Pasien      : " + this.umur);
        System.out.println("Diagnosis Pasien : " + this.diagnosis);
    }
    
    public void updateNama(String Nama) {
        this.nama = Nama;
    }

    public void updateUmur(int Umur) {
        this.umur = Umur;
    }
    
    public void updateDiagnosis(String Diagnosis) {
        this.diagnosis = Diagnosis;
    }
}
