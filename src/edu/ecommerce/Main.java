package edu.ecommerce;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nProgram Perhitungan Total Biaya dari Suatu Pesanan yang Terdiri atas Beberapa Item\n");
        Order Arianto = new Order("Arianto");

        Order.OrderItem item1 = Arianto.new OrderItem("Bakso", 20000, 4);
        Order.OrderItem item2 = Arianto.new OrderItem("Roti bakar", 15000, 2);
        Order.OrderItem item3 = Arianto.new OrderItem("Jus jeruk", 10000, 2);
        Order.OrderItem item4 = Arianto.new OrderItem("Es buah", 15000, 2);
        Order.OrderItem item5 = Arianto.new OrderItem("Teh manis", 8000, 2);

        Order.OrderItem[] items = {item1, item2, item3, item4, item5};
        Arianto.tampilkanRincian(items);
    }
}
