package com.spartaglobal.sortmanager;

import com.spartaglobal.sortmanager.controller.SortManager;
import com.spartaglobal.sortmanager.view.DisplayManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SortMain {

    public static Logger logger = LogManager.getLogger("Sort Manager Logger");
    public static void main(String[] args) {
            logger.info("Application start!");

            DisplayManager display = new DisplayManager();
            logger.info("Display manager instance created");
            int arraySize = display.getArraySize();
            logger.info("Array size retrieved: "+arraySize);
            int intMax = display.getMaxIntSize();
            logger.info("max number size retrieved: "+intMax);
            int sortMethod = display.getSortMethod();
            SortManager controller = new SortManager();
            int[] ranArray = controller.getRandomArray(arraySize, intMax);
            logger.info("Random array generated: "+ Arrays.toString(ranArray));
            display.displayGeneratedArray(ranArray);

            int[] sortArrayO = controller.getArrayCopy(ranArray);
            logger.info("Array copied: "+ Arrays.toString(sortArrayO));

            long starTime = System.nanoTime();
            sortArrayO = controller.initiateSorting(sortMethod, sortArrayO);
            long endTime = System.nanoTime();
            logger.info("Array sorted");
            display.displayResults(sortArrayO, starTime, endTime);

            boolean looper = true;
            while (looper){
                int selection = display.loopAgain();
                if (selection == 1){
                    logger.info("Re-running sorting using another method");
                    int newSortMethod = display.getSortMethod();
                    logger.info("sort method retrieved: "+ newSortMethod);
                    int[] arrayCopy = controller.getArrayCopy(ranArray);
                    logger.info("unsorted array copied: "+ Arrays.toString(arrayCopy));
                    display.displayGeneratedArray(arrayCopy);
                    starTime = System.nanoTime();
                    arrayCopy = controller.initiateSorting(newSortMethod, arrayCopy);
                    endTime = System.nanoTime();
                    logger.info("Array sorted");
                    display.displayResults(arrayCopy,starTime,endTime);
                }
                else
                    looper = false;
        }
    }
}