package lab2.task3;

public class Subject{
    private String subject;

    public Subject(final String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return subject;
    }
}
