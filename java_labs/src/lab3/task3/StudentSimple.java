package lab3.task3;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentSimple {
    private String id;
    private String name;
    private String surname;
    private List<Student> students;

    public StudentSimple(final List<Student> students) {
        this.students = students;
    }

    public StudentSimple() { }

    public StudentSimple(final Student students) {
        this.id = students.getId();
        this.name = students.getName();
        this.surname = students.getSurname();
    }

    void infoAboutStudents() {
        for (final Student student : students) {
            System.out.print(" " + student.getId() + ") Name: " + student.getName() + ", Surname: " + student.getSurname() + ", Age: " + student.getAge() + ", Group: " + student.getGroup());
            for (final Subject subject : student.getSubject()) {
                System.out.print(" Subject:" + subject.getName());
            }
            for (final Mark mark : student.getMark()) {
                System.out.print(" mark: " + mark.getMark());
            }
            System.out.println();
        }
    }

    public List<StudentSimple> listStudentToListSimpleStudent(final List<Student> students) {
        return students.stream().map(StudentSimple::new).collect(Collectors.toList());
    }

    public List<Student> deleteUserWithMark () {
        return students.stream()
                .filter(e -> e.averageMark() > 3).collect(Collectors.toList());
    }

    public List<Student> sort() {
        return students.stream()
                .sorted((o1, o2) -> {
                    if (!Objects.equals(o1.getSurname(), o2.getSurname()))
                        return o1.getSurname().compareTo(o2.getSurname());
                    else if (!Objects.equals(o1.getName(), o2.getName()))
                        return o1.getName().compareTo(o2.getName());
                    else return o1.getName().compareTo(o2.getName());
                }).collect(Collectors.toList());
    }

    public Student getHighestAverage() {
        return students.stream()
                .reduce((a, b) -> a.averageMark() > b.averageMark() ? a : b)
                .get();
    }

    public String nameWithHyphen() {
        return students.stream()
                .map(Student::getName)
                .reduce((s1, s2) -> s1 + "-" + s2).orElse("-");
    }

}
