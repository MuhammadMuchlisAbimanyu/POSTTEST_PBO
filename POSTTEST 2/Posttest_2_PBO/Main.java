/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Posttest_2_PBO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Grylz
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws NumberFormatException, IOException {
        String nama, diagnosis;
        int umur;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<Pasien> dt = new ArrayList<>();
        while(true){
            System.out.println("=============================");
            System.out.println("1 | Create Data");
            System.out.println("2 | Read Data");
            System.out.println("3 | Update Data");
            System.out.println("4 | Delete Data");
            System.out.println("5 | Exit");
            System.out.println("=============================");
            System.out.print("Masukkan Pilihan Anda : ");
            int answer = Integer.parseInt(br.readLine());
            switch(answer){
                case 1:
                    System.out.print("Nama Pasien      : ");
                    nama = br.readLine(); 
                    System.out.print("Umur Pasien      : ");
                    umur = Integer.parseInt(br.readLine()); 
                    System.out.print("Diagnosis Pasien : ");
                    diagnosis = br.readLine(); 
                    Pasien dataPasien = new Pasien(nama, umur, diagnosis);
                    dt.add(dataPasien);
                    System.out.println("============================="); 
                    System.out.println("Data Berhasil Ditambahkan");
                    System.out.println("=============================");
                    System.out.print("Press [enter] to continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 2:
                    System.out.println("=============================");
                    for (int i = 0; i < dt.size(); i += 1) {
                        System.out.println("Data Pasien ke-" + (i + 1));
                        System.out.println("Nama Pasien      : " + dt.get(i).getNama());
                        System.out.println("Umur Pasien      : " + dt.get(i).getUmur());
                        System.out.println("Diagnosis Pasien : " + dt.get(i).getDiagnosis());
                        System.out.println("=============================");
                    }
                    System.out.print("Press [enter] to continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 3:
                    System.out.println("=============================");
                    for (int i = 0; i < dt.size(); i += 1) {
                        System.out.println("Data Pasien ke-" + (i + 1));
                        System.out.println("Nama Pasien      : " + dt.get(i).getNama());
                        System.out.println("Umur Pasien      : " + dt.get(i).getUmur());
                        System.out.println("Diagnosis Pasien : " + dt.get(i).getDiagnosis());
                        System.out.println("=============================");
                    }
                    
                    System.out.print("Masukkan Nama Pasien Yang Ingin Diupdate : ");
                    String update = br.readLine();
                    
                    for(Pasien pasien : dt){
                        if(pasien.getNama().equals(update)){
                            System.out.print("Nama Pasien      : ");
                            pasien.setNama(br.readLine());
                            System.out.print("Umur Pasien      : ");
                            pasien.setUmur(Integer.parseInt(br.readLine()));
                            System.out.print("Diagnosis Pasien : ");
                            pasien.setDiagnosis(br.readLine());
                            break;
                        }
                    }
                    System.out.println("============================="); 
                    System.out.println("Data Berhasil Diupdate ");
                    System.out.println("=============================");
                    System.out.print("Press [enter] to continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 4:
                    System.out.println("=============================");
                    for (int i = 0; i < dt.size(); i += 1) {
                        System.out.println("Data Pasien ke-" + (i + 1));
                        System.out.println("Nama Pasien      : " + dt.get(i).getNama());
                        System.out.println("Umur Pasien      : " + dt.get(i).getUmur());
                        System.out.println("Diagnosis Pasien : " + dt.get(i).getDiagnosis());
                        System.out.println("=============================");
                    }
                    
                    System.out.print("Masukkan Nama Pasien Yang Ingin Dihapus : ");
                    String delete = br.readLine();
                    for (int i = 0; i < dt.size(); i++) {
                        if (dt.get(i).getNama().equals(delete)) {
                            dt.remove(i);
                            break;
                        }
                    }
                    System.out.println("============================="); 
                    System.out.println("Data Berhasil Dihapus");
                    System.out.println("=============================");
                    System.out.print("Press [enter] to continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Inputan Yang Anda Masukkan Salah !!");
                    break;
            }
        }
    }   
}
