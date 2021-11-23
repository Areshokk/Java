package Lab2.task3;

public class Main {
    public static void main(final String[] args) {
        final Subject OOP = new Subject("OOP");
        final Subject Math = new Subject("Math");

        final Mark YuriiOopMark =new Mark(85);
        final Mark YuriiMathMark =new Mark(100);

        final Mark BillyOopMark =new Mark(75);
        final Mark BillyMathMark =new Mark(95);

        final Student Yurii = new Student(OOP,"Yurii",1,true,YuriiOopMark);

        final Student Billy = new Student(Math,"Billy",2,false,BillyMathMark);

        System.out.println(Yurii);
        System.out.println(Billy);
    }
}
