package com.stack;

import java.util.Stack;

public class ExpressionBalancer {
    public boolean isBalanced(String str){
        if(str==null){
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();
        for(Character ch : str.toCharArray()){
            if(isLeftCharacter(ch)){
                stack.push(ch);
            }
            if(isRightCharacter(ch)){
                if(stack.empty()) return false;
                stack.pop();
            }

        }
        return stack.empty();

    }

    private static boolean isRightCharacter(Character ch) {
        return ch == ')' || ch == '>' || ch == ']' || ch == '}';
    }

    private static boolean isLeftCharacter(Character ch) {
        return ch == '(' || ch == '<' || ch == '[' || ch == '{';
    }
}
