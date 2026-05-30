


public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }

    public static void stackOfIStrings() {

        MyGenericStack<String> stack =
                new MyGenericStack<>();

        stack.push("Java");
        stack.push("PHP");
        stack.push("Python");
        stack.push("C#");

        System.out.println(
                "Size after push: "
                        + stack.size()
        );

        while (!stack.isEmpty()) {

            System.out.println(
                    stack.pop()
            );
        }
    }

    public static void stackOfIntegers() {

        MyGenericStack<Integer> stack =
                new MyGenericStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(
                "Size after push: "
                        + stack.size()
        );

        while (!stack.isEmpty()) {

            System.out.println(
                    stack.pop()
            );
        }
    }

}