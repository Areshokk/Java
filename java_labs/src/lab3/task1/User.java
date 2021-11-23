package lab3.task1;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    public Address address;

    public User(final String firstName, final String lastName, final int age, final String email, final Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public void showUser() {
        System.out.println("User: " + this.firstName + " " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.println("E-mail: " + this.email);
        address.showAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

}
