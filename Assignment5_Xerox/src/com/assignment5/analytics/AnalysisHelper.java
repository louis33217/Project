/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;

import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class AnalysisHelper {
    //find top 3 best prodcuts
    public void topThreeProducts() {
        Map<Integer, Item> items = DataStore.getInstance().getItems();
        Map<Integer, Integer> productIdMap = new HashMap<>();
        for(Item item: items.values()) {
            int productId = item.getProductId();
            if (productIdMap.containsKey(productId)) {
                int i = productIdMap.get(productId) + item.getQuantity();
                productIdMap.put(productId, i);
            } else {
                productIdMap.put(productId, item.getQuantity());
            }
        }
        List<Integer> idList = new ArrayList<>(productIdMap.values());
        List<Integer> idListStore = new ArrayList<>(idList);
        Collections.sort(idList);
        Collections.reverse(idList);
        System.out.println("\nTop 3 best negotiated products: ");
        for (int i = 0; i < 3; i++) {
            int j = idList.get(i);
            System.out.println("product id: " + idListStore.indexOf(j) + ", total quantity: " + j);
            idListStore.set(idListStore.indexOf(j), -1);
        }
    }
    //find top 3 best customers
    public void topBestCustomers() {
        Map<Integer, Order> orders = DataStore.getInstance().getOrders();
        Map<Integer, Product> products = DataStore.getInstance().getProducts();
        List<Product> productList = new ArrayList<>(products.values());
        Map<Integer, Integer> customerIdMap = new HashMap<>();
        Map<Integer, Integer> salesIdMap = new HashMap<>();
        for(Order order: orders.values()) {
            int customerId = order.getCustomerId();
            int salesId = order.getSupplierId();
            int productId = order.getItem().getProductId();
            int priceDifference = order.getItem().getSalesPrice() - productList.get(productId).getTargetPrice();
            int quantity = order.getItem().getQuantity();
            if (customerIdMap.containsKey(customerId)) {
                int i = customerIdMap.get(customerId) + priceDifference;
                customerIdMap.put(customerId, i);
            } else {
                customerIdMap.put(customerId, priceDifference);
            }
            if (salesIdMap.containsKey(salesId)) {
                int i = salesIdMap.get(salesId) + priceDifference * quantity;
                salesIdMap.put(salesId, i);
            } else {
                salesIdMap.put(salesId, priceDifference * quantity);
            }
        }
        List<Integer> customerList = new ArrayList<>(customerIdMap.values());
        List<Integer> customerListStore = new ArrayList<>(customerList);
        Collections.sort(customerList);
        Collections.reverse(customerList);
        System.out.println("\nTop 3 best customers: ");
        for (int i = 0; i < 3; i++) {
            int j = customerList.get(i);
            System.out.println("customer id: " + customerListStore.indexOf(j) + ", sum of difference: " + j);
            customerListStore.set(customerListStore.indexOf(j), -1);
        }
        List<Integer> salesList = new ArrayList<>(salesIdMap.values());
        List<Integer> salesListStore = new ArrayList<>(salesList);
        Collections.sort(salesList);
        Collections.reverse(salesList);
        System.out.println("\nTop 3 best sales: ");
        for (int i = 0; i < 3; i++) {
            int j = salesList.get(i);
            System.out.println("sale id: " + salesListStore.indexOf(j) + ", profit: " + j);
            salesListStore.set(salesListStore.indexOf(j), -1);
        }
        int revenue = 0;
        for(int i: salesList) {
            revenue = revenue + i;
        }
        System.out.println("\nTotal revenue: " + revenue);
    }
}
