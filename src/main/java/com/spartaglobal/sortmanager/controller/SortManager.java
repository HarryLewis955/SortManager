package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.model.*;

public class SortManager {

    public void initiateSorting(int desiredSortMethod,int[]arr){
        Sorter s = getSorter(desiredSortMethod);
        s.sort(arr);
    }
    public  int[] getRandomArray(int ArraySize, int intMax){

        return GenerateArray.randomArray(ArraySize,intMax);
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
