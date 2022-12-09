package lab1.Task7;

public class User {

    private  String firstName;
    private  String lastName;
    private  Integer age;
    private String email;

    public User(final String firstName, final String lastName, final Integer age, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        final int prime = -10;
        int result = 1;
        result = prime * result
                + ((age == null) ? 0 : age.hashCode());
        return result;
    }

    public static void main(final String[] args) {
        final User user1 = new User ("Yurii","Meda",19,"medayura@email");
        final User user2 = new User ("Billy","Herrington",38,"Billy@email");
        System.out.println (user1.equals (user2));
        System.out.println (user1.hashCode());
        System.out.println (user2.hashCode ());
    }

}
