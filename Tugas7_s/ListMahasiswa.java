package Tugas7_s;

public class ListMahasiswa {
	private Node head;
    private Node tail;

    // Konstruktor
    public ListMahasiswa() {
        this.head = null;
        this.tail = null;
    }

    // Method untuk menambahkan elemen ke akhir list (addTail)
    public void addTail(Mahasiswa data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    // Method untuk mencari elemen dalam list berdasarkan NRP (findList)
    public Mahasiswa findList(String nrp) {
        Node current = head;
        while (current != null) {
            if (current.getData().getNrp().equals(nrp)) {
                return current.getData();
            }
            current = current.getNext();
        }
        return null; // Jika elemen tidak ditemukan
    }
}
