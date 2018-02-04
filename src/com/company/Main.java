package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
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

    /**
     * Написать программу, которая будет высчитывать периметр,
     * площадь, для заданного прямоугольника. Ввод сторон прямоугольника производится при выполнении программы.
     */
    static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("для рассчёта периметра введите длины его сторон (Int)");

        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        System.out.println("периметр равен: " + (a + b) * 2);
        System.out.println("площадь равна: " + (a * b));
    }

    /**
     * Написать программу, которая будет высчитывать
     * длину стороны квадрата по периметру (Вводим периметр – на выходе получаем длину стороны квадрата).
     */
    static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите перметр квадрата (Int)");

        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.println("сторона квадрата: " + a / 4);

    }


    //Написать программу которая вычисляет частное двух чисел.
    //Программа должна проверять правильность введенных пользователем данных и,
    //если они неверные (делитель равен нулю), выдавать сообщение об ошибке.

    static void task4() {
        System.out.println("пишите 2 числа");
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число a ");
        int a = scanner.nextInt();
        System.out.print("введите число b ");
        int b = scanner.nextInt();
        if (b == 0) {
            System.out.println("на ноль делить нельзя");
            task4();
        }
        System.out.println(a / b);
    }

    /**
     * Написать программу вычисления функции 2
     * y ax b   при a  3 ; b 5 . Аргумент x принимает значения от 1 до 5 с шагом 0,5.
     */
    static void task5() {
        double a = 3;
        double b = -5;
        double x = 1;

        while (x != 5) {
            System.out.println(a * Math.pow(x, 2) + b);
            x += 0.5;
        }
    }


}

