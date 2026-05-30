package slack;

import java.util.Stack;

public class ReverseString {

    public static String reverseWords(
            String input
    ) {

        Stack<String> stack =
                new Stack<>();

        String[] words =
                input.split(" ");

        for (String word : words) {

            stack.push(word);
        }

        StringBuilder result =
                new StringBuilder();

        while (!stack.isEmpty()) {

            result.append(
                    stack.pop()
            );

            if (!stack.isEmpty()) {

                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str =
                "Hello Java Stack";

        System.out.println(
                "Before: " + str
        );

        System.out.println(
                "After : "
                        + reverseWords(str)
        );
    }
}