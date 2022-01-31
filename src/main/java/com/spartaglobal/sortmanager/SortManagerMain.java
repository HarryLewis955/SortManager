package com.spartaglobal.sortmanager;

public class SortManagerMain {
    public static void main(String[] args) {
        int[] array = {9,20,6,4,3};
        SortManager sm = new SortManager();
        int[] newArray = sm.bubbleSort(array);
        for (int num : newArray){
            System.out.println(num);
        }

    }
}
