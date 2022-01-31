package com.spartaglobal.sortmanager.sortmanagertest;

import com.spartaglobal.sortmanager.SortManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SortManagerTest {

    @Test
    @DisplayName("This will pass ints into bubbleSortMethod")
    public void givenAnArrayOfIntsBubbleSortCorrectly(){
        //Arrange
        int[] array = {9,20,6,4,3};
        SortManager sut2 = new SortManager();
        int[] expectedInts = {3,4,6,9,20};
        //act

        int[] intsSorted = sut2.bubbleSort(array);
        //assert
        Assertions.assertArrayEquals(expectedInts, intsSorted);
    }
}
