package Tugas7;

public class Node {
	private Matakuliah data;
	private Node next;

	public Node(Matakuliah data) {
		this.data=data;
	}

//	public void Node(MataKuliah data) {
//	this.data = data;
//}
	
	//setter getter
	public void setsks(Matakuliah data) {
		this.data = data;
	}
	 public void setnext(Node next) {
		 this.next = next;
	 }
	 
	 public Node getNext() {
		 return next;
	 }
	 
	 public Matakuliah getData() {
		 return data;
	 }
}
