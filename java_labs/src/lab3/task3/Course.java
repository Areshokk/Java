package lab3.task3;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Course {
    private static final int mark = 3;
    private final List<Student> students;

    public Course(final List<Student> students) { this.students = students; }

    public Student bestStudent() {
        return students.stream()
                .reduce((a, b) -> a.averageMark() > b.averageMark() ? a : b)
                .get();
    }

    public List<Student> deleteUserWithMark() {
        return students.stream()
                .filter(e -> e.averageMark() > mark).collect(Collectors.toList());
    }

    public List<Student> sortByName() {
        return  students.stream()
                .sorted((s1,s2) -> {
                    if (!Objects.equals(s1.getName(), s2.getName()))
                        return s1.getName().compareTo(s2.getName());
                    else if (!Objects.equals(s1.getLastname(), s2.getLastname()))
                        return s1.getLastname().compareTo(s2.getLastname());
                    else return s1.getLastname().compareTo(s2.getLastname());
                }).collect(Collectors.toList());
    }

    public List<Student> sortBySurname() {
        return students.stream()
                .sorted((s1, s2) -> {
                    if (!Objects.equals(s1.getLastname(), s2.getLastname()))
                        return s1.getLastname().compareTo(s2.getLastname());
                    else if (!Objects.equals(s1.getName(), s2.getName()))
                        return s1.getName().compareTo(s2.getName());
                    else return s1.getName().compareTo(s2.getName());
                }).collect(Collectors.toList());
    }

    public String lastnameWithHyphen() {
        return students.stream()
                .map(Student::getLastname)
                .reduce((s1, s2) -> s1 + "-" + s2).orElse("-");
    }

}
