package edu.ecommerce;

public class Order {
    private int orderId;
    private static int idCounter = 0;
    private String customerName;
    private double total;

    public Order(String customerName) {
        this.customerName = customerName;
        this.orderId = idCounter++;
        this.total = 0;
    }

    public double hitungTotal(OrderItem[] items) {
        double total = 0;
        for(OrderItem item : items) {
            total += item.getSubTotal();
        }
        this.total = total;
        return this.total;
    }

    public void tampilkanRincian(OrderItem[] items) {
        System.out.println("ID pesanan     : " + (this.orderId + 1));
        System.out.println("Nama pelanggan : " + this.customerName);
        System.out.println("\nDaftar item pesanan:");

        for(OrderItem item : items) {
            System.out.println("Nama menu    : " + item.getProductName());
            System.out.println("Jumlah       : " + item.getQuantity());
            System.out.println("Harga        : Rp" + item.getPrice());
            System.out.println("Subtotal     : Rp" + item.getSubTotal() + "\n");
        }

        System.out.println("Total Pembayaran : Rp" + this.hitungTotal(items));
    }

    public class OrderItem{
        private String productName;
        private double price;
        private int quantity;

        public OrderItem(String productName, double price, int quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public String getProductName() {
            return this.productName;
        }

        public double getPrice() {
            return this.price;
        }

        public int getQuantity() {
            return this.quantity;
        }

        public double getSubTotal() {
            return this.price * this.quantity;
        }
    }
}
