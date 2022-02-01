package com.spartaglobal.sortmanager;

import com.spartaglobal.sortmanager.controller.SortManager;
import com.spartaglobal.sortmanager.view.DisplayManager;

public class SortMain {
    public static void main(String[] args) {
        DisplayManager display = new DisplayManager();
        int desiredSortMethod = display.getDesiredSortMethod();
        SortManager controller = new SortManager();

        int[] arr = {30,40,20,5,6,8};

        controller.initiateSorting(desiredSortMethod, arr);
        display.displayResults(arr);
    }
}