package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.model.*;

public class SortManager {

    public int[] initiateSorting(int desiredSortMethod,int[]arr){
        Sorter s = getSorter(desiredSortMethod);
        return s.sort(arr);

    }
    public  int[] getRandomArray(int ArraySize, int intMax){

        return GenerateArray.randomArray(ArraySize,intMax);
    }
    public int[] getArrayCopy(int[] arr){
        return GenerateArray.copyArray(arr);
    }
    public static Sorter getSorter(int sorterNo){
        SorterFactory s = switch(sorterNo){
            case 1 -> new BubbleSortFactory();
            case 2 -> new MergeSortFactory();
            case 3 -> new BSTFFactory();

            default -> null;
        };
        return s.getInstance();
    }

}
