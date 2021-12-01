package lab3.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final Subject physics = new Subject("Physics");
        final Subject english = new Subject("English");
        final Subject math = new Subject("Math");
        final Subject oop = new Subject("OOP");

        final List<Subject> subjects = new ArrayList<>();
        subjects.add(physics);
        subjects.add(english);
        subjects.add(math);
        subjects.add(oop);

        final Student s1 = new Student("Yurii", "Meda", subjects);
        final Student s2 = new Student("Billy", "Herington", subjects);
        final Student s3 = new Student("Van", "Darkholme", subjects);
        final Student s4 = new Student("Danny", "Lee", subjects);

        final List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        final StudentSimple studentSimples = new StudentSimple();
        studentSimples.transformed(students);

        students.get(0).addMark(5, "Physics");
        students.get(1).addMark(3, "Physics");
        students.get(2).addMark(2, "Physics");
        students.get(3).addMark(3, "Physics");

        students.get(0).addMark(5, "English");
        students.get(1).addMark(4, "English");
        students.get(2).addMark(4, "English");
        students.get(3).addMark(2, "English");

        students.get(0).addMark(5, "Math");
        students.get(1).addMark(3, "Math");
        students.get(2).addMark(3, "Math");
        students.get(3).addMark(2, "Math");

        students.get(0).addMark(5, "OOP");
        students.get(1).addMark(3, "OOP");
        students.get(2).addMark(3, "OOP");
        students.get(3).addMark(3, "OOP");

        System.out.print("Average mark: ");
        System.out.println(s1.averageMark());

        System.out.print("English: ");
        System.out.println(s1.showEnglish());
        System.out.println();
        final Course course = new Course(students);

        System.out.print("Best student: ");
        System.out.println(course.bestStudent());
        System.out.println();
        System.out.print("Sorted < '3' mark: ");
        System.out.println(course.deleteUserWithMark());
        System.out.println();
        System.out.println("Sorted by name: ");
        System.out.println(course.sortByName());
        System.out.println("Sorted by surname: ");
        System.out.println(course.sortBySurname());
        System.out.println();
        System.out.println("Lastnames with hyphen: ");
        System.out.println(course.lastnameWithHyphen());
    }
}
