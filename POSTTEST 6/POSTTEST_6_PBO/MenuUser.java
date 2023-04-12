/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST_6_PBO;
    

/**
 *
 * @author ASUS-GK
 */
public class MenuUser implements User {
    
    public void displayMenuUser() {
        System.out.println("=============================");
        System.out.println("1 | Create Data");
        System.out.println("2 | Read Data");
        System.out.println("3 | Back");
        System.out.println("=============================");
        System.out.print("Masukkan Pilihan Anda : ");
    }
    
    public void errorMenuUser() {
        System.out.println("Inputan Yang Anda Masukkan Salah !!");
    }
}
