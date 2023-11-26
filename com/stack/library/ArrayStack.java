package com.stack.library;

import java.util.NoSuchElementException;

public class ArrayStack {
    private int[] numbers = new int[1];
    private int count;


    public void push(int element){

        if(numbers.length == count){
            int[] temp = new int[count + 1];

            for(int i=0;i<numbers.length;i++){
                temp[i] = numbers[i];
            }
            numbers = temp;
        }
        numbers[count++] = element;
    }

    public int peek(){
        if(numbers.length==0){
            throw new NoSuchElementException();
        }
        return numbers[numbers.length-1];
    }

    public void pop(){
        int[] temp = new int[numbers.length-1];
        for(int i=0;i< temp.length;i++){
            temp[i] = numbers[i];
        }
        numbers = temp;
    }
}
