package DoublyLinkedList;

public class DoublyLinkedList {

    DoublyNode head;

    public void insertAtHead(int data){
        DoublyNode newNode = new DoublyNode(data);
        newNode.next = head;       // if head is null then at this line newNode.next = null
        if (head != null)
            head.prev = newNode;
        head = newNode;
    }

    public void insertAtTail(int data){
        DoublyNode newNode = new DoublyNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DoublyNode current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    public void insertAtPosition(int data, int position){
        DoublyNode newNode = new DoublyNode(data);

        if(head == null && position > 1){
            throw new IndexOutOfBoundsException();
        }

        if(head == null && position == 1){
            head = newNode;
            return;
        }

        if(position == 1){
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            return;
        }

        DoublyNode current = head;
        DoublyNode previous = null;
        int count = 1;

        while (current != null && count < position){
            previous = current;
            current = current.next;
            count++;
        }

        if (current == null && count < position){
            throw new IndexOutOfBoundsException();
        }

        newNode.prev = previous;
        newNode.next = current;

        if(previous != null)
            previous.next = newNode;

        if (current != null)
            current.prev = newNode;
    }

    public void print(){
        DoublyNode current = head;

        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtHead(3);
        doublyLinkedList.insertAtTail(6);
        doublyLinkedList.insertAtHead(1);
        doublyLinkedList.print();
        doublyLinkedList.insertAtPosition(4,1);
        doublyLinkedList.print();
    }
}
