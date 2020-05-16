package linkedlist;

public class RemoveNthLastNode {
    static Node head;

   static class Node {

        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public void insert(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;

    }

    public void deleteNthNode(int n) {
        Node prev = null;
        Node current = head;
        Node next = head;
        int count = 1;
        while (next.next != null) {
            if (count > n) {
                prev = current;
                current = current.next;
            }
            count++;
            next = next.next;
        }
        if(prev != null) {
            prev.next = current.next;
        }else{
            prev = current;
            head = current.next ;
            //head = null;
        }
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }



    public static void main(String[] args) {
        RemoveNthLastNode one = new RemoveNthLastNode();
        one.insert(1);
        one.insert(2);
        one.insert(4);
        RemoveNthLastNode two = new RemoveNthLastNode();
        two.insert(1);
        two.insert(3);
        two.insert(4);
       // one.print(one.head);
        System.out.println();
        //two.print(two.head);
        RemoveNthLastNode three = new RemoveNthLastNode();
       // System.out.println(one.head.data+" "+two.head.data);

        //removeNthLastNode.deleteNthNode(1);
        //removeNthLastNode.print();
    }

}
