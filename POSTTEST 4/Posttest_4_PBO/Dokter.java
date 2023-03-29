/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest_4_PBO;

/**
 *
 * @author Grylz
 */
public class Dokter extends Orang {
    private int id_dokter;
    
        public Dokter(String nama, int umur, int id_dokter){
        super(nama, umur);
        this.id_dokter = id_dokter;
    }

    public int getId_dokter() {
        return id_dokter;
    }

    public void setId_dokter(int id_dokter) {
        this.id_dokter = id_dokter;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("ID Dokter       : " + this.id_dokter);
    }
        
    public void display(boolean showID){
        if(showID) display();
        else super.display();
    }
}