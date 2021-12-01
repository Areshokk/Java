package lab2.task1;

public abstract class Human {
    private String name;

    public String getName() {
        return name;
    }

    public Human(final String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name of human: " + name);
    }

    {
        System.out.println("create object Human ");
    }

    static {
        System.out.println("Human static");
    }
}
