/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest_4_PBO;

/**
 *
 * @author Grylz
 */
public class Pasien extends Orang {
    private String diagnosis;
    
    public Pasien(String nama, int umur, String diagnosis){
        super(nama, umur);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

}