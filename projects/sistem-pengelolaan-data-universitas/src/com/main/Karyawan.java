package com.main;

// Kelas turunan Karyawan
class Karyawan extends Person {
    private String nip;
    private String jabatan;

    public Karyawan(String nama, String alamat, String email, String noHandphone,
                    String nip, String jabatan) {
        super(nama, alamat, email, noHandphone);
        this.nip = nip;
        this.jabatan = jabatan;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNIP: " + nip +
                "\nJabatan: " + jabatan + "\n";
    }
}
