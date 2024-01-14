package com.tree;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(factorialUsingloop(5));
        System.out.println(factorialUsingRecursion(5));
    }

    public static int factorialUsingloop(int number){
        int factorial=1;
        for(int i=number; i>1 ; i--){
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialUsingRecursion(int number){
        if(number==0){
            return 1;
        }

        return number * factorialUsingRecursion(number-1);
    }
}
