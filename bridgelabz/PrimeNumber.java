/*Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.*/

package com.bridgelabz;

public class PrimeNumber {
    public boolean checkIfPrime(int numberToCheck) {

        boolean isPrime = true;

        if (numberToCheck == 1 || numberToCheck == 0) {
            return false;
        }

        for (int index = 2; index <= numberToCheck / 2; index++) {
            if (numberToCheck % index == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {

        System.out.println("The prime numbers between 0-1000 are: ");
        PrimeNumber primeNumbers = new PrimeNumber();
        for(int index = 2 ; index<=1000; index++) {
            boolean isPrime = primeNumbers.checkIfPrime(index);
            if (isPrime) {
                System.out.println(index );
            }
        }

    }
}
