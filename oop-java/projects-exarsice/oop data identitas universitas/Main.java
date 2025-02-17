public class Main {
    public static void main(String[] args) {
        Mahasiswa Mahasiswa1 = new Mahasiswa("Fathir", "Jl. Raya", 25, "Laki-laki", "081234567890", "fathir@example.com", "1234567890", "Teknik Informatika", "Fakultas Teknik");

        Mahasiswa Mahasiswa2 = new Mahasiswa();
        Mahasiswa2.setNama("Iqbal");
        Mahasiswa2.setAlamat("Jl. Merdeka");
        Mahasiswa2.setUmur(20);
        Mahasiswa2.setNoHp("081234567890");
        Mahasiswa2.setEmail("iqbal@example.com");
        Mahasiswa2.setNim("1234567890");
        Mahasiswa2.setFakultas("Fakultas Teknik");
        Mahasiswa2.setJurusan("Teknik Informatika");

        Pegawai Pegawai1 = new Pegawai("Refalldo", "Jl. pasar raya padang", 25, "Laki-laki", "081234567890", "refalldo@example.com", 1234567890, 1234567890, "Administrasi", 50000000);

        Dosen Ari = new Dosen("Ari Limay", "Jl. Raya", 25, "Laki-laki", "081234567890", "ari@example.com", 1234567890, 1234567890, "Dosen", 10000000, "1234567890", "Fakultas Teknik", "Teknik Informatika", "S3", "Teknik Informatika", "Aktif", "Dosen", "Wakil Prodi");

        Nilai Fathir = new Nilai();
        Fathir.setKomputerMasyarakat(3.5);
        Fathir.setArsitekturKomputer(3.0);
        Fathir.setInteraksiManusianDanKomputer(3.5);
        Fathir.setBasisData(3.0);
        Fathir.setPemrogramanBerorientasiObjek(3.5);
        Fathir.setGrafikaKomputer(3.0);
        Fathir.setPendidikanKarakter(3.5);
        Fathir.setAljabarLinear(3.0);
        Fathir.setKewirausahaan(3.5);
        
        Nilai Iqbal = new Nilai();
        Iqbal.setKomputerMasyarakat(3.0);
        Iqbal.setArsitekturKomputer(3.5);
        Iqbal.setInteraksiManusianDanKomputer(3.0);
        Iqbal.setBasisData(3.5);
        Iqbal.setPemrogramanBerorientasiObjek(3.0);
        Iqbal.setGrafikaKomputer(3.5);
        Iqbal.setPendidikanKarakter(3.0);
        Iqbal.setAljabarLinear(3.5);
        Iqbal.setKewirausahaan(3.0);
        

        
        Mahasiswa1.tampilkanIdentitas();
        Mahasiswa2.tampilkanIdentitas();
        Pegawai1.tampilkanIdentitas();
        Ari.tampilkanIdentitas();
        Fathir.tampilkanNilai();
        Iqbal.tampilkanNilai();
    }
}
