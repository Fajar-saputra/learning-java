public class Dosen extends Pegawai{
    // atribut
    String nidn;
    String fakultas;  
    String ajarProdi;
    String pendidikanTerakhir;
    String programStudi;
    String statusDosen;
    String jabatanSaatIni;
    String jabatanFungsional;


    // constructor
    Dosen(String nama, String alamat, int umur, String jenisKelamin, String noHp, String email, int nip, int idKaryawan, String jabatan, int gaji, String nidn, String fakultas, String ajarProdi, String pendidikanTerakhir, String programStudi, String statusDosen, String jabatanSaatIni, String jabatanFungsional){
        super(nama, alamat, umur, jenisKelamin, noHp, email, nip, idKaryawan, jabatan, gaji);
        this.nidn = nidn;
        this.fakultas = fakultas;
        this.ajarProdi = ajarProdi;
    }

    Dosen(){
        // default constructor
    }

    // Setter methods
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setAjarProdi(String ajarProdi) {
        this.ajarProdi = ajarProdi;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setStatusDosen(String statusDosen) {
        this.statusDosen = statusDosen;
    }

    public void setJabatanSaatIni(String jabatanSaatIni) {
        this.jabatanSaatIni = jabatanSaatIni;
    }

    public void setJabatanFungsional(String jabatanFungsional) {
        this.jabatanFungsional = jabatanFungsional;
    }

    // Getter methods
    public String getNidn() {
        return this.nidn;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public String getAjarProdi() {
        return this.ajarProdi;
    }

    public String getPendidikanTerakhir() {
        return this.pendidikanTerakhir;
    }

    public String getProgramStudi() {
        return this.programStudi;
    }

    public String getStatusDosen() {
        return this.statusDosen;
    }

    public String getJabatanSaatIni() {
        return this.jabatanSaatIni;
    }

    public String getJabatanFungsional() {
        return this.jabatanFungsional;
    }

    @Override
    public void tampilkanIdentitas(){
        System.out.println("--------------------------------");
        System.out.println("Nama                : " + this.nama);
        System.out.println("NIDN                : " + this.nidn);
        System.out.println("Alamat              : " + this.alamat);
        System.out.println("Umur                : " + this.umur);
        System.out.println("Jenis Kelamin       : " + this.jenisKelamin);
        System.out.println("Fakultas            : " + this.fakultas);
        System.out.println("Program Studi       : " + this.programStudi); 
        System.out.println("Mengajar di Prodi   : " + this.ajarProdi);
        System.out.println("Pendidikan Terakhir : " + this.pendidikanTerakhir);
        System.out.println("Status Dosen        : " + this.statusDosen);
        System.out.println("Jabatan Saat Ini    : " + this.jabatanSaatIni);
        System.out.println("Jabatan Fungsional  : " + this.jabatanFungsional);
        System.out.println("No HP               : " + this.noHp);
        System.out.println("Email               : " + this.email);
        System.out.println("--------------------------------");
    }
}
