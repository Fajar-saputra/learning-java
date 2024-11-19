public class Nilai {
    double IPKkomputerMasyarakat;
    double IPKarsitekturKomputer;
    double IPKinteraksiManusianDanKomputer;
    double IPKbasisData;
    double IPKpemrogramanBerorientasiObjek;
    double IPKgrafikaKomputer;
    double IPKpendidikanKarakter;
    double IPKaljabarLinear;
    double IPKkewirausahaan;

    // constructor
    Nilai(double IPKkomputerMasyarakat, double IPKarsitekturKomputer, double IPKinteraksiManusianDanKomputer, double IPKbasisData, double IPKpemrogramanBerorientasiObjek, double IPKgrafikaKomputer, double IPKpendidikanKarakter, double IPKaljabarLinear, double IPKkewirausahaan) {
        this.IPKkomputerMasyarakat = IPKkomputerMasyarakat;
        this.IPKarsitekturKomputer = IPKarsitekturKomputer;
        this.IPKinteraksiManusianDanKomputer = IPKinteraksiManusianDanKomputer;
        this.IPKbasisData = IPKbasisData;
        this.IPKpemrogramanBerorientasiObjek = IPKpemrogramanBerorientasiObjek;
        this.IPKgrafikaKomputer = IPKgrafikaKomputer;
        this.IPKpendidikanKarakter = IPKpendidikanKarakter;
        this.IPKaljabarLinear = IPKaljabarLinear;
        this.IPKkewirausahaan = IPKkewirausahaan;
    }

    Nilai(){
        // default constructor
    }

    // Setter methods
    public void setKomputerMasyarakat(double IPKkomputerMasyarakat) {
        this.IPKkomputerMasyarakat = IPKkomputerMasyarakat;
    }

    public void setArsitekturKomputer(double IPKarsitekturKomputer) {
        this.IPKarsitekturKomputer = IPKarsitekturKomputer;
    }

    public void setInteraksiManusianDanKomputer(double IPKinteraksiManusianDanKomputer) {
        this.IPKinteraksiManusianDanKomputer = IPKinteraksiManusianDanKomputer;
    }

    public void setBasisData(double IPKbasisData) {
        this.IPKbasisData = IPKbasisData;
    }

    public void setPemrogramanBerorientasiObjek(double IPKpemrogramanBerorientasiObjek) {
        this.IPKpemrogramanBerorientasiObjek = IPKpemrogramanBerorientasiObjek;
    }

    public void setGrafikaKomputer(double IPKgrafikaKomputer) {
        this.IPKgrafikaKomputer = IPKgrafikaKomputer;
    }

    public void setPendidikanKarakter(double IPKpendidikanKarakter) {
        this.IPKpendidikanKarakter = IPKpendidikanKarakter;
    }

    public void setAljabarLinear(double IPKaljabarLinear) {
        this.IPKaljabarLinear = IPKaljabarLinear;
    }

    public void setKewirausahaan(double IPKkewirausahaan) {
        this.IPKkewirausahaan = IPKkewirausahaan;
    }

    // Getter methods
    public double IPKgetKomputerMasyarakat() {
        return this.IPKkomputerMasyarakat;
    }

    public double IPKgetArsitekturKomputer() {
        return this.IPKarsitekturKomputer;
    }

    public double IPKgetInteraksiManusianDanKomputer() {
        return this.IPKinteraksiManusianDanKomputer;
    }

    public double IPKgetBasisData() {
        return this.IPKbasisData;
    }

    public double IPKgetPemrogramanBerorientasiObjek() {
        return this.IPKpemrogramanBerorientasiObjek;
    }

    public double IPKgetGrafikaKomputer() {
        return this.IPKgrafikaKomputer;
    }

    public double IPKgetPendidikanKarakter() {
        return this.IPKpendidikanKarakter;
    }

    public double IPKgetAljabarLinear() {
        return this.IPKaljabarLinear;
    }

    public double IPKgetKewirausahaan() {
        return this.IPKkewirausahaan;
    }

    double IPKrataRata(){
        double result = (IPKkomputerMasyarakat + IPKarsitekturKomputer + IPKinteraksiManusianDanKomputer + IPKbasisData + IPKpemrogramanBerorientasiObjek + IPKgrafikaKomputer + IPKpendidikanKarakter + IPKaljabarLinear + IPKkewirausahaan) / 9;
        return Math.round(result * 100.0) / 100.0;
    }

    public void tampilkanNilai(){
        System.out.println("IPK komputer masyarakat           : " + IPKkomputerMasyarakat);
        System.out.println("IPK arsitektur komputer           : " + IPKarsitekturKomputer);
        System.out.println("IPK interaksi manusia dan komputer: " + IPKinteraksiManusianDanKomputer);
        System.out.println("IPK basis data                    : " + IPKbasisData);
        System.out.println("IPK pemrograman berorientasi objek: " + IPKpemrogramanBerorientasiObjek);
        System.out.println("IPK grafika komputer              : " + IPKgrafikaKomputer);
        System.out.println("IPK pendidikan karakter           : " + IPKpendidikanKarakter);
        System.out.println("IPK aljabar linear                : " + IPKaljabarLinear);
        System.out.println("IPK kewirausahaan                 : " + IPKkewirausahaan);
        System.out.println("IPK rata-rata                     :" + IPKrataRata());
    }
}
