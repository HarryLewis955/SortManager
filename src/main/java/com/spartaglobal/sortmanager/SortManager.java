package com.spartaglobal.sortmanager;
import java.util.ArrayList;
public class SortManager implements Sorter{

    public final int[] bubbleSort(int[] array){
        /*
        Bubble sort algorithm sorts by comparing adjacent elements
        and swapping them if they aren't in order.

        it repeatedly passes through the list until the list is sorted
         */

        int temp = 0;
        int lengthArray = array.length;

        // for this we need a nested for loop
        // When the loop below finishes, it indicates that the array is sorted
        for(int i = 0; i< lengthArray; i++){

            //This will loop each time the loop above increments up
            for(int j =0;j < lengthArray-i-1; j++){

                //now we check the two numbers to see if it needs swapping
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }
        return array;
    }
    public int[] mergeSort(int[] array){
        return array;
    }

}
