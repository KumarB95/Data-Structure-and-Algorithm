package com.bridgelabz.Utility;

import java.util.Arrays;
import java.util.Scanner;


public class Utility {
    Scanner scanner;
    public Utility(){
        scanner=new Scanner(System.in);
    }
    public String getString(){
        return scanner.next();
    }
    public int getIntValue(){
        return scanner.nextInt();
    }

    public void permutation(String input, int Start, int end) {
        if (Start == end - 1) {
            System.out.println(input);
        } else {
            for (int i = Start; i < end; i++) {
                input = swapString(input, Start, i);
                permutation(input, Start + 1, end);
                input = swapString(input, Start, i);
            }
        }
    }

    private String swapString(String input, int i, int j) {
        char temp;
        char[] charArray = input.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    //Binary Search logic
    public int binarySearchAlgo(String[] userStringArray, String check) {
        int left = 0;
        int right = userStringArray.length - 1;
        while (left <= right) {
            int middle = left + (right - 1) / 2;
            // checking the string using compareTo
            int temp = check.compareTo(userStringArray[middle]);
            if (temp == 0)
                return middle;
            if (temp > 0)
                left = middle + 1;
            else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public void insertionSort(int[] arr) {
        System.out.println("## Insertion Sorting ##");
        int temp,j;
        for (int x=0;x<arr.length;x++){
            temp=arr[x];
            j=x;
            while (j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
        }
        printArray(arr);
    }

    private void printArray(int[] arr) {
        System.out.print("After Sorting : ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public void bubbleSort(int[] arr) {
        System.out.println("## Bubble Sorting ##");
        int temp;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }

    public boolean anagram(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        boolean status;

            if (l1 !=l2) {
                status = false;
            }
            else {
                char[] ArrayS1 = s1.toLowerCase().toCharArray();
                char[] ArrayS2 = s2.toLowerCase().toCharArray();
                Arrays.sort(ArrayS1);
                Arrays.sort(ArrayS2);
                status = Arrays.equals(ArrayS1, ArrayS2);
            }

            return status;
    }

    public void findPrimeNumbers(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + " are : ");
        int count;
        for (int i = start; i <= end; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + 1;
            }
            if (count == 2)
                System.out.println(i);
        }
    }
}
