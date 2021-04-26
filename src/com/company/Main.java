package com.company;

public class Main {

    public static void main(String[] args) {
        //checkIsPrime();
    }

    public static boolean isPrime(int value) {
        boolean result = true;
        for (int i = 2; i < value - 1; i++) {
            if (value % i == 0) {
                result = false;
            }
        }
        return result;
    }

    private static void checkIsPrime() {
        // true
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(5));
        System.out.println(isPrime(19));

        // false
        System.out.println(isPrime(4));
        System.out.println(isPrime(6));
        System.out.println(isPrime(21));
        System.out.println(isPrime(49));
    }

}
