package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.print("Enter lower bound and upper bound : ");
        int start= utility.getIntValue();
        int end=utility.getIntValue();

        utility.findPrimeNumbers(start,end);
    }
}
