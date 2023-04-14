package org.example.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingDriver {

    public static void main(String[] args) {

        // Generate array of random Integers
        Integer[] arr = IntStream.generate(() -> (int) (Math.random() * 5000))
                .boxed()
                .limit(100)
                .toArray(Integer[]::new);

        // List first 10 unsorted elements...
        printFirstTenOfArray(arr);

        Integer[] copy1 = copyArray(arr);
        Integer[] copy2 = copyArray(arr);
        Integer[] copy3 = copyArray(arr);
        Integer[] copy4 = copyArray(arr);
        Integer[] copy5 = copyArray(arr);

        System.out.println("\nSelection Sort...");
        SortingUtility.selectionSort(copy1);
        printFirstTenOfArray(copy1);

        System.out.println("\nInsertion Sort...");
        SortingUtility.insertionSort(copy2);
        printFirstTenOfArray(copy2);

        System.out.println("\nBubble Sort...");
        SortingUtility.bubbleSort(copy3);
        printFirstTenOfArray(copy3);

        System.out.println("\nQuick Sort...");
        SortingUtility.quickSort(copy4);
        printFirstTenOfArray(copy4);

        System.out.println("\nMerge Sort...");
        SortingUtility.mergeSort(copy5);
        printFirstTenOfArray(copy5);

    }

    private static <T> void printFirstTenOfArray(T[] obj) {

        if (obj != null) {

            int counter = 1;
            System.out.println("\nFirst 10 of Array...");

            for (T i : obj) {
                System.out.println(counter + ": " + i.toString());

                if (counter >= 10) {
                    break;
                }
                counter++;
            }

        } else {
            System.out.println("Array is null.");
        }
    }

    private static <T> T[] copyArray(T[] obj) {

        T[] copy = (T[]) Arrays.copyOf(obj, obj.length);

        return copy;
    }

}
