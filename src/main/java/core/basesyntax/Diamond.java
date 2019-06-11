package core.basesyntax;

import java.io.PrintStream;

public class Diamond {
    /*

    Нарисовать ромб с звёздочек заданной величины.

    Пример: величина 3, значит максимальное кол-во звёзд в ряду будет.

    */

    public static void drawDiamond(int maxSize, PrintStream stream) {
        for (int i = 0; i < maxSize - 1; i++) {
            for (int n = 0; n <= maxSize - i; n++) {
                stream.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                stream.print("* ");
            }
            stream.println();
        }

        for (int i = maxSize - 1; i >= 0; i--) {
            for (int n = 0; n <= maxSize - i; n++) {
                stream.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                stream.print("* ");
            }
            stream.println();
        }
    }

    public static void main(String[] args) {
        drawDiamond(6, System.out);
    }
}
