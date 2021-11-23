package Lab1.Task4;

public class Task4 {
    public static void main(final String[] args) {

        for (int i = 1; i < 101; i++ ) {
            if(i % (5*3) == 0) {System.out.println(i + " FizzBuzz");}
                else if (i%3 == 0){ System.out.println(i + " Fizz");}
                    else if(i%5 == 0){ System.out.println(i + " Buzz");}
                        else  System.out.println(i);
        }
    }
}

