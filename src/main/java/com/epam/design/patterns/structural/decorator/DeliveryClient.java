package com.epam.design.patterns.structural.decorator;

public class DeliveryClient {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Product("Burger", 10.0));
        order.addItem(new Product("Pizza", 15.0));

        Order gstOrder = new GSTDecorator(order);

        Order orderWithDelivery = new DeliveryChargesDecorator(gstOrder, 2.0);

        Order finalOrder = new RestaurantChargesDecorator(orderWithDelivery, 1.5);

        double totalCost = finalOrder.calculateCost();

        System.out.println("Total Cost of the order: "+  totalCost);
    }
}
