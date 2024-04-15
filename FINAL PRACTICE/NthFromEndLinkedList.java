class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class NthFromEndLinkedList {

    public static int findNthFromEnd(Node head, int n) {
        if (head == null || n < 1) {
            throw new IllegalArgumentException("Invalid input");
        }

        Node firstPointer = head;
        Node secondPointer = head;

        // Move the first pointer n positions ahead
        for (int i = 0; i < n; i++) {
            if (firstPointer == null) {
                throw new IllegalArgumentException("The linked list is shorter than " + n + " elements");
            }
            firstPointer = firstPointer.next;
        }

        // Move both pointers simultaneously until the first pointer reaches the end
        while (firstPointer != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        return secondPointer.data;
    }

    public static void main(String[] args) {
        // Creating a sample linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int n = 2; // Find the 2nd element from the end (index starts from 1)

        try {
            int nthFromEnd = findNthFromEnd(head, n);
            System.out.println("The " + n + "nd element from the end of the linked list is: " + nthFromEnd);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
