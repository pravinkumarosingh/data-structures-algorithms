package com.stack.library;

public class ArrayStack {
    private int[] numbers;
    private int count;

    public ArrayStack(int length){
        numbers = new int[length];
    }
    public void push(int element){

        if(numbers.length == count){
            int[] temp = new int[count * 2];

            for(int i=0;i<numbers.length;i++){
                temp[i] = numbers[i];
            }
            numbers = temp;
        }
        numbers[count++] = element;
    }

    public int peek(){
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
