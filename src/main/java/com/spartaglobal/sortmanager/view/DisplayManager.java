package com.spartaglobal.sortmanager.view;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {
    public int getArraySize(){
        System.out.println("Please input how large you would like the array to be");
        Scanner scanner = new Scanner(System.in);
        int desiredArraySize = scanner.nextInt();
        return desiredArraySize;
    }
    public int getMaxIntSize(){
        System.out.println("Please input what the upper limit (largest number) is in the array");
        Scanner scanner = new Scanner(System.in);
        int desiredMaxInt = scanner.nextInt();
        return desiredMaxInt;
    }
    public int getSortMethod(){

        System.out.println("Please choose the sort method you would like to use 1\n" +
                "1: Bubble, 2:Merge");
        Scanner scanner = new Scanner(System.in);
        int desiredSortMethod = scanner.nextInt();
        return desiredSortMethod;
    }
    public void displayGeneratedArray(int[] arr){
        System.out.println("Here is the generated unsorted array");
        System.out.println(Arrays.toString(arr));
    }
    public void displayResults(int[] result){
        System.out.println("Here is the sorted list");
        System.out.println(Arrays.toString(result));
    }
}
