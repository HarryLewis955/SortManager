package com.spartaglobal.sortmanager.model;


import java.util.Random;

public class GenerateArray {
    public static int[] randomArray(int sizeOfArray, int upperLimit){
        Random r = new Random();
        int[] arr = new int[sizeOfArray];
        for(int i=0; i< sizeOfArray; i++){
            arr[i] = r.nextInt(upperLimit+1);
        }
        return arr;
    }


}
