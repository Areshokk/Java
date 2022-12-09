package lab1.Task2;

import java.util.Arrays;

public class Task2 {
    public static void main(final String[] args) {

        final String[] strArray = {"Welcome ","to ","the ","club ","buddy "};

        int count = 0;
        for (final String str : strArray) {
            count += str.length();
        }
        final char[] charArray = new char[count];

        int i = 0;
        for (final String str : strArray) {
            for (final char c : str.toCharArray()) {
                charArray[i++] = c;
            }
        }

        int k = 0;
        for (i =0; i < charArray.length; i++){
            if (charArray[i] == 'd'){
                k++;
            }
        }
        System.out.println(k);
//        System.out.println(Arrays.toString(charArray));
    }
}

