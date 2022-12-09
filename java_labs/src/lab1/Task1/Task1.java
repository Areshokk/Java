package lab1.Task1;

import java.util.Arrays;

    public class Task1 {
        public static void main(final String[]  args) {

            final String[] array = new String[] {"Welcome ","to ","the ","club ","buddy "};
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            System.out.println("");

            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 1; i < array.length; i++)
                {
                    if (array[i].length() < array[i - 1].length()) {
                        final String tmp = array[i];
                        array[i]= array[i - 1];
                        array[i - 1] = tmp;
                        isSorted = false;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }


