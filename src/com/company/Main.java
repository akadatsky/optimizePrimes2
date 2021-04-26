package com.company;

public class Main {

    public static final int MAX_COUNT = 200_000;
    // 100_000 => 9.21 s
    // 100_000 => 0.914 s (after brake)
    // 200_000 => 3.231
    // 200_000 => 3.158 s (after return)
    // 200_000 => 1.636 s (after extract 2)
    // 200_000 => 0.016 s

    public static void main(String[] args) {
//        checkIsPrime();
        measureTime();
    }

    private static void measureTime() {
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
        if (value == 2) {
            return true;
        }
        if (value % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
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
