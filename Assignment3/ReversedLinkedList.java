public class ReversedLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node nextNode = null;
        
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        
        head = prev;
    }

    public static void main(String args[]) {
        ReversedLinkedList r = new ReversedLinkedList();
        r.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);

        r.head.next = second;
        second.next = third;
        
        System.out.println("Original list:");
        r.display();

        r.reverse();

        System.out.println("Reversed list:");
        r.display();
    }
}
