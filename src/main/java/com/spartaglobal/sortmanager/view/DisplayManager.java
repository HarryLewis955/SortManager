package com.spartaglobal.sortmanager.view;

import java.util.Arrays;
import java.util.Scanner;


public class DisplayManager {
    public int getArraySize(){

        System.out.println("Please input how large you would like the array to be");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
    public int getMaxIntSize(){
        System.out.println("Please input what the upper limit (largest number) is in the array");
        Scanner scanner = new Scanner(System.in);
        int desiredMaxInt = scanner.nextInt();
        return desiredMaxInt;
    }
    public int getSortMethod(){

        System.out.println("Please choose the sort methods that you would like to use :\n" +
                "1: Bubble, 2:Merge 3: Binary Search ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public void displayGeneratedArray(int[] arr){
        System.out.println("Here is the generated unsorted array");
        System.out.println(Arrays.toString(arr));
    }
    public void displayResults(int[] result, long starTime, long endTime){
        System.out.println("Here is the sorted list");
        long timeDiff = endTime - starTime;
        System.out.println(Arrays.toString(result));
        System.out.println("It took "+ timeDiff+" nanoseconds to complete the sort.");
    }
    public int loopAgain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to try a different method with the same array? (1 = yes)");
        return scanner.nextInt();
    }
}
