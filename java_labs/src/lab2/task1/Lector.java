package Lab2.task1;

public class Lector extends Human {
    private String TypeOfDiscipline;

    public Lector(final String name,final String TypeOfDiscipline) {
        super(name);
        this.TypeOfDiscipline = TypeOfDiscipline;
    }

    {
        System.out.println("not static Lector");
    }

    static {
        System.out.println("Create static Lector");
    }

    @Override
    public void show() {
        System.out.println("Lector " + getName() + "teaches" + TypeOfDiscipline);
    }
}
