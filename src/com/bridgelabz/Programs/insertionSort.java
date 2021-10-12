package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

public class insertionSort {
    public static void main(String[] args) {
        Utility utility=new Utility();
        int arr[]={2,5,4,8,6,7,5,48,6,5,8,95,5};
        System.out.println("Original order : 2,5,4,8,6,7,5,48,6,5,8,95,5  ");
        utility.insertionSort(arr);
        utility.bubbleSort(arr);
    }

}
