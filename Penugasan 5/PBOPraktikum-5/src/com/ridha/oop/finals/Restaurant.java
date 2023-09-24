package com.ridha.oop.finals;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
class Order{
    private final String namaMakanan;
    private final int quant;
    private double hargaFinal;

    public Order (String namaMakanan, double hargaMakanan, int quant) {
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
public class Restaurant {
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private static byte id=0;
    private static final Logger logger = Logger.getLogger(Restaurant.class.getName());

    private List<Order> orders = new ArrayList<>(); //semua order / pesanan di tampung ke restaurant

    public Restaurant () {
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
                logger.log(Level.INFO, "{0} [{1}] \tRp. {2}", new Object[]{namaMakanan[i], stok[i], hargaMakanan[i]});
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
            Order order = new Order(namaMakanan[menuIndex], hargaMakanan[menuIndex], quantity);
            orders.add(order);
            kurangStok(quantity,menuIndex);
        } else {
            logger.log(Level.WARNING,"Invalid menu selection or out of stock.");
        }
    }

    public void displayOrders() {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            logger.log(Level.INFO, "Order {0}: {1} x{2}\tTotal: Rp. {3}",
                    new Object[]{(i + 1), order.getNamaMakanan(), order.getQuant(), order.getTotalPrice()});
        }
    }

}
