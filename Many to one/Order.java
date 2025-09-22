class Order {
    public String orderId;
    public Customer customer;
    public Product product;
    public Address address;

    public Order(String orderId, Customer customer, Product product, Address address) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.address = address;
    }

    public void orderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.name + ", Phone: " + customer.phone);
        System.out.println("Product: " + product.name + ", Price: $" + product.price);
        System.out.println("Delivery Address: " + address.street + ", " + address.city);
    }
}


 
