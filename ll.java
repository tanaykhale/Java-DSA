import java.util.LinkedList;

public class ll {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(0, 2);
        ll.add(1, 3);
        ll.add(2, 4);
        ll.add(3, 5);
        ll.add(4, 6);
        System.out.println(ll);
        int size = ll.size();
        int mid = size / 2;
        System.out.println(mid);
        System.out.println(ll.get(mid));
    }
}
