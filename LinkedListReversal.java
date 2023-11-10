import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListReversal {
    static Node head;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            insert(value);
        }

        System.out.println("Original linked list:");
        display(head);

        head = reverse(head);

        System.out.println("Reversed linked list:");
        display(head);

        scanner.close();
    }

    static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    static Node reverse(Node current) {
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static void display(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
