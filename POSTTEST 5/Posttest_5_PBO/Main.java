/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Posttest_5_PBO;

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
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    static ArrayList<Pasien> dtPasien = new ArrayList<>();
    static ArrayList<Perawat> dtPerawat = new ArrayList<>();
    static ArrayList<Dokter> dtDokter = new ArrayList<>();

    static final void delete() throws IOException {
        System.out.println("=============================");
        System.out.println("1 | Delete Data Pasien");
        System.out.println("2 | Delete Data Perawat");
        System.out.println("3 | Delete Data Dokter");
        System.out.println("=============================");
        System.out.print("Masukkan Pilihan Anda : ");
        int deleteData = Integer.parseInt(br.readLine());
        switch (deleteData) {
            case 1:
                System.out.println("=============================");
                for (int i = 0; i < dtPasien.size(); i += 1) {
                    System.out.println("Data Pasien ke-" + (i + 1));
                    System.out.println("Nama Pasien      : " + dtPasien.get(i).getNama());
                    System.out.println("Umur Pasien      : " + dtPasien.get(i).getUmur());
                    System.out.println("Diagnosis Pasien : " + dtPasien.get(i).getDiagnosis());
                    System.out.println("=============================");
                }

                System.out.print("Masukkan Nama Pasien Yang Ingin Dihapus : ");
                String deletePasien = br.readLine();
                for (int i = 0; i < dtPasien.size(); i++) {
                    if (dtPasien.get(i).getNama().equals(deletePasien)) {
                        dtPasien.remove(i);
                        break;
                    }
                }
                System.out.println("=============================");
                System.out.println("Data Berhasil Dihapus");
                System.out.println("=============================");
                System.out.print("Press [enter] to continue...");
                new java.util.Scanner(System.in).nextLine();
                break;
            case 2:
                System.out.println("=============================");
                for (int i = 0; i < dtPerawat.size(); i += 1) {
                    System.out.println("Data Perawat ke-" + (i + 1));
                    System.out.println("Nama Perawat     : " + dtPerawat.get(i).getNama());
                    System.out.println("Umur Perawat     : " + dtPerawat.get(i).getUmur());
                    System.out.println("ID Perawat       : " + dtPerawat.get(i).getId_perawat());
                    System.out.println("=============================");
                }

                System.out.print("Masukkan Nama Perawat Yang Ingin Dihapus : ");
                String deletePerawat = br.readLine();
                for (int i = 0; i < dtPerawat.size(); i++) {
                    if (dtPerawat.get(i).getNama().equals(deletePerawat)) {
                        dtPerawat.remove(i);
                        break;
                    }
                }
                System.out.println("=============================");
                System.out.println("Data Berhasil Dihapus");
                System.out.println("=============================");
                System.out.print("Press [enter] to continue...");
                new java.util.Scanner(System.in).nextLine();
                break;
            case 3:
                System.out.println("=============================");
                for (int i = 0; i < dtDokter.size(); i += 1) {
                    System.out.println("Data Dokter ke-" + (i + 1));
                    dtDokter.get(i).display(false);
                    System.out.println("=============================");
                }

                System.out.print("Masukkan Nama Dokter Yang Ingin Dihapus : ");
                String deleteDokter = br.readLine();
                for (int i = 0; i < dtDokter.size(); i++) {
                    if (dtDokter.get(i).getNama().equals(deleteDokter)) {
                        dtDokter.remove(i);
                        break;
                    }
                }
                System.out.println("=============================");
                System.out.println("Data Berhasil Dihapus");
                System.out.println("=============================");
                System.out.print("Press [enter] to continue...");
                new java.util.Scanner(System.in).nextLine();
                break;
            default:
                break;
        }
    }

    static void menuAdmin() throws IOException {
        while (true) {
            System.out.println("=============================");
            System.out.println("1 | Create Data");
            System.out.println("2 | Read Data");
            System.out.println("3 | Update Data");
            System.out.println("4 | Delete Data");
            System.out.println("5 | Back");
            System.out.println("=============================");
            System.out.print("Masukkan Pilihan Anda : ");
            int answer = Integer.parseInt(br.readLine());
            switch (answer) {
                case 1:
                    System.out.println("=============================");
                    System.out.println("1 | Create Data Pasien");
                    System.out.println("2 | Create Data Perawat");
                    System.out.println("3 | Create Data Dokter");
                    System.out.println("=============================");
                    System.out.print("Masukkan Pilihan Anda : ");
                    int createData = Integer.parseInt(br.readLine());
                    switch (createData) {
                        case 1:
                            System.out.print("Nama Pasien       : ");
                            String namaPasien = br.readLine();
                            System.out.print("Umur Pasien       : ");
                            int umurPasien = Integer.parseInt(br.readLine());
                            System.out.print("Diagnosis Pasien  : ");
                            String diagnosisPasien = br.readLine();
                            Pasien newPasien = new Pasien(namaPasien, umurPasien, diagnosisPasien);
                            dtPasien.add(newPasien);
                            System.out.println("=============================");
                            System.out.println("Data Berhasil Ditambahkan");
                            System.out.println("=============================");
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                        case 2:
                            System.out.print("Nama Perawat      : ");
                            String namaPerawat = br.readLine();
                            System.out.print("Umur Perawat      : ");
                            int umurPerawat = Integer.parseInt(br.readLine());
                            System.out.print("ID Perawat        : ");
                            int idPerawat = Integer.parseInt(br.readLine());
                            Perawat newPerawat = new Perawat(namaPerawat, umurPerawat, idPerawat);
                            dtPerawat.add(newPerawat);
                            System.out.println("=============================");
                            System.out.println("Data Berhasil Ditambahkan");
                            System.out.println("=============================");
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                        case 3:
                            System.out.print("Nama Dokter       : ");
                            String namaDokter = br.readLine();
                            System.out.print("Umur Dokter       : ");
                            int umurDokter = Integer.parseInt(br.readLine());
                            System.out.print("ID Dokter         : ");
                            int idDokter = Integer.parseInt(br.readLine());
                            Dokter newDokter = new Dokter(namaDokter, umurDokter, idDokter);
                            dtDokter.add(newDokter);
                            System.out.println("=============================");
                            System.out.println("Data Berhasil Ditambahkan");
                            System.out.println("=============================");
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("=============================");
                    System.out.println("1 | Read Data Pasien");
                    System.out.println("2 | Read Data Perawat");
                    System.out.println("3 | Read Data Dokter");
                    System.out.println("=============================");
                    System.out.print("Masukkan Pilihan Anda : ");
                    int readData = Integer.parseInt(br.readLine());
                    switch (readData) {
                        case 1:
                            System.out.println("=============================");
                            for (int i = 0; i < dtPasien.size(); i += 1) {
                                System.out.println("Data Pasien ke-" + (i + 1));
                                System.out.println("Nama Pasien      : " + dtPasien.get(i).getNama());
                                System.out.println("Umur Pasien      : " + dtPasien.get(i).getUmur());
                                System.out.println("Diagnosis Pasien : " + dtPasien.get(i).getDiagnosis());
                                System.out.println("=============================");
                            }
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                        case 2:
                            System.out.println("=============================");
                            for (int i = 0; i < dtPerawat.size(); i += 1) {
                                System.out.println("Data Perawat ke-" + (i + 1));
                                System.out.println("Nama Perawat     : " + dtPerawat.get(i).getNama());
                                System.out.println("Umur Perawat     : " + dtPerawat.get(i).getUmur());
                                System.out.println("ID Perawat       : " + dtPerawat.get(i).getId_perawat());
                                System.out.println("=============================");
                            }
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                        case 3:
                            System.out.println("=============================");
                            for (int i = 0; i < dtDokter.size(); i += 1) {
                                System.out.println("Data Dokter ke-" + (i + 1));
                                dtDokter.get(i).display(false);
                                System.out.println("=============================");
                            }
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("=============================");
                    System.out.println("1 | Update Data Pasien");
                    System.out.println("2 | Update Data Perawat");
                    System.out.println("3 | Update Data Dokter");
                    System.out.println("=============================");
                    System.out.print("Masukkan Pilihan Anda : ");
                    int updateData = Integer.parseInt(br.readLine());
                    switch (updateData) {
                        case 1:
                            System.out.println("=============================");
                            for (int i = 0; i < dtPasien.size(); i += 1) {
                                System.out.println("Data Pasien ke-" + (i + 1));
                                System.out.println("Nama Pasien      : " + dtPasien.get(i).getNama());
                                System.out.println("Umur Pasien      : " + dtPasien.get(i).getUmur());
                                System.out.println("Diagnosis Pasien : " + dtPasien.get(i).getDiagnosis());
                                System.out.println("=============================");
                            }

                            System.out.print("Masukkan Nama Pasien Yang Ingin Diupdate : ");
                            String updatePasien = br.readLine();

                            for (Pasien pasien : dtPasien) {
                                if (pasien.getNama().equals(updatePasien)) {
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
                        case 2:
                            System.out.println("=============================");
                            for (int i = 0; i < dtPerawat.size(); i += 1) {
                                System.out.println("Data Perawat ke-" + (i + 1));
                                System.out.println("Nama Perawat     : " + dtPerawat.get(i).getNama());
                                System.out.println("Umur Perawat     : " + dtPerawat.get(i).getUmur());
                                System.out.println("ID Perawat       : " + dtPerawat.get(i).getId_perawat());
                                System.out.println("=============================");
                            }

                            System.out.print("Masukkan Nama Perawat Yang Ingin Diupdate : ");
                            String updatePerawat = br.readLine();

                            for (Perawat perawat : dtPerawat) {
                                if (perawat.getNama().equals(updatePerawat)) {
                                    System.out.print("Nama Perawat     : ");
                                    perawat.setNama(br.readLine());
                                    System.out.print("Umur Perawat     : ");
                                    perawat.setUmur(Integer.parseInt(br.readLine()));
                                    System.out.print("ID Perawat       : ");
                                    perawat.setId_perawat(Integer.parseInt(br.readLine()));
                                    break;
                                }
                            }

                            System.out.println("=============================");
                            System.out.println("Data Berhasil Diupdate ");
                            System.out.println("=============================");
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                        case 3:
                            System.out.println("=============================");
                            for (int i = 0; i < dtDokter.size(); i += 1) {
                                System.out.println("Data Dokter ke-" + (i + 1));
                                dtDokter.get(i).display(false);
                                System.out.println("=============================");
                            }

                            System.out.print("Masukkan Nama Dokter Yang Ingin Diupdate : ");
                            String updateDokter = br.readLine();

                            for (Dokter dokter : dtDokter) {
                                if (dokter.getNama().equals(updateDokter)) {
                                    System.out.print("Nama Dokter     : ");
                                    dokter.setNama(br.readLine());
                                    System.out.print("Umur Dokter     : ");
                                    dokter.setUmur(Integer.parseInt(br.readLine()));
                                    System.out.print("ID Dokter       : ");
                                    dokter.setId_dokter(Integer.parseInt(br.readLine()));
                                    break;
                                }
                            }

                            System.out.println("=============================");
                            System.out.println("Data Berhasil Diupdate ");
                            System.out.println("=============================");
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    login();
                    break;
                default:
                    System.out.println("Inputan Yang Anda Masukkan Salah !!");
                    break;
            }
        }
    }

    static void menuUser() throws IOException {
        while (true) {
            System.out.println("=============================");
            System.out.println("1 | Create Data");
            System.out.println("2 | Read Data");
            System.out.println("3 | Back");
            System.out.println("=============================");
            System.out.print("Masukkan Pilihan Anda : ");
            int answer = Integer.parseInt(br.readLine());
            switch (answer) {
                case 1:
                    System.out.print("Nama Pasien       : ");
                    String namaPasien = br.readLine();
                    System.out.print("Umur Pasien       : ");
                    int umurPasien = Integer.parseInt(br.readLine());
                    System.out.print("Diagnosis Pasien  : ");
                    String diagnosisPasien = br.readLine();
                    Pasien newPasien = new Pasien(namaPasien, umurPasien, diagnosisPasien);
                    dtPasien.add(newPasien);
                    System.out.println("=============================");
                    System.out.println("Data Berhasil Ditambahkan");
                    System.out.println("=============================");
                    System.out.print("Press [enter] to continue...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 2:
                    System.out.println("=============================");
                    System.out.println("1 | Read Data Pasien");
                    System.out.println("2 | Read Data Perawat");
                    System.out.println("3 | Read Data Dokter");
                    System.out.println("=============================");
                    System.out.print("Masukkan Pilihan Anda : ");
                    int readData = Integer.parseInt(br.readLine());
                    switch (readData) {
                        case 1:
                            System.out.println("=============================");
                            for (int i = 0; i < dtPasien.size(); i += 1) {
                                System.out.println("Data Pasien ke-" + (i + 1));
                                System.out.println("Nama Pasien      : " + dtPasien.get(i).getNama());
                                System.out.println("Umur Pasien      : " + dtPasien.get(i).getUmur());
                                System.out.println("Diagnosis Pasien : " + dtPasien.get(i).getDiagnosis());
                                System.out.println("=============================");
                            }
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                        case 2:
                            System.out.println("=============================");
                            for (int i = 0; i < dtPerawat.size(); i += 1) {
                                System.out.println("Data Perawat ke-" + (i + 1));
                                System.out.println("Nama Perawat     : " + dtPerawat.get(i).getNama());
                                System.out.println("Umur Perawat     : " + dtPerawat.get(i).getUmur());
                                System.out.println("=============================");
                            }
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                        case 3:
                            System.out.println("=============================");
                            for (int i = 0; i < dtDokter.size(); i += 1) {
                                System.out.println("Data Dokter ke-" + (i + 1));
                                dtDokter.get(i).display();
                                System.out.println("=============================");
                            }
                            System.out.print("Press [enter] to continue...");
                            new java.util.Scanner(System.in).nextLine();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    login();
                    break;
                default:
                    break;
            }
        }
    }

    static void login() throws IOException {
        while (true) {
            System.out.println("=============================");
            System.out.println("1 | Admin");
            System.out.println("2 | User");
            System.out.println("3 | Exit");
            System.out.println("=============================");
            System.out.print("Masukkan Pilihan Anda : ");
            int login = Integer.parseInt(br.readLine());
            switch (login) {
                case 1:
                    menuAdmin();
                    break;
                case 2:
                    menuUser();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Inputan Yang Anda Masukkan Salah !!");
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        login();
    }
}
