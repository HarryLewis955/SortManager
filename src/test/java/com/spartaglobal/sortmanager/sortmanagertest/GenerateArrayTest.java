package com.spartaglobal.sortmanager.sortmanagertest;

import com.spartaglobal.sortmanager.model.GenerateArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GenerateArrayTest {
    @Test
    @DisplayName("Given an array size and max number, return an array of that size with a max limit of the max number")
    public void givenAnArraySizeAndMaxNumberReturnAnArray(){
        int arraySize = 5;
        int maxSize = 5;
        // to test I had to make the class return a seeded random array
        int[] result = GenerateArray.randomArray(arraySize,maxSize);
        int[] expected = {5,4,2,2,0};

        Assertions.assertArrayEquals(expected,result);
    }

    @Test
    @DisplayName("Given an array, return a copy of the array")
    public void givenAnArray_returnCopy(){
        int[] expected = {1,3,4,2,7};
        int[] result = GenerateArray.copyArray(expected);

        Assertions.assertArrayEquals(expected,result);
    }
}
