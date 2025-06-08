package LinkedList;

public class CircularLinkedList {
    Node head = null;
    Node tail = null;

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            head.next = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void deleteHead(){
        if (head == null)
            return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        tail.next = head;
    }

    public void print(){
        Node current = head;

        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        }while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.print();  // 10 20 30
        cll.deleteHead();
        cll.print();
    }
}
