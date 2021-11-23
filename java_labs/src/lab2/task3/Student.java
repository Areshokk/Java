package Lab2.task3;

public class Student {

    private String name;
    private int course;
    private boolean isMale;
    private final Mark mark;
    private final Subject subject;

    public Student(final Subject subject, final String name, final int course, final boolean isMale, final Mark mark) {
        this.name = name;
        this.course = course;
        this.isMale = isMale;
        this.mark = mark;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(final int course) {
        this.course = course;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(final boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", isMale=" + isMale +
                ", mark=" + mark +
                ", subject=" + subject +
                '}';
    }
}

