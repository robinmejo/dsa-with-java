import java.util.ArrayList;
import java.util.Arrays;

public class $6_BigOArrayList {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        // O(1) — Access an element by index
        System.out.println("Access: " + arr[2]);

        // Search by data — O(n)
        
        int target = 40;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
            System.out.println("Found at index: " + i);
            break;
            }
        }

        // O(n) — Traverse all elements
        printAllItems(arr);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));

        // Amortized O(1) — Add at the end
        list.add(40);
        System.out.println("After adding: " + list);

        // O(1) — Remove from the end
        list.remove(list.size() - 1);
        System.out.println("After removing last: " + list);

        // O(n) — Insert at the beginning
        list.add(0, 5);
        System.out.println("After inserting first: " + list);

        // O(n) — Remove from the beginning
        list.remove(0);
        System.out.println("After removing first: " + list);

    }

    // O(n) — Visit every element
    public static void printAllItems(int[] arr) {
        for (int item : arr) {
            System.out.println(item);
        }
    }
}