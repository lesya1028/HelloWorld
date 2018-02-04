package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
    }

    /**
     * Написать программу, которая будет высчитывать корни для квадратного уравнения.
     * Ввод коэффициентов при неизвестных производится при выполнении программы.
     */
    static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ax^2 + bx + c = 0");
        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("b = ");
        double b = scanner.nextDouble();

        System.out.print("c = ");
        double c = scanner.nextDouble();

        double d = (b * b) - (4 * a * c);

        if (d < 0) {

            System.out.println("уравнение не имеет корней");

        } else if (d == 0) {
            double x1 = (-1 * b) / (2 * a);

            System.out.println("Дискриминант D = " + d);
            System.out.println("x = " + x1);

        } else if (d > 0) {
            double x1 = ((-1 * b) - Math.sqrt(d)) / (2 * a);
            double x2 = ((-1 * b) + Math.sqrt(d)) / (2 * a);

            System.out.println("Дискриминант D = " + d);
            System.out.format("x1 = %x1 ; x2 = %x2", x1, x2);
        }
    }
}
