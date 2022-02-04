package com.spartaglobal.sortmanager.model;

import java.util.Arrays;

public class BSTF implements Sorter{
    @Override
    public int[] sort(int[] arr) {
        BSTImp tree = new BSTImp(arr.length);
        tree.treeIn(arr);
        tree.inOrderArray(tree.root);
        int[] bArray = tree.returnResult();

        return bArray;
    }
}
