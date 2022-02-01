package com.spartaglobal.sortmanager.view;

import java.util.Scanner;

public class DisplayManager {
    public int getDesiredSortMethod(){
        System.out.println("Please choose the sort method you would like to use 1\n" +
                "1: Bubble, 2:Merge");
        Scanner scanner = new Scanner(System.in);
        int desiredSortMethod = scanner.nextInt();
        return desiredSortMethod;
    }
    public void displayResults(int[] result){
        System.out.println("Here is the sorted list");
        for (int i = 0; i< result.length;i++){
            System.out.print(result[i]+ " ");
        }
    }
}
