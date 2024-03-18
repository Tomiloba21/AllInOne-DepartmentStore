/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllInOneApp;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Order {
    
    
    private String orderID;
    private Customer customer;
    private Product product;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", customer=" + customer.getLastName() + ", product=" + product.getProductName() + '}';
    }
    
    
    
}
