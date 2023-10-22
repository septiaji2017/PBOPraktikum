package com.ridha.tugasno3;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        String[] stringsList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHow Many Strings do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine();
        stringsList = new String[size];
        System.out.println("\n Enter the strings...");
        for (int i = 0; i < size; i++)
            stringsList[i] = scan.nextLine();
        Sorting.insertionSort(stringsList);
        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.println(stringsList[i] + " ");
        System.out.println();
    }
}
