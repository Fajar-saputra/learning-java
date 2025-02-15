package com.main;

import java.util.ArrayList;
import java.util.Scanner;

// Kelas untuk mengelola sistem (tidak berubah)
class SistemPengelolaan {
    private ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
    private ArrayList<Dosen> dosenList = new ArrayList<>();
    private ArrayList<Karyawan> karyawanList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void jalankan() {
        while (true) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    System.out.println("Keluar dari sistem...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private void tampilkanMenu() {
        System.out.println("\n===== Sistem Pengelolaan Data =====");
        System.out.println("1. Tambah Data");
        System.out.println("2. Tampilkan Data");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan: ");
    }

    private void tambahData() {
        System.out.println("\nPilih jenis data:");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Dosen");
        System.out.println("3. Karyawan");
        System.out.print("Pilihan: ");
        int jenis = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("No. Handphone: ");
        String noHandphone = scanner.nextLine();

        switch (jenis) {
            case 1:
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                System.out.print("Jurusan: ");
                String jurusan = scanner.nextLine();
                System.out.print("Semester: ");
                int semester = scanner.nextInt();
                scanner.nextLine();
                mahasiswaList.add(new Mahasiswa(nama, alamat, email, noHandphone, nim, jurusan, semester));
                break;
            case 2:
                System.out.print("NIP: ");
                String nipDosen = scanner.nextLine();
                System.out.print("Bidang Keahlian: ");
                String bidang = scanner.nextLine();
                dosenList.add(new Dosen(nama, alamat, email, noHandphone, nipDosen, bidang));
                break;
            case 3:
                System.out.print("NIP: ");
                String nipKaryawan = scanner.nextLine();
                System.out.print("Jabatan: ");
                String jabatan = scanner.nextLine();
                karyawanList.add(new Karyawan(nama, alamat, email, noHandphone, nipKaryawan, jabatan));
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        System.out.println("Data berhasil ditambahkan!");
    }

    private void tampilkanData() {
        System.out.println("\nPilih jenis data:");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Dosen");
        System.out.println("3. Karyawan");
        System.out.print("Pilihan: ");
        int jenis = scanner.nextInt();
        scanner.nextLine();

        switch (jenis) {
            case 1:
                tampilkanSemuaMahasiswa();
                break;
            case 2:
                tampilkanSemuaDosen();
                break;
            case 3:
                tampilkanSemuaKaryawan();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private void tampilkanSemuaMahasiswa() {
        System.out.println("\n=== Daftar Mahasiswa ===");
        for (Mahasiswa mhs : mahasiswaList) {
            System.out.println(mhs);
        }
    }

    private void tampilkanSemuaDosen() {
        System.out.println("\n=== Daftar Dosen ===");
        for (Dosen dsn : dosenList) {
            System.out.println(dsn);
        }
    }

    private void tampilkanSemuaKaryawan() {
        System.out.println("\n=== Daftar Karyawan ===");
        for (Karyawan kry : karyawanList) {
            System.out.println(kry);
        }
    }
}