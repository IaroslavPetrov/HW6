package com.company;

public class Main {

    public static void main(String[] args) {
        // Task 1
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] num = {1.57, 7.654, 9.986};
        int[] year = new int[6];
        year[0] = 2000;
        year[1] = 2004;
        year[2] = 2008;
        year[3] = 2012;
        year[4] = 2018;
        year[5] = 2024;

        // Task 2
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i != num.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < year.length; i++) {
            System.out.print(year[i]);
            if (i != year.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Task 3
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = year.length - 1; i >= 0; i--) {
            System.out.print(year[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Task 4
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
                System.out.print(array[i]);
            } else {
                System.out.print(array[i]);
            }
            if (i != array.length - 1) {
                System.out.print(", ");

            }
        }
    }
}