package com.spartaglobal.sortmanager.model;

public class BSTF implements Sorter{
    @Override
    public void sort(int[] arr) {
        BSTImp tree = new BSTImp();
        tree.treeIn(arr);
        tree.inOrderArray(tree.root);
    }
}
