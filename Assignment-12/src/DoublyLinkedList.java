import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

public class DoublyLinkedList {
    Node head;

    // Create DLL from user input
    void createList(int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter node " + (i + 1) + " value: ");
            int val = sc.nextInt();
            insertAtEnd(val);
        }
    }

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at 3rd position
    void insertAtPosition(int data, int position) {
        if (position <= 1) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            insertAtEnd(data);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    // Delete first node
    void deleteFirst() {
        if (head == null)
            return;
        head = head.next;
        if (head != null)
            head.prev = null;
    }

    // Delete last node
    void deleteLast() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.prev.next = null;
    }

    // Delete middle (e.g., 3rd position)
    void deleteAtPosition(int position) {
        if (head == null || position <= 0)
            return;
        if (position == 1) {
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < position; i++)
            temp = temp.next;

        if (temp == null)
            return;

        if (temp.prev != null)
            temp.prev.next = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;
    }

    // Display in forward order
    void displayForward() {
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

        System.out.print("Enter number of nodes (N): ");
        int n = sc.nextInt();
        dll.createList(n, sc);
        dll.displayForward();

        // Insert at beginning
        System.out.print("Insert at beginning: ");
        int val1 = sc.nextInt();
        dll.insertAtBeginning(val1);
        dll.displayForward();

        // Insert at end
        System.out.print("Insert at end: ");
        int val2 = sc.nextInt();
        dll.insertAtEnd(val2);
        dll.displayForward();

        // Insert at 3rd position
        System.out.print("Insert at 3rd position: ");
        int val3 = sc.nextInt();
        dll.insertAtPosition(val3, 3);
        dll.displayForward();

        // Delete first node
        System.out.println("Deleting first node...");
        dll.deleteFirst();
        dll.displayForward();

        // Delete last node
        System.out.println("Deleting last node...");
        dll.deleteLast();
        dll.displayForward();

        // Delete node at position 3
        System.out.println("Deleting node at position 3...");
        dll.deleteAtPosition(3);
        dll.displayForward();

        sc.close();
    }
}
