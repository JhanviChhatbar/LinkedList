package LinkedList;

public class VerifyCircularList {

    public boolean verifyCircularList(Node head){
        Node slowItr = head;
        Node fastItr = head;

        while (fastItr != null && fastItr.next != null){
            slowItr = slowItr.next;
            fastItr = fastItr.next.next;

            if (slowItr == fastItr)
                return true;
        }
        return false;
    }
}
