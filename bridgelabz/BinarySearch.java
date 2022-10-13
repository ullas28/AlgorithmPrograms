/*Binary Search the Word from Word List
a. Desc -> Read in a list of words from File. Then prompt the user to enter a word to
search the list. The program reports if the search word is found in the list.
b. I/P -> read in the list words comma separated from a File and then enter the word
to be searched
c. Logic -> Use Arrays to sort the word list and then do the binary search
d. O/P -> Print the result if the word is found or not*/

package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch <T extends Comparable<T>> {
    public int binarySearch(ArrayList<T> arrayToBeSearched, int low, int high, T key) {
        if (high >= low) {
            int middle = low + (high - low) / 2;
            if (arrayToBeSearched.get(middle).equals(key)) {
                return middle;
            }
            if (arrayToBeSearched.get(middle).compareTo(key) > 0) {
                return binarySearch(arrayToBeSearched, low, middle - 1, key);
            }
            return binarySearch(arrayToBeSearched, middle + 1, high, key);
        }
        return -1;
    }

    public static void main(String[] args) {

        BinarySearch<Integer> searchObject = new BinarySearch<Integer>();
        Scanner scannerObject = new Scanner(System.in);
        ArrayList<Integer> arrayToBeSearched = new ArrayList<Integer>();

        System.out.println("Enter the size of The Array: ");
        int sizeOfArray = scannerObject.nextInt();

        System.out.println("Enter Array Elements in Sorted Order");
        for (int index = 0; index < sizeOfArray; index++) {
            Integer word = scannerObject.nextInt();
            arrayToBeSearched.add(word);
        }

        System.out.println("Enter the element to be searched");
        Integer ElementToBeSearched = scannerObject.nextInt();
        scannerObject.close();

        System.out.println("The array is : " + arrayToBeSearched);
        int indexOfWord = searchObject.binarySearch(arrayToBeSearched, 0, sizeOfArray-1, ElementToBeSearched);
        System.out.println("Element [" + ElementToBeSearched + "] found at index: " + indexOfWord);

    }

}