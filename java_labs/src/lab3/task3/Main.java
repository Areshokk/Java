package lab3.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {

        final Subject physics = new Subject("Physics");
        final Subject math = new Subject("Math");
        final Subject english = new Subject("English");
        final Subject oop = new Subject("OOP");

        final List<Subject> subjects = new ArrayList<>();
        subjects.add(physics);
        subjects.add(math);
        subjects.add(english);
        subjects.add(oop);

        final Student Yurii = new Student("1", "Yurii", "Meda", 19, "IT-13",subjects);
        final Student VlaDick = new Student("2","VlaDick", "Uskiv", 19, "IT-13", subjects);
        final Student Billy = new Student("3","Billy", "Herington", 20, "IT-01", subjects);
        final Student Jotaro = new Student("4","Jōtarō", "Kūjō ", 99, "ІТ-01", subjects);

        final List<Student> students = new ArrayList<>();
        students.add(Yurii);
        students.add(VlaDick);
        students.add(Billy);
        students.add(Jotaro);

        students.get(0).addMark(4, "English");
        students.get(0).addMark(5, "Math");
        students.get(0).addMark(4, "Physics");
        students.get(0).addMark(5, "OOP");

        students.get(1).addMark(4, "English");
        students.get(1).addMark(3, "Math");
        students.get(1).addMark(3, "Physics");
        students.get(1).addMark(4, "OOP");

        students.get(2).addMark(3, "English");
        students.get(2).addMark(4, "Math");
        students.get(2).addMark(3, "Physics");
        students.get(2).addMark(5, "OOP");

        students.get(3).addMark(4, "English");
        students.get(3).addMark(2, "Math");
        students.get(3).addMark(2, "Physics");
        students.get(3).addMark(3, "OOP");

        final StudentSimple studentSimple = new StudentSimple(students);
        System.out.println();
        studentSimple.infoAboutStudents();
        System.out.println();
        System.out.println("Average rating " + Yurii.averageMark());
        System.out.println();
        System.out.println("English rating " + Yurii.showEnglish());
        System.out.println();
        System.out.println("Highest average score " + studentSimple.getHighestAverage());
        System.out.println();
        System.out.println("Name with hyphen " + studentSimple.nameWithHyphen());
        System.out.println();
    }
}
