package LinkedList;

public class SinglyLinkedList {

    Node head;

    public void insertAtHead(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void insertAtPosition(int data, int position){

        if (position == 0){
            insertAtHead(data);
            return;
        }

        Node newNode = new Node(data);

        int currentPosition = 1;
        Node current = head;

        while(currentPosition < position && current.next != null){
            current = current.next;
            currentPosition++;
        }

        if(currentPosition < position)
            throw new  IndexOutOfBoundsException();

        newNode.next = current.next;
        current.next = newNode;

    }

    public void reverse(){}

    public void print(){
        Node current = head;

        while (current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
    }
}
