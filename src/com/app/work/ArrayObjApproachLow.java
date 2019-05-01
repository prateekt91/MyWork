package com.app.work;

import java.util.Arrays;

class LowArray {

    private long [] a;              //ref to array

    public LowArray(){}

    public LowArray(int size){       //constructor to create an array
        a = new long[size];
    }

    public void setElem(int index, long value){     //set value
        a[index] = value;
    }

    public long getElem(int index){                 //get value
        return a[index];
    }

}

class ArrayObjApproachLow {

    public static void main(String[] args) {

        LowArray arr;                        //array reference
        arr = new LowArray(10);         //LowArray Object

        int nElem = 0;                      //number of item in an array
        int j;                               //loop variable
        int found = 0;                      //counter for finding key

        arr.setElem(0,77);
        arr.setElem(1,34);
        arr.setElem(2,92);
        arr.setElem(3,82);
        arr.setElem(4,20);
        arr.setElem(5,97);
        arr.setElem(6,49);
        arr.setElem(7,55);
        arr.setElem(8,00);
        arr.setElem(9,33);
        nElem = 10;                        //10 items in an array

        for(j=0;j<nElem;j++)                            //display items
            System.out.print(arr.getElem(j)+" ");

        System.out.println("");


        int searchKey = 0;
        for(j=0;j<nElem;j++){                                   //search key
            if(arr.getElem(j) == searchKey) {
                System.out.println("Found the Key " + searchKey + " at position: " + j);
                found ++;
            }
        }

        if(found == 0)
            System.out.println("Unable to find the key: "+ searchKey);


                            //Delete elem 92

        int delElem = 92;
//
//        for(j=0;j<nElem;j++)
//            if (arr.getElem(j) == delElem)                   //look for element
//                break;
//                for (int k = j; k < nElem-1; k++)
//                    arr.setElem(k, arr.getElem(k + 1));          //higher ones down
//
//                nElem--;


        for(j=0;j<nElem;j++){
            if(arr.getElem(j) == delElem){

                for(int k=j;k<nElem-1;k++){
                    arr.setElem(k,arr.getElem(k+1));
                }
                nElem--;
                break;
            }

        }





//        for(j=0;j<arr.length;j++){
//            if(searchKey == arr[j]){
//                for(int k=j;k<arr.length-1;k++){
//                    arr[k] = arr[k+1];
//                }
//                break;
//            }
//        }




        for(j=0;j<nElem;j++)
            System.out.print(arr.getElem(j)+ " ");
        System.out.println("");

        System.out.println(arr.getElem(8));
    }


}


