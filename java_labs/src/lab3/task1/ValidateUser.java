package lab3.task1;

public class ValidateUser {
    public static void validate(final User user) throws InvalidUserInput {
        nameValidate(user.getFirstName(), "Name");
        nameValidate(user.getLastName(), "Lastname");
        numberValidate(user.getAge(), "Age");
        emailValidate(user.getEmail(), "E-mail");
        nameValidate(user.getAddress().getCity(), "City");
        nameValidate(user.getAddress().getStreet(), "Street");
        houseValidate(user.getAddress().getHouse());
        numberValidate(user.getAddress().getFlat(), "Flat");

        throw new InvalidUserInput("Validate succsesful", HttpCodeEnum.ERROR2);
    }

    public static void houseValidate (final String house) throws InvalidUserInput {
        if ((house.length()<=0) || house.matches("(.*)\\W(.*)"))
            throw new InvalidUserInput("House should be without any special symbols", HttpCodeEnum.ERROR4);
    }

    public static void numberValidate (final int number, final String typeOfObject) throws InvalidUserInput {
        if (number <= 0)
            throw new InvalidUserInput(typeOfObject + " should be bigger than 0", HttpCodeEnum.ERROR4);
    }

    public static void emailValidate(final String email, final String typeOfObject) throws InvalidUserInput {
        if ((email.length()<=6) || !email.matches("(.*)@(.*)") || !email.matches("(.*)[.](.*)"))
            throw new InvalidUserInput(typeOfObject + " should have '@', '.' and have at least 7 characters", HttpCodeEnum.ERROR4);
    }

    public static void nameValidate(final String name, final String typeOfObject) throws InvalidUserInput {
        if ((name.length()<=2) || name.matches("(.*)\\W(.*)") || name.matches("(.*)\\d(.*)"))
            throw new InvalidUserInput(typeOfObject + " should have only letters and with at least 3 characters", HttpCodeEnum.ERROR4);
    }
}

