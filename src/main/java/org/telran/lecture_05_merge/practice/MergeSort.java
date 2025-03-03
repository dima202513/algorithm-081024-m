package org.telran.lecture_05_merge.practice;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        System.arraycopy(arr, 0, left, 0, middle);
        System.arraycopy(arr, middle, right, 0, arr.length - middle);

        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int indexLeft = 0, indexRight = 0, merge = 0;
        int[] result = new int[left.length + right.length];
        while (indexLeft < left.length && indexRight < right.length) {
            if (left[indexLeft] <= right[indexRight]) {
                result[merge++] = left[indexLeft++];
            } else {
                result[merge++] = right[indexRight++];
            }
        }

        while (indexLeft < left.length) {
            result[merge++] = left[indexLeft++];
        }

        while (indexRight < right.length) {
            result[merge++] = right[indexRight++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int[] sortedArr = mergeSort(arr);
        System.out.print("Отсортированный массив: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
//dm
