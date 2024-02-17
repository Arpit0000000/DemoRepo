package DSA.Linked_List;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    
    public void addInMiddle(int data, int index){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst(){
        if(size == 0){
            System.out.println("Linked list is empty.");
            return;
        }
        else if(size == 1){
            head = tail = null;
        }
        head = head.next;
    }

    public static void print_LinkedList(){
        if(head == null){
            System.out.println("Linked list is empty.");
            return;
        }
        Node node = head;
        while(node != null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("Null");
    }

    // public static void print_Recursive(){
    //     if(node == null){
    //         return;
    //     }
    //     System.out.println(node.data+" -> ");
    //     print_Recursive(node.next);
    // }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addInMiddle(100, 2);
        print_LinkedList();
        System.out.println(size);
    }
}
