package com.ridha.oop.finals;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan ("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Molen", 1000, 20);
        menu.tampilMenuMakanan ();

        menu.placeOrder(1,15);
        menu.displayOrders();

        menu.placeOrder(1,6);
        menu.displayOrders();

        menu.tampilMenuMakanan ();
    }
}
