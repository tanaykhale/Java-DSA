public class linkedList_search {
    Node head;
    private int size;

    linkedList_search() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFist(String data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void printll() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("null");

    }

    public void search(String key) {
        int count = 0;
        Node currNode = head;
        // if (currNode.data == key) {
        // System.out.println(currNode.data + "is at index " + count++);
        // }
        while (currNode != null) {
            if (currNode.data == key) {
                System.out.println(count);
                currNode.next = head;
                // head = currNode;
                count++;
            }

        }
    }

    public static void main(String[] args) {
        linkedList_search obj = new linkedList_search();
        obj.addFist("1");
        obj.addFist("5");
        obj.addFist("7");
        obj.addFist("3");
        obj.addFist("8");
        obj.addFist("2");
        obj.addFist("3");

        // obj.printll();

        obj.search("7");
    }
}
