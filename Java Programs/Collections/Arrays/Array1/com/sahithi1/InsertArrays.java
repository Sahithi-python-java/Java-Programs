package com.sahithi1;

public class InsertArrays {
    public static void main(String[] args){
        InsertArrays insertArray=new InsertArrays();
        insertArray.InsertArraysMethod();
    }

    public void InsertArraysMethod(){
        int[] numbers= new int[3];// max size of Array is 3
        numbers[0]=(10);
        numbers[1]=(20);
        numbers[2]=(30);
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
