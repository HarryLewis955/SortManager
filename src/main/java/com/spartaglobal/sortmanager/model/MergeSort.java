package com.spartaglobal.sortmanager.model;

public class MergeSort implements Sorter{

    //Goal use merge sort to sort out an array
    //
    public void sort(int[] arr){
        int arrLen =  arr.length;
        // check if the length of the array is 2 or more
        if (arrLen < 2) {
            return;
        }
        // find the midpoint of the array so we can split it in half
        int mid = arrLen/2;
        //create 2 subarrays
        int[] l = new int[mid];
        int[] r = new int[arrLen-mid];

        //populate tables
        for (int i = 0; i<mid;i++){
            l[i] = arr[i];
        }
        for(int i = mid; i<arrLen;i++){
            r[i-mid] = arr[i];
        }
        sort(l);
        sort(r);

        merge(arr,l,r,mid, r.length);


    }
    public void merge(int[] arr, int[] l,int[] r, int le, int re){
        //This will compare elements of both sub arrays and puts the smaller element in the array

        int i = 0, j = 0, k = 0;
        while (i < le && j< re) {
            if(l[i] <= r[j]) {
                arr[k++] = l[i++];
            }
            else{
                arr[k++] = r[j++];
            }
        }
        while (i< le){
            arr[k++] = l[i++];
        }
        while (j<re){
            arr[k++] = r[j++];
        }
    }
    
}
