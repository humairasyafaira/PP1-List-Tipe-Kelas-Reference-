package Tugas7_s;

public class Mahasiswa {
	private String nrp;
    private String nama;
    private String tanggalLahir;

    // Konstruktor
    public Mahasiswa(String nrp, String nama, String tanggalLahir) {
        this.nrp = nrp;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    // Getter dan setter
    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

}
