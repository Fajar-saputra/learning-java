package com.main;


// Kelas turunan Dosen
class Dosen extends Person {
    private String nip;
    private String bidangKeahlian;

    public Dosen(String nama, String alamat, String email, String noHandphone,
                 String nip, String bidangKeahlian) {
        super(nama, alamat, email, noHandphone);
        this.nip = nip;
        this.bidangKeahlian = bidangKeahlian;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNIP: " + nip +
                "\nBidang Keahlian: " + bidangKeahlian + "\n";
    }
}