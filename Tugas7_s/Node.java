package Tugas7_s;

public class Node {
	private Mahasiswa data;
    private Node next;

    // Konstruktor
    public Node(Mahasiswa data) {
        this.data = data;
        this.next = null;
    }

    // Getter dan setter
    public Mahasiswa getData() {
        return data;
    }

    public void setData(Mahasiswa data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
