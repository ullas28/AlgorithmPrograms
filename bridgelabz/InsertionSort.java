/*Insertion Sort
a. Desc -> Reads in strings and prints them in sorted order using insertion sort.
b. I/P -> read in the list words
c. Logic -> Use Insertion Sort to sort the words in the String array
d. O/P -> Print the Sorted List*/

package com.bridgelabz;


public class InsertionSort{
    public void sort(String array[])
    {
        //Insertion sort
        for(int i=0 ; i<array.length-1; i++)
        {
            String temp = array[i];
            int j = i-1;
            while(j>=0 && array[j].compareTo(temp)>0)
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1]=temp;
        }
    }

    public static void main(String[] args)
    {
        String array[] = {"hi","hello","james","how","are","you"};
        InsertionSort obj = new InsertionSort();
        obj.sort(array);

        //print array elements
        for(String elements: array)
        {
            System.out.print(elements+" ");
        }
    }

}