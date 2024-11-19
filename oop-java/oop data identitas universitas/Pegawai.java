public class Pegawai extends Identitas{
    // atribut
    int nip;
    int idKaryawan;
    String jabatan;
    int gaji;

    // constructor
    Pegawai(String nama, String alamat, int umur, String jenisKelamin, String noHp, String email, int nip, int idKaryawan, String jabatan, int gaji){
        super(nama, alamat, umur, jenisKelamin, noHp, email);
        this.nip = nip;
        this.idKaryawan = idKaryawan;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    Pegawai(){
        // default constructor
    }

    // setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    // getter methods
    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public int getUmur() {
        return this.umur;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getNoHp() {
        return this.noHp;
    }

    public String getEmail() {
        return this.email;
    }

    public int getNip() {
        return this.nip;
    }

    public int getIdKaryawan() {
        return this.idKaryawan;
    }

    public String getJabatan() {
        return this.jabatan;
    }

    public int getGaji() {
        return this.gaji;
    }


    @Override
    public void tampilkanIdentitas(){
        System.out.println("--------------------------------");
        System.out.println("Nama         : " + this.nama);
        System.out.println("NIP          : " + this.nip); 
        System.out.println("ID Karyawan  : " + this.idKaryawan);
        System.out.println("Alamat       : " + this.alamat);
        System.out.println("Umur         : " + this.umur);
        System.out.println("Jenis Kelamin: " + this.jenisKelamin);
        System.out.println("Jabatan      : " + this.jabatan);
        System.out.println("Gaji         : " + this.gaji);
        System.out.println("No HP        : " + this.noHp);
        System.out.println("Email        : " + this.email);
        System.out.println("--------------------------------");
    }

}
