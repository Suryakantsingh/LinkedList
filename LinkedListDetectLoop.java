package linkedlist.singlyLinkedList;

import java.util.Stack;

public class LinkedListDetectLoop {
    Node head;

    class Node {

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

    public boolean detectCycle() {

        Node first = head;
        Node second = head;

        while (second.next != null && second.next.next != null) {
            first = first.next;
            second = second.next.next;

            if (first.data == second.data) {
                return true;
            }
        }
        return false;
    }

    Stack stack = new Stack();
    public boolean isPallindrom(){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast.next != null)
            stack.push(slow.data);

        if(stack.isEmpty()){
            if(slow.data != slow.next.data){
                return false;
            }else{
                return true;
            }
        }

        while(slow.next != null && !stack.isEmpty()){
            if((int)stack.pop() == slow.next.data){

                slow = slow.next;
            }else{
                return false;
            }
        }

        return true;
    }

    public void deleteNode(int val){

        if(head == null)
            return;

         while(head.data == val )
            head = head.next;

        Node temp = head;
        Node prev = head;

        while(temp!= null){

            if(temp.data == val){
                prev.next = temp.next;
                temp = prev.next;
            }else{
                prev = temp;
                temp = temp.next;
            }

        }


    }

    public int binaryToDecimal(){
        if(head == null)
            return 0;
        if(head.next == null)
            return head.data;
        Stack stack = new Stack();
        Node temp =  head;
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        int sum = 0;
        int i = 0 ;
        while(!stack.isEmpty()){
            sum = sum + (int)stack.pop()*(int)Math.pow(2,i);
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        LinkedListDetectLoop linkedList = new LinkedListDetectLoop();
        linkedList.insert(1);
        linkedList.insert(0);
        linkedList.insert(1);
        //linkedList.insert(3);
        //linkedList.insert(4);
        //linkedList.insert(5);
        //linkedList.insert(6);
        linkedList.print();
        System.out.println();
        //System.out.println("Cycle detect "+linkedList.detectCycle());
        //System.out.println("LinkedList is Pallindrome "+linkedList.isPallindrom());
        //linkedList.deleteNode(1);
        System.out.print(linkedList.binaryToDecimal());
        //linkedList.print();

    }
}
