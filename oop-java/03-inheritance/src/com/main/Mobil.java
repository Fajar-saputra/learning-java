package com.main;

public class Mobil {
    public int plat;
    public int tahunKeluar;
    public String merk;
    public String warna;
    public int harga;

    Mobil(int plat,int harga, int tahunKeluar, String merk, String warna){
        this.plat = plat;
        this.tahunKeluar = tahunKeluar;
        this.merk = merk;
        this.warna = warna;
        this.harga = harga;
        System.out.println("Constructor dibuat");
    }

    public int getPlat() {
        return plat;
    }

    public void setPlat(int plat) {
        this.plat = plat;
    }

    public int getTahunKeluar() {
        return tahunKeluar;
    }

    public void setTahunKeluar(int tahunKeluar) {
        this.tahunKeluar = tahunKeluar;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    void tambahGas(int value){
        
    }
}