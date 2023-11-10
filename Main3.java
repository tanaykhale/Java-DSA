import java.util.*;

public class Main3 {

    public static int findWinner(int n, int k) {
        List<Integer> friends = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            friends.add(i);
        }

        int currentIndex = 0;
        while (friends.size() > 1) {
            currentIndex = (currentIndex + k - 1) % friends.size();
            friends.remove(currentIndex);
        }

        return friends.get(0);
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int winner = findWinner(n, k);
        System.out.println("The winner is: " + winner);

    }
}
