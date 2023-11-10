
public class linkedList {
    Node head;
    private int size;

    linkedList() {
        size = 0;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // important addLast method
    // by default also it takes addLast method only
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;

        }
        lastNode.next = newNode;
    }

    public void printlinkedList() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
        System.out.print("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        head = this.head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.print("empty list");
            return;
        }
        size--;
        if (head.next != null) {
            head = null;
            return;
        }
        Node curNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            curNode = curNode.next;
            lastNode = lastNode.next;
            curNode = null;
        }
    }

    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printlinkedList();
    }
}
