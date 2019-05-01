package com.app.work;

import java.util.Arrays;

public class BinarySearch {

    static long [] array = new long[10];

    public static void main(String[] args) {

        for(int i = 0;i<array.length;i++){

            array[i] = (long)(Math.random() * 100);
        }

        Arrays.stream(array).forEach(System.out::println);
        System.out.println("");

        long searchKey = 40;
        int currIndex;
        int lowerIndex = 0;
        int upperIndex = array.length -1;
        while(true){
            currIndex = (lowerIndex + upperIndex)/2;

            if(array[currIndex] == searchKey){
                System.out.println("Key found at: "+ currIndex);
            }
            else if(upperIndex>currIndex){
                lowerIndex = currIndex +1;
            }
            else
                upperIndex = currIndex -1;
        }
    }



}
