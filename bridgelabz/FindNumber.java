/*10. Question to find your number
a. Desc -> takes a command-line argument N, asks you to think of a number
between 0 and N-1, where N = 2^n, and always guesses the answer with n
questions.
b. I/P -> the Number N and then recursively ask true/false if the number is between
a high and low value
c. Logic -> Use Binary Search to find the number
d. O/P -> Print the intermediary number and the final answer*/

package com.bridgelabz;
import java.util.Scanner;
public class FindNumber {
    public static Scanner scannerObject = new Scanner(System.in);

    public void findNumber(int low, int high) {

        if(low == high) {
            System.out.println("Your Number is : "+low);
            System.out.println("Intermediatory Number is: "+(low-1)+" and "+(low+1));
            return;
        }

        int middle = (low+high)/2;
        int choice;
        System.out.println("Press 1 if the number is between : "+low+" and "+middle);
        System.out.println("Press 2 if the number is between : "+(middle+1)+" and "+high);
        choice = scannerObject.nextInt();

        if(choice == 1) {
            findNumber(low, middle);
        }
        else {
            findNumber(middle+1, high);
        }
    }

    public static void main(String[] args) {

        FindNumber classObject = new FindNumber();
        System.out.println("Think of a number between 0 and 100");
        int N = Integer.parseInt(args[0]);
        classObject.findNumber(0, N-1);
        scannerObject.close();
    }
}