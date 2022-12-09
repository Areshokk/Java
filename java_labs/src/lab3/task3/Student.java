package lab3.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Student {
    private static final int m1 = 0;
    private static final int m2 = 5;
    private static final String english = "English";
    private final long id;
    private final String name;
    private final String lastname;
    private final List<Subject> subject;
    private final List<Mark> marks;
    static long statId = 0;

    public Student(final String name, final String lastname, final List<Subject> subject) {
        this.id = Student.statId++;
        this.name = name;
        this.lastname = lastname;
        this.subject = subject;
        this.marks = setMarkSubject();
    }

    public long getId() { return id; }

    public List<Mark> getMarks() {
        return marks;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void addMark(final int value, final String nameSubject) {
        for (int i = 0; i < subject.size(); i++) {
            if (Objects.equals(subject.get(i).getSubjectName(), nameSubject)) {
                if (value < m1 || value > m2)
                    marks.get(i).getMark().add(m2);
                else
                    marks.get(i).getMark().add(value);
            }
        }
    }

    private List<Mark> setMarkSubject() {
        final List<Mark> marks = new ArrayList<>();

        for (int i = 0; i < subject.size(); i++) {
            final Mark mark = new Mark();
            marks.add(mark);
        }
        return marks;
    }

    public double averageMark() {
        double tmp = 0;
        int count = 0;

        for (final Mark mark : marks) {



            tmp += mark.getMark().stream().mapToInt(value -> value).sum();/*Метод sum() класу IntStream використовується в Java для повернення суми елементів в цьому потоці.*/
            count += mark.getMark().stream().mapToInt(value -> value).count();/*Метод count() повертає кількість елементів у потоці даних*/
        }/*GEt averange*/
        if (count != 0)
            return tmp/count;
        else
            return 0;
    }

    public List<Integer> showEnglish() {
        for (int i = 0; i < subject.size(); i++) {
            if (subject.get(i).getSubjectName().equals(english)) {
                return marks.get(i).getMark().stream().distinct().collect(Collectors.toList());
            }
        }
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + "," +
                " Name: " + this.getName() + "," +
                " Lastname: " + this.getLastname();
    }
}
