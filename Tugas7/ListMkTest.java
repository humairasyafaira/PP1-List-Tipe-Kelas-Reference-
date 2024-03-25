package Tugas7 ;

public class ListMkTest {
public static void main (String [] args) {
	Matakuliah List = new Matakuliah();
	
	//List.addHead(new Matakuliah("IF001", "Dasar Pemograman", 4));
	//List.addHead(new Matakuliah("IF002", "Pemograman Web",3));
	//List.displayElement();
	
	List.addHead(new Matakuliah("IF004,", "Konstruksi PL Berorientasi,", 3));
	List.addMiddle(new Matakuliah("IF002,", "Pemograman Web,",3),3);
	List.addMiddle(new Matakuliah("IF003,", "Struktur Diskrit,", 3),2);
	List.addTail(new Matakuliah("IF001,", "Dasar Pemograman,", 4));
	List.displayElement();
	
	}
}

