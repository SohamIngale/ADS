class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class LargestNode {
    Node head;
    Node tail;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public int findLargest() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        int largest = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > largest) {
                largest = current.data;
            }
            current = current.next;
        }
        return largest;
    }

    public static void main(String[] args) {
        LargestNode list = new LargestNode();
        list.insert(1);
        list.insert(5);
        list.insert(3);
        list.insert(7);

        System.out.println("Largest node in the doubly linked list: " + list.findLargest());
    }
}
