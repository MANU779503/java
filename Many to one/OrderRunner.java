class OrderRunner {
    public static void main(String[] args) {
        Customer customer = new Customer("Amit Sinha", "9998877665");
        Product product = new Product("Wireless Mouse", 799.99);
        Address address = new Address("123 MG Road", "Bangalore");
        Order order = new Order("ORD1234", customer, product, address);

        order.orderDetails();
    }
}
