package com.main;

public class MobilTruck extends Mobil{
    int banyakBan;
    int muatan;

    public MobilTruck(int banyakBan, int muatan,int plat, int harga, int tahunKeluar, String merk, String warna) {
        super(plat, harga, tahunKeluar, merk, warna);
        this.banyakBan = banyakBan;
        this.muatan = muatan;
        System.out.println("Constructor MobilTruck dibuat");
    }

    public int getBanyakBan() {
        return banyakBan;
    }

    public void setBanyakBan(int banyakBan) {
        this.banyakBan = banyakBan;
    }

    public int getMuatan() {
        return muatan;
    }

    public void setMuatan(int muatan) {
        this.muatan = muatan;
    }
}
