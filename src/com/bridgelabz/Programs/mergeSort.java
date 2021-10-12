package com.bridgelabz.Programs;

public class mergeSort {
    int[] array;
    int[] tempMergeArr;
    int length;


    public static void main(String[] args) {
        int[] inputArr={5,6,8,16,2};
        mergeSort ms=new mergeSort();
        ms.sort(inputArr);

        for (int i:inputArr){
            System.out.print(i+" ");
        }
    }

    private void sort(int[] inputArr) {
        this.array=inputArr;
        this.length= inputArr.length;
        this.tempMergeArr=new int[length];
        divideArray(0,length-1);
    }

    private void divideArray(int lowerIndex, int higherIndex) {
        if (lowerIndex<higherIndex){
            int middle=lowerIndex+(higherIndex-lowerIndex)/2;
            //It will sort left side of an array
            divideArray(lowerIndex,middle);

            //It will sort Left side
            divideArray(middle+1,higherIndex);

            arrayMerge(lowerIndex,middle,higherIndex);
        }
    }

    private void arrayMerge(int lowerIndex, int middle, int higherIndex) {
        for (int i=lowerIndex;i<higherIndex;i++){
            tempMergeArr[i]=array[i];
        }

        int i=lowerIndex;
        int j=middle+1;
        int k=lowerIndex;

        while (i<=middle && j<higherIndex){
            if (tempMergeArr[i] <= tempMergeArr[j]){
                array[k]=tempMergeArr[i];
                i++;
            }
            else {
                array[k]=tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i<=middle){
            array[k]=tempMergeArr[i];
            k++;
            i++;
        }
    }

}
