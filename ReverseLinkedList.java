package linkedlist.singlyLinkedList;

public class ReverseLinkedList {
   static Node head;

   static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public void insert(int d) {
        Node newNode = new Node(d);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void reverseList() {

        Node current = head;
        Node prev = null;
        Node next = null;


        while (current != null){
             next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public Node reverseRecursevely(Node head){
        if(head == null || head.next == null) return head;

        Node p = reverseRecursevely(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.print();
        System.out.println();
        linkedList.reverseList();
        System.out.println(linkedList.reverseRecursevely(ReverseLinkedList.head));
        linkedList.print();

    }
}
