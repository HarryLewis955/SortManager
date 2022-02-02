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
        int sortMethod = display.getSortMethod();
        SortManager controller = new SortManager();


        int[] arr = {30,40,20,5,6,8};

        logger.warn(Arrays.toString(arr));
        controller.initiateSorting(sortMethod, arr);
        display.displayResults(arr);
    }
}