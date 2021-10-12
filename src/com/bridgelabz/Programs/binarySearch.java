package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter list of word separated by comma ',' :");
        String userString = utility.getString();
        String[] userStringArray = userString.split(",");
        Arrays.sort(userStringArray);
        System.out.println("Enter the word to check :");
        String check = utility.getString();

        int result = utility.binarySearchAlgo(userStringArray, check);
        if (result == -1) {
            System.out.println("word not present");
        } else
            System.out.println(" word present at index : " + result);
    }
}
