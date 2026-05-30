package slack;

import java.util.Stack;

public class ReverseArray {

    public static void reverse(int[] arr) {

        Stack<Integer> stack =
                new Stack<>();

        // Push toàn bộ mảng vào stack
        for (int value : arr) {

            stack.push(value);
        }

        // Pop ra gán lại vào mảng
        for (int i = 0; i < arr.length; i++) {

            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {

        int[] arr =
                {1, 2, 3, 4, 5};

        System.out.println("Before:");

        for (int n : arr) {
            System.out.print(n + " ");
        }

        reverse(arr);

        System.out.println("\nAfter:");

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
