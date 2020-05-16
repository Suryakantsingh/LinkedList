package linkedlist;

public class MergeTwoSortedList {
    Node head;

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

        if (head == null)
            head = newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public Node merge(Node temp1, Node temp2) {

        Node dummyNode = new Node(0);
        Node temp = dummyNode;
        while (true) {

            if (temp1 == null) {
                temp.next = temp2;
                break;
            }

            if(temp2 == null){
                temp.next = temp2;
                break;
            }

            if(temp1.data <= temp2.data){
                temp.next = temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedList llist1 = new MergeTwoSortedList();
        MergeTwoSortedList llist2 = new MergeTwoSortedList();
        llist1.insert(1);
        llist1.insert(2);
        llist1.insert(4);

        llist2.insert(1);
        llist2.insert(3);
        llist2.insert(4);

        MergeTwoSortedList llist3 = new MergeTwoSortedList();
        llist3.print(llist3.merge(llist1.head, llist2.head));


    }
}
