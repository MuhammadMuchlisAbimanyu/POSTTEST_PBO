/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posttest_6_PBO;

/**
 *
 * @author Grylz
 */
public class Perawat extends Orang{
    private int id_perawat;
    
    public Perawat(String nama, int umur, int id_perawat){
        super(nama, umur);
        this.id_perawat = id_perawat;
    }

    public int getId_perawat() {
        return id_perawat;
    }

    public void setId_perawat(int id_perawat) {
        this.id_perawat = id_perawat;
    }    
    
    @Override
    public void display(){
        System.out.println("Nama Perawat     : " + this.nama);
        System.out.println("Umur Perawat     : " + this.umur);
    }
}