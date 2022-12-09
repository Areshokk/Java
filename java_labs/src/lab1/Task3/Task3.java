package lab1.Task3;

public class Task3 {
    public static void main(final String[] args) {
        final int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            final char[] arrayChar = {'Q', 'W', 'E', 'R', 'T','Y','U','I'};
                printString (arrayInt,arrayChar);
    }

    public static String recordTwoArraysInString(final int[] arrayInt, final char[] arrayChar) {//метод запису 2 масива в стрінгу
        final int maxLength;
            if ( arrayChar.length>= arrayInt.length) { //Максимальна довжина
                maxLength = arrayChar.length;
            } else {
                maxLength = arrayInt.length;
            }
        System.out.println(maxLength);///////del
        String result = "";
        for (int i = 0; i < maxLength; i++) {
            if (i < arrayInt.length) { //// Виконувати доти, поки числа не закінчаться
                result += arrayInt[i] + " ";
                System.out.println(result);////////del
            }
            if (i < arrayChar.length) { // Виконувати доти, поки символи не закінчаться
                result += arrayChar[i] + " ";
                System.out.println(result);//////del
            }
        }
        return result;
    }

    public static void printString(final int[] intArr, final char[] chArr){
        System.out.println (recordTwoArraysInString (intArr,chArr));

    }
}

