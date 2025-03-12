package com.main;

public class Identitas {
    String nama, alamat, pekerjaan;
    int umur, tglLahir, blnLahir, thnLahir, anggotaKeluarga;
    boolean statusNikah;

    public Identitas(String nama, String alamat, String pekerjaan, int umur, int tglLahir, int blnLahir, int thnLahir, int anggotaKeluarga, boolean statusNikah) {
        this.nama = nama;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
        this.umur = umur;
        this.tglLahir = tglLahir;
        this.blnLahir = blnLahir;
        this.thnLahir = thnLahir;
        this.anggotaKeluarga = anggotaKeluarga;
        this.statusNikah = statusNikah;
    }

    public Identitas() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(int tglLahir) {
        this.tglLahir = tglLahir;
    }

    public int getBlnLahir() {
        return blnLahir;
    }

    public void setBlnLahir(int blnLahir) {
        this.blnLahir = blnLahir;
    }

    public int getThnLahir() {
        return thnLahir;
    }

    public void setThnLahir(int thnLahir) {
        this.thnLahir = thnLahir;
    }

    public int getAnggotaKeluarga() {
        return anggotaKeluarga;
    }

    public void setAnggotaKeluarga(int anggotaKeluarga) {
        this.anggotaKeluarga = anggotaKeluarga;
    }

    public boolean isStatusNikah() {
        return statusNikah;
    }

    public void setStatusNikah(boolean statusNikah) {
        this.statusNikah = statusNikah;
    }
}
