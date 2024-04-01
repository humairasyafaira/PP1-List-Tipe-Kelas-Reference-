package Tugas7_s;

public class ListTest {
	public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Menambahkan elemen ke akhir list (addTail)
        list.addTail(new Mahasiswa("223040107", "HUMAIRA SYAFAIRA", "2004-01-01"));
        list.addTail(new Mahasiswa("223040108", "YAMAZAKI KENTO", "1999-12-31"));

        // Mencari elemen dalam list berdasarkan NRP (findList)
        Mahasiswa mahasiswa1 = list.findList("223040107");
        if (mahasiswa1 != null) {
            System.out.println("Mahasiswa ditemukan: " + mahasiswa1.getNama());
        } else {
            System.out.println("Mahasiswa tidak ditemukan");
        }

        Mahasiswa mahasiswa2 = list.findList("223040108");
        if (mahasiswa2 != null) {
            System.out.println("Mahasiswa ditemukan: " + mahasiswa2.getNama());
        } else {
            System.out.println("Mahasiswa tidak ditemukan");
        }

        // Menampilkan jumlah elemen dalam list (size)
        System.out.println("Jumlah elemen dalam list: " + list.size());
    }
}
