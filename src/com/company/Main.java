package com.company;

public class Main {

    public static final int MAX_COUNT = 100_000;
    // 100_000 => 9.21 s

    public static void main(String[] args) {
        //checkIsPrime();

        int count = 0;

        long time = System.currentTimeMillis();

        for (int i = 2; i < MAX_COUNT; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        time = System.currentTimeMillis() - time;


        //System.out.println("Count: " + count);
        System.out.println("Time: " + time / 1000.0 + " s");

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
