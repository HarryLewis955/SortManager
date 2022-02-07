package com.spartaglobal.sortmanager.model;

import java.util.Arrays;
import static com.spartaglobal.sortmanager.SortMain.logger;

public class BSTF implements Sorter{
    @Override
    public int[] sort(int[] arr) {
        BSTImp tree = new BSTImp(arr.length);
        logger.info("binary search initialised");
        tree.treeIn(arr);
        logger.info("passing array into tree");
        tree.inOrderArray(tree.root);
        logger.info("tree converted to an array");
        return tree.returnResult();
    }
}
