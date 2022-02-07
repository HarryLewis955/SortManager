package com.spartaglobal.sortmanager.sortmanagertest;

import com.spartaglobal.sortmanager.model.BSTF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BSTFTest {
    @Test
    @DisplayName("Given an array of integers, sort the array in ascending order using binary tree")
    public void givenAnArrayOfIntegersSortIt(){
        int[] arr = {19,4,6,5,1,3,29,};
        int[] expected = {1,3,4,5,6,19,29};
        BSTF bst = new BSTF();
        int[] result = bst.sort(arr);

        Assertions.assertArrayEquals(expected, result);
    }

}
