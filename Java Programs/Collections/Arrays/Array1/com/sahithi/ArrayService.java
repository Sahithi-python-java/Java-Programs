package com.sahithi;

public class ArrayService {
    public static void main(String[] args){
        ArrayService arrayService= new ArrayService();
        arrayService.createIntegerArrays();
    }
    public void createIntegerArrays(){
        int[] numbers={1, 2, 3, 4, 5, 6};

        for(int number:numbers){ //Enhanced Loop
            System.out.println(number);
        }
        //or
        for(int i=0; i<numbers.length; i++){ //Traditional loop
            System.out.println("Element at index "+i+":" +numbers[i]);
        }
    }
}
