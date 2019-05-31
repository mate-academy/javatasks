package core.basesyntax;

public class Rhombus {
    /*

    Нарисовать ромб с звёздочек заданной величины.

    Пример: величина 3, значит максимальное кол-во звёзд в ряду будет.

    */

     public static void drawRhombus(int maxSize) {
        for (int i = 0; i < maxSize - 1; i++) {
            for (int n = 0; n <= maxSize - i; n++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = maxSize - 1; i >= 0; i--) {
            for (int n = 0; n <= maxSize - i; n++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
