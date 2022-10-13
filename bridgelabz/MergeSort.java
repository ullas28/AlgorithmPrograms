/*Merge Sort - Write a program to do Merge Sort of list of Strings.
a. Logic -> To Merge Sort an array, we divide it into two halves, sort the two halves
independently, and then merge the results to sort the full array. To sort a[lo, hi),
we use the following recursive strategy:
b. Base case: If the subarray length is 0 or 1, it is already sorted.
c. Reduction step: Otherwise, compute mid = lo + (hi - lo) / 2, recursively sort the
two subarrays a[lo, mid) and a[mid, hi), and merge them to produce a sorted
result.*/

package com.bridgelabz;
import java.util.Scanner;
public class MergeSort {
    static void bubbleSort(String[] arr, int n)
    {
        int i, j;
        String temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (isAlphabeticallySmaller(
                        arr[j + 1], arr[j])) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop,
            // then break
            if (swapped == false)
                break;
        }
    }

    // Function to compare 2 words
    static boolean isAlphabeticallySmaller(
            String str1, String str2)
    {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the Size Of The Array: ");
        int sizeOfArray = scannerObject.nextInt();
        String[] arrayToBeSorted = new String[sizeOfArray];

        System.out.println("Enter the Array Elements");
        for (int var = 0; var < arrayToBeSorted.length; var++) {
            String word = scannerObject.next();
            arrayToBeSorted[var] = word;
            System.out.println(var);
        }

        int N = arrayToBeSorted.length;
        bubbleSort(arrayToBeSorted, N);
        for (int i = 0; i < N; i++) {
            System.out.println(arrayToBeSorted[i]);
        }
    }
}
