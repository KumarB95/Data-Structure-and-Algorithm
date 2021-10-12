package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Utility;

public class Anagram {
    public static void main(String[] args) {
        Utility utility=new Utility();

        System.out.println("Enter two strings to check Anagram : ");
        String s1= utility.getString();
        String s2= utility.getString();

        if(utility.anagram(s1,s2)){
            System.out.println("The two strings are anagrams ");
        }
        else {
            System.out.println("The two strings not are anagrams ");
        }
    }
}
