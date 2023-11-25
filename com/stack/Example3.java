package com.stack;

public class Example3 {
    public static void main(String[] args) {
        String str = "{[(<1+2>)]}";
        ExpressionBalancer expressionBalancer = new ExpressionBalancer();

        if(expressionBalancer.isBalanced(str)){
            System.out.println("String is Balanced");
            return;
        }

        System.out.println("String is not Balanced");
    }
}
