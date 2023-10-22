package com.ridha.tugasno1;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double eCommissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = eCommissionRate;
        totalSales = 0.0;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    @Override
    public double pay() {
        double commissionEarning = totalSales * commissionRate;
        double payment = super.pay() + commissionEarning;
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
