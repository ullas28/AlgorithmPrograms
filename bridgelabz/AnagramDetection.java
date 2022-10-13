/*An Anagram Detection Example
a. Desc -> One string is an anagram of another if the second is simply a
rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
c. O/P -> The Two Strings are Anagram or not....*/

package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;
public class AnagramDetection {
    public boolean checkIfAnagrams(String firstWord, String secondWord) {

        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();
        char[] firstWordArray = firstWord.toCharArray();
        char[] secondWordArray = secondWord.toCharArray();

        Arrays.sort(firstWordArray);
        Arrays.sort(secondWordArray);
        int compareResult = Arrays.compare(firstWordArray, secondWordArray);

        if(compareResult == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        String firstWord, secondWord;
        Scanner scannerObject = new Scanner(System.in);
        AnagramDetection anagramObject = new AnagramDetection();

        System.out.println("Enter the first word : ");
        firstWord = scannerObject.next();
        System.out.println("Enter the second word : ");
        secondWord = scannerObject.next();
        scannerObject.close();

        boolean result = anagramObject.checkIfAnagrams(firstWord, secondWord);

        if(result)
            System.out.println("The words are anagrams");
        else
            System.out.println("The words are not anagrams");
    }
}