package lab3.task1;

public class Main {
    public static void main(final String[] args) {
        final Address address1 = new Address("Chervonograd", "Shevchenka", "1", 3);
        final User user1 = new User("Yurii", "Meda", 19, "medayurii@gmail.com", address1);

        final Address address2 = new Address("Chervonograd", "Banderu", "4", -1);
        final User user2 = new User("VlaDick", "Uskiv", 120, "VlaDick@gmail.com", address2);

        try {
            ValidateUser.validate(user1);
        } catch (final InvalidUserInput e) {
            System.out.println(e.getMessage());
        }

        try {
            ValidateUser.validate(user2);
        } catch (final InvalidUserInput e) {
            System.out.println(e.getMessage());
        }
    }
}
