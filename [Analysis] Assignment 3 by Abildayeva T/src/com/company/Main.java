package com.company;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void rearrangeArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            while (left <= right && array[left] < 0) {
                left++;
            }

            while (left <= right && array[right] >= 0) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int[] createArray(int arraySize) {
        int[] array = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(200) - 100;
        }
        return array;
    }

        public static void main(String[] args) {
        int arraySize = 5;

//        int[] array = {-1, 2, 3, -4, 5, 6, -7, 8, 9, -10};
        int[] array = createArray(arraySize);

        System.out.println("Original Array: " + Arrays.toString(array));
        rearrangeArray(array);
        System.out.println("Rearranged Array: " + Arrays.toString(array));
    }
}
