package Tugas7_s;

public class StrukturList {
	private Node head;
    private Node tail;

    // Konstruktor
    public StrukturList() {
        this.head = null;
        this.tail = null;
    }

    // Metode untuk menambahkan elemen ke akhir list (addTail)
    public void addTail(Mahasiswa data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    // Metode untuk mencari elemen dalam list berdasarkan NRP (findList)
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

    // Metode untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Metode untuk menghitung jumlah elemen dalam list (size)
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}
