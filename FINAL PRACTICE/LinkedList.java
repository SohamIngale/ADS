class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node detectLoopStart() {
        Node slowPointer = head;
        Node fastPointer = head;
        boolean loopExists = false;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                loopExists = true;
                break;
            }
        }

      
        if (loopExists) {
            slowPointer = head;
            while (slowPointer != fastPointer) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
            return slowPointer;
        } else {
            return null; 
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.head.next.next.next.next = list.head.next;

        Node loopStartNode = list.detectLoopStart();
        if (loopStartNode != null) {
            System.out.println("Start node of the loop: " + loopStartNode.data);
        } else {
            System.out.println("No loop detected in the linked list");
        }
    }
}
