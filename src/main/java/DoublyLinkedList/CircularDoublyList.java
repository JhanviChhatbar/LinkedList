package DoublyLinkedList;

public class CircularDoublyList {
    DoublyNode head = null;

    // Insert at end
    void insert(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            DoublyNode tail = head.prev;

            tail.next = newNode;
            newNode.prev = tail;

            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Display forward
    void displayForward() {
        if (head == null) return;
        DoublyNode current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Display backward
    void displayBackward() {
        if (head == null) return;
        DoublyNode tail = head.prev;
        DoublyNode current = tail;
        do {
            System.out.print(current.data + " ");
            current = current.prev;
        } while (current != tail);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularDoublyList cdll = new CircularDoublyList();
        cdll.insert(10);
        cdll.insert(20);
        cdll.insert(30);

        cdll.displayForward();  // 10 20 30
        cdll.displayBackward(); // 30 20 10
    }
}

