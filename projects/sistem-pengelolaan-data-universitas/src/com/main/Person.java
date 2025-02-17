package com.main;

// Kelas induk (Superclass)
class Person {
    private String nama;
    private String alamat;
    private String email;
    private String noHandphone;

    public Person(String nama, String alamat, String email, String noHandphone) {
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.noHandphone = noHandphone;
    }

    // Getter dan Setter
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getEmail() { return email; }
    public String getNoHandphone() { return noHandphone; }

    @Override
    public String toString() {
        return "Nama: " + nama +
                "\nAlamat: " + alamat +
                "\nEmail: " + email +
                "\nNo. Handphone: " + noHandphone;
    }
}
