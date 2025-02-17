package com.main;

// Kelas turunan Mahasiswa
class Mahasiswa extends Person {
    private String nim;
    private String jurusan;
    private int semester;

    public Mahasiswa(String nama, String alamat, String email, String noHandphone,
                     String nim, String jurusan, int semester) {
        super(nama, alamat, email, noHandphone);
        this.nim = nim;
        this.jurusan = jurusan;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNIM: " + nim +
                "\nJurusan: " + jurusan +
                "\nSemester: " + semester + "\n";
    }
}