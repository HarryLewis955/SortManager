package com.spartaglobal.sortmanager.sortmanagertest;

import com.spartaglobal.sortmanager.model.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeSortTest {



        @Test
        @DisplayName("Given an array of integers, sort the array in ascending order using merge sort")
        public void givenAnArrayOfIntegersSortIt(){
            int[] arr = {19,4,6,5,1,3,29,};
            int[] expected = {1,3,4,5,6,19,29};
            MergeSort ms = new MergeSort();
            int[] result = ms.sort(arr);

            Assertions.assertArrayEquals(expected, result);
        }
    }


