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
            int[] ranArray = controller.getRandomArray(arraySize, intMax);
            display.displayGeneratedArray(ranArray);

            int[] sortArrayO = controller.getArrayCopy(ranArray);
//        logger.warn(Arrays.toString(ranArray));
            long starTime = System.nanoTime();
            sortArrayO = controller.initiateSorting(sortMethod, sortArrayO);
            long endTime = System.nanoTime();
            display.displayResults(sortArrayO, starTime, endTime);

            boolean looper = true;
            while (looper){
                int selection = display.loopAgain();
                if (selection == 1){
                    int newSortMethod = display.getSortMethod();
                    int[] arrayCopy = controller.getArrayCopy(ranArray);
                    display.displayGeneratedArray(arrayCopy);
                    starTime = System.nanoTime();
                    arrayCopy = controller.initiateSorting(newSortMethod, arrayCopy);
                    endTime = System.nanoTime();
                    display.displayResults(arrayCopy,starTime,endTime);
                }
                else
                    looper = false;
        }
    }
}