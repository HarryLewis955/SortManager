package com.spartaglobal.sortmanager.sortmanagertest;

import com.spartaglobal.sortmanager.model.BSTF;
import com.spartaglobal.sortmanager.model.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {
    @Test
    @DisplayName("Given an array of integers, sort the array in ascending order using bubble sort")
    public void givenAnArrayOfIntegersSortIt(){
        int[] arr = {19,4,6,5,1,3,29,};
        int[] expected = {1,3,4,5,6,19,29};
        BubbleSort bs = new BubbleSort();
        int[] result = bs.sort(arr);

        Assertions.assertArrayEquals(expected, result);
    }

}
