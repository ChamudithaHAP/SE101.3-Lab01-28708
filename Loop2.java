package com.mycompany.loop2;

public class Loop2 {

   public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Using "break"
        System.out.println("Using 'break':");
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
        }
        System.out.println("I'm out of the Loop now");

        // Using "continue"
        System.out.println("\nUsing 'continue':");
        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
        }
        System.out.println("I'm out of the Loop now");
    }
}

