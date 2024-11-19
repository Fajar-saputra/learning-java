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

