package com.spartaglobal.sortmanager.model;

public class BSTFFactory extends SorterFactory{
    @Override
    public Sorter getInstance() {
        return new BSTF();
    }
}
