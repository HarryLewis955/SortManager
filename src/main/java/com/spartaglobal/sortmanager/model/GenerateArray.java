package com.spartaglobal.sortmanager.model;


import java.util.Random;

public class GenerateArray {
    public static int[] randomArray(int sizeOfArray, int upperLimit){
        Random r = new Random(5);
        int[] arr = new int[sizeOfArray];
        for(int i=0; i< sizeOfArray; i++){
            arr[i] = r.nextInt(upperLimit+1);
        }
        return arr;
    }
    public static int[] copyArray(int[] arr){
        int[] copy = new int[arr.length];
        for (int i = 0; i< arr.length; i++){
            copy[i] = arr[i];
        }
        return copy;
    }

}
