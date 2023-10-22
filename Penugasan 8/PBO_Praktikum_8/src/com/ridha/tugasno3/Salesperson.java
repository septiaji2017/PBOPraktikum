package com.ridha.tugasno3;

public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;
    public Salesperson(String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    public boolean equals(Object other){
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }
    public int compareTo(Object other){
        if (other instanceof Salesperson){
            Salesperson otherSalesPerson = (Salesperson) other;
            int result;
            result = Integer.compare(this.totalSales, otherSalesPerson.totalSales);
            if (result == 0){
                result = this.lastName.compareTo(otherSalesPerson.lastName);
                if (result == 0){
                    result = this.firstName.compareTo(otherSalesPerson.firstName);
                }
            }
            return result;
        }
        return 0;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getTotalSales(){
        return totalSales;
    }


}
