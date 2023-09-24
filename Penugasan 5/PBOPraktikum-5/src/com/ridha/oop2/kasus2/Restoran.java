package com.ridha.oop2.kasus2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Penjualan{
    private final String namaMakanan;
    private final int quant;
    private double hargaFinal;

    public Penjualan (String namaMakanan, double hargaMakanan, int quant) {
        this.namaMakanan = namaMakanan;
        this.quant = quant;
        this.hargaFinal = quant * hargaMakanan;
    }

    public int getQuant() {
        return quant;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public double getTotalPrice(){
        return hargaFinal;
    }
}

class Produk{
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private static byte id=0;
    private static final Logger logger = Logger.getLogger(Produk.class.getName());

    private List<Penjualan> orders = new ArrayList<>(); //semua order / pesanan di tampung ke restaurant

    public Produk () {
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan (String nama, double harga, int stok) {
        this.namaMakanan [id] = nama;
        this.hargaMakanan [id] = harga;
        this.stok [id] = stok;
    }
    public void tampilMenuMakanan () {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.printf("%-5d %-20s Rp.%-10.2f %-5d%n",i, namaMakanan [i], hargaMakanan [i],stok [i]);
            }
        }
    }

    public boolean isOutOfStock (int id) {
        return (stok [id] == 0);
    }

    public static void nextId() {
        id++;
    }

    public boolean isQuantityMoreThanStock(int id, int quantity){
        return quantity>stok[id];
    }

    public void kurangStok(int jml, int id){
        this.stok [id] -= jml;
    }
    public void placeOrder(int menuIndex, int quantity) {
        if (menuIndex >= 0 && menuIndex <= id && !isOutOfStock(menuIndex) && !isQuantityMoreThanStock(menuIndex, quantity)) {
            Penjualan order = new Penjualan(namaMakanan[menuIndex], hargaMakanan[menuIndex], quantity);
            orders.add(order);
            kurangStok(quantity,menuIndex);
        } else {
            logger.log(Level.WARNING,"Invalid menu selection or out of stock.");
        }
    }

    public void displayOrders() {
        System.out.println("=============================================");
        System.out.println("                I N V O I C E                ");
        System.out.println("=============================================");
        for (int i = 0; i < orders.size(); i++) {
            Penjualan order = orders.get(i);
            System.out.printf("Order %d:\n%s x%d\tTotal: Rp. %.2f%n", (i + 1), order.getNamaMakanan(), order.getQuant(), order.getTotalPrice());
        }
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Penjualan order : orders) {
            total += order.getTotalPrice();
        }
        return total;
    }

}
public class Restoran {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double hargaTotal = 0;
        String keputusan = "Y";

        Produk prd = new Produk();
        System.out.println("Welcome To the menu!");

        System.out.printf("%-5s %-20s %-13s %-5s%n","ID","Nama","Harga","Qty");
        prd.tambahMenuMakanan ("Batagor", 5000, 200);
        Produk.nextId();
        prd.tambahMenuMakanan ("Roti Bakar", 12000, 200);
        Produk.nextId();
        prd.tambahMenuMakanan ("Indomie + Telor", 10000, 200);
        Produk.nextId();
        prd.tambahMenuMakanan ("Kwetiaw", 12000, 200);
        Produk.nextId();
        prd.tambahMenuMakanan ("Nasi Goreng", 12000, 200);
        Produk.nextId();
        prd.tambahMenuMakanan ("Air Mineral", 3000, 200);
        Produk.nextId();
        prd.tambahMenuMakanan ("Teh Manis", 4000, 200);
        Produk.nextId();
        prd.tambahMenuMakanan ("Jus Alpukat", 8000, 200);
        Produk.nextId();
        prd.tambahMenuMakanan ("Teh Botol", 5000, 200);
        Produk.nextId();
        prd.tambahMenuMakanan ("Kopi", 3000, 200);
        while (keputusan.equals("Y")) {
            prd.tampilMenuMakanan();
            System.out.print("Pilih Angka untuk memesan makanan dan minuman: ");
            int productId = input.nextInt();
            System.out.print("Masukkan jumlahnya: ");
            int qty = input.nextInt();
            input.nextLine();
            prd.placeOrder(productId, qty);
            System.out.println("Ingin Mesan lagi (Y/T)? ");
            keputusan = input.nextLine();
            if (!keputusan.equalsIgnoreCase("Y")){
                break;
            }
        }
        prd.displayOrders();
        hargaTotal += prd.calculateTotalPrice();
        System.out.println("Harga Total: "+hargaTotal);
    }
}
