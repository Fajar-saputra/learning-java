// parent class atau induk class
public class Identitas {
    // atribut
    String nama;
    String alamat;
     int umur;
    String jenisKelamin;
    String noHp;
    String email;

    //  constructor
     Identitas(String nama, String alamat,int umur, String jenisKelamin, String noHp, String email){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.noHp = noHp;
        this.email = email;
    } 
    
    Identitas(){
        // default constructor
    }

    // setter
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

    // getter
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUmur() {
        return umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getEmail() {
        return email;
    }

    // method
    public void tampilkanIdentitas(){
        System.out.println("--------------------------------");
        System.out.println("Nama         : " + nama);
        System.out.println("Alamat       : " + alamat); 
        System.out.println("Umur         : " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("No HP        : " + noHp);
        System.out.println("Email        : " + email);
        System.out.println("--------------------------------");
    }
}

