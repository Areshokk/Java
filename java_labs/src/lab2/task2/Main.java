package Lab2.task2;

public class Main {
    public static void main(final String[] args) {

        final Stack stack = new Stack();

        stack.push(10);
        stack.push(30);
        stack.push(12);

        System.out.println("Our stack: ");
        for (final Integer i :stack ) {
            System.out.println(i);
        }

        stack.pop();
        System.out.println();
        System.out.println("Our stack: ");
        for (final Integer i :stack ) {
            System.out.println(i);
        }

    }
}

