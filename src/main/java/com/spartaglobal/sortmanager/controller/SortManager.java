package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.model.*;

public class SortManager {
    public void initiateSorting(int desiredSortMethod,int[]arr){
        Sorter s = getSorter(desiredSortMethod);
        s.sort(arr);
    }
    public static Sorter getSorter(int sorterNo){
        SorterFactory s = switch(sorterNo){
            case 1 -> new BubbleSortFactory();
            case 2 -> new MergeSortFactory();
            default -> null;
        };
        return s.getInstance();
    }
}
