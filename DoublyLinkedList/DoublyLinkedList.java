package linkedlist.doublyLinkedList;

public class DoublyLinkedList {
    Node head;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            this.data = d;
            prev = next = null;
        }
    }

    public void insertFront(int d) {
        Node new_node = new Node(d);

        new_node.next = head;
        new_node.prev = null;

        if(head != null)
            head.prev = new_node;

        head = new_node;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.insertFront(10);
        linkedList.insertFront(11);
        linkedList.insertFront(12);
        linkedList.insertFront(13);
        linkedList.insertFront(14);
        linkedList.insertFront(15);
        linkedList.insertFront(16);
        linkedList.insertFront(17);
        linkedList.insertFront(18);
        linkedList.print();


    }
}
