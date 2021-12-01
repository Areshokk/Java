package lab3.task2;

public class Main {
    public static void main(final String[] args) {
        try (final MyLaptop myLaptop = new MyLaptop()) {
            myLaptop.read();

        } catch (final Exception e) {   //IOExeption
            System.out.println("IOException");
        }
    }
}

