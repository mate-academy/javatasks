package core.basesyntax;

public class BinaryString {
    /*

    Напишите метод toBinaryString(), который принимает на вход целое число value,
    а возвращает String с представлением этого числа в двоичном виде.

    */

    public static String toBinaryString(int value) {
        StringBuilder binaryString = new StringBuilder();

        if (value == 0) {
            return "0";
        }

        while (value > 0) {
            int remainder = value % 2;
            binaryString.append(remainder);
            value = value / 2;
        }

        return binaryString.reverse().toString();
    }
}
