package com.ridha.tugasno3;

import java.util.Scanner;

public class WeeklySalesModified {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of salespersons: ");
        int numberOfSalespersons = scan.nextInt();
        scan.nextLine();

        Salesperson[] salesStaff = new Salesperson[numberOfSalespersons];

        for (int i = 0; i < salesStaff.length; i++) {
            System.out.println("Enter data for salesperson " + (i + 1) + ":");
            System.out.print("First Name: ");
            String firstName = scan.nextLine();
            System.out.print("Last Name: ");
            String lastName = scan.nextLine();
            System.out.print("Total Sales: ");
            int totalSales = scan.nextInt();
            scan.nextLine();
            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }
        scan.close();
        Sorting.insertionSort(salesStaff);
        System.out.println("\nRanking of Sales of the week\n");
        for(Salesperson s : salesStaff){
            System.out.println(s);
        }
    }
}
