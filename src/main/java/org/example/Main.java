package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");
        //System.out.println("Multiply: " + multiply(6, 7));


    }

    public static int factorial(int n) {
        int result = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        } else if(n == 0)
        {
            return result;
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static int fibonacci (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        } else if(n == 0)
        {
            return 0;
        } else if (n== 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }






}