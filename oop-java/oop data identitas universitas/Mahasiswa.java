// child class atau turunan class
public class Mahasiswa extends Identitas{
    String nim;
    String jurusan;
    String fakultas;

    Mahasiswa(String nama, String alamat, int umur, String jenisKelamin, String noHp, String email, String nim, String jurusan, String fakultas){
        super(nama, alamat, umur, jenisKelamin, noHp, email);
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
    }

    Mahasiswa(){
        // default constructor
    }

    
    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // Getter methods 
    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public int getUmur() {
        return this.umur;
    }

    public String getNoHp() {
        return this.noHp;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNim() {
        return this.nim;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    // override method
    @Override
    public void tampilkanIdentitas(){
        System.out.println("--------------------------------");
        System.out.println("Nama    : " + this.nama);
        System.out.println("NIM     : " + this.nim);
        System.out.println("Alamat  : " + this.alamat);
        System.out.println("Umur    : " + this.umur);
        System.out.println("Jurusan : " + this.jurusan);
        System.out.println("Fakultas: " + this.fakultas);
        System.out.println("No HP   : " + this.noHp);
        System.out.println("Email   : " + this.email);
        System.out.println("--------------------------------");
    }
}
