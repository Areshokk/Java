package lab1.Task4;

import java.util.stream.IntStream;

public class Task4 {
    public static void main(final String[] args) {

        for (int i = 1; i < 101; i++ ) {
            if(i % (5*3) == 0) {System.out.println(i + " FizzBuzz");}
                else if (i%3 == 0){ System.out.println(i + " Fizz");}
                    else if(i%5 == 0){ System.out.println(i + " Buzz");}
                        else  System.out.println(i);
        }


//        int number = 7;
//        int counter = 0;
//        for (int i = 0; i < number; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                counter += i;
//
//            }
//        }
//        System.out.println(counter);
//    }


//        return IntStream.range(3, number).filter(n -> n % 3 == 0 || n % 5 == 0).sum();

}}

