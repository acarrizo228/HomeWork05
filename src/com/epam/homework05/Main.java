package com.epam.homework05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 5;
        final int MULTIPLIER = 10;
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * MULTIPLIER) - size);
        }
        int secondArray[] = new int[size];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = (int) ((Math.random() * MULTIPLIER) - size);
        }
        int thirdArray[] = new int[size];
        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = (int) ((Math.random() * MULTIPLIER) - size);
        }


        System.out.println("Task 1");
        showArray(array);
        System.out.println("\n\nTask 2");
        sumEvenElements(array);
        System.out.println("\n\nTask 3");
        System.out.println(Arrays.toString(sumOfTwoArr(array,secondArray)));
        System.out.println("\n\nTask 4");
        divideArrays(thirdArray);
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void showArray(int array[]) {
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        //выведен массив в обратном порядке
    }

    public static void sumEvenElements(int array[]) {
        printArray(array);
        int sum = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
                index++;
            }
        }
        System.out.println("Сумма нечетных элементов равна : " + sum +
                " Количество нечетных элементов равно : " + index);
    }

    public static int[] sumOfTwoArr(int array[], int secondArray[]) {
        //попарная сумма элементов двух массивов
        printArray(array);
        printArray(secondArray);
        int[] sum = new int[array.length];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = array[i] + secondArray[i];
        }
        return sum;
    }

    public static void divideArrays(int array[]) {
        printArray(array);
        int posCount = 0;
        int negCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                posCount++;
            } else if (array[i] < 0) {
                negCount++;
            }
        }
        int[] positiveArray = new int[posCount];
        int[] negativeArray = new int[negCount];
        int j = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveArray[j] = array[i];
                ++j;
            } else if (array[i] < 0) {
                negativeArray[k] = array[i];
                ++k;
            }
        }
        printArray(positiveArray);
        printArray(negativeArray);
    }
}