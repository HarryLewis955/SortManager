package com.spartaglobal.sortmanager.sortmanagertest;

import com.spartaglobal.sortmanager.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void positiveTest(){
        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] expected = {1,2,3,4,5,6};
        MergeSort ms = new MergeSort();
        ms.sort(actual);
        assertArrayEquals(expected, actual);
    }
}
