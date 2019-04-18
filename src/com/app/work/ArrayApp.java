package com.app.work;

import java.util.Arrays;

public class ArrayApp {

    public static void main(String [] args){

        long [] arr = new long[100];    //make an array of size 100
        int nElems = 0;                 //number of item

        int j;                          //loop counter
        long searchKey;                 //key item to search for
        int found = 0;
        int size;

        for(int i = 0;i<arr.length;i++){

            arr[i] = (long)(Math.random() * 100);
        }

        size = arr.length;
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("");

    //-------------------------------Search Key-----------------------------------
        searchKey = 78;

        for(j = 0;j<size;j++){

            if(arr[j] == searchKey)
                System.out.println("Key found " + searchKey + " at " + j);

            found ++;

        }

        if (found==0){
            System.out.println("Cant find the searchKey");
        }

    //----------------------------------------------------------------------------

    //------------------------------Delete Key------------------------------------

        //searchKey = 31;             //delete item with searchKey
//        for(j=0;j<=size;j++){
//            if(arr[j] == searchKey)
//                break;
//            for(int k =j;k<size -1;k++)
//                arr[k] = arr[k+1];  //move higher ones down
//            size --;
//        }
//
//        for(int i=0;i<size;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println(" ");
//        //Arrays.stream(arr).forEach(System.out::println);


        for(j=0;j<arr.length;j++){
            if(searchKey == arr[j]){
                for(int k=j;k<arr.length-1;k++){
                    arr[k] = arr[k+1];
                }
                break;
            }
        }

        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        System.out.println(" ");

    }
}
