package Lab2.task1;

public class Main {
    public static void main(final String[] args) {
        final Student Me = new Student("Yurii");
        System.out.println();
        final Lector q = new Lector("Dmytro "," programming");
        System.out.println();

        Me.setAmountOfMoney(0);
        Me.show();
        System.out.println();
        q.show();
    }
}
