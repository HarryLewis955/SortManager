package com.spartaglobal.sortmanager;

import com.spartaglobal.sortmanager.controller.SortManager;
import com.spartaglobal.sortmanager.view.DisplayManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SortMain {

    public static Logger logger = LogManager.getLogger("Sort Manager Logger");
    public static void main(String[] args) {
        DisplayManager display = new DisplayManager();
        int arraySize = display.getArraySize();
        int intMax = display.getMaxIntSize();

        int sortMethod = display.getSortMethod();
        SortManager controller = new SortManager();
        int[]ranArray = controller.getRandomArray(arraySize, intMax);
        display.displayGeneratedArray(ranArray);


//        logger.warn(Arrays.toString(ranArray));
        controller.initiateSorting(sortMethod, ranArray);
        display.displayResults(ranArray);
    }
}