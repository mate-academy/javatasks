package core.basesyntax;

import java.util.Arrays;

public class CheckRemainder {
    /*

    Реализуйте метод checkDivisionRemainder(int[] array, int value),
    принимающий в качестве аргумента массив целых чисел `array`
    и число `value` остаток от деления на которое необходимо проверить.

    Ваш метод, должен вернуть массив, состоящий из чисел, которые делятся без остатка на `value`

     */

    public int[] checkDivisionRemainder(int[] array, int value) {
        if (value == 0) {
            throw new ArithmeticException("Value can not be zero.");
        }
        int[] result = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % value == 0) {
                result[count] = array[i];
                count++;
            }
        }

        return Arrays.copyOf(result, count);
    }
}
