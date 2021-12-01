package lab2.task1;

public class Student extends Human {
    private int AmountOfMoney;

    public Student(final String name) {
        super(name);
    }

    static {
        System.out.println("Create static Student");
    }

    public int getAmountOfMoney() {
        return AmountOfMoney;
    }

    public void setAmountOfMoney(final int amountOfMoney) {
        AmountOfMoney = amountOfMoney;
    }

    @Override
    public void show() {
        System.out.println("Student " + getName() + " have " + getAmountOfMoney() + " UAH");
    }
}
