package LinkedList;

public class MergeSortedList {

    public static Node mergeList(Node head1, Node head2){
        if(head2 == null)
            return head1;
        if(head1 == null)
            return head2;

        Node head = new Node(0);
        Node temp = head;

        while (head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
            }else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        if(head1 != null)
            temp.next = head1;
        if (head2 != null)
            temp.next = head2;

        head = head.next;
        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList1 = new SinglyLinkedList();
        singlyLinkedList1.head = new Node(1);
        singlyLinkedList1.insertAtTail(3);
        singlyLinkedList1.insertAtTail(5);

        SinglyLinkedList singlyLinkedList2 = new SinglyLinkedList();
        singlyLinkedList2.head = new Node(2);
        singlyLinkedList2.insertAtTail(4);
        singlyLinkedList2.insertAtTail(6);

        Node result = mergeList(singlyLinkedList1.head, singlyLinkedList2.head);
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = result;
        singlyLinkedList.print();

    }
}
