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
import java.util.Arrays;
import java.util.Collections;
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
        List<Integer> idList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        for(Item item: items.values()) {
            int productId = item.getProductId();
            int i = idList.get(productId) + item.getQuantity();
            idList.set(productId, i);
        }
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
        List<Integer> idList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        List<Integer> salesList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        for(Order order: orders.values()) {
            int customerId = order.getCustomerId();
            int salesId = order.getSupplierId();
            int productId = order.getItem().getProductId();
            int salesPrice = order.getItem().getSalesPrice();
            int targetPrice = productList.get(productId).getTargetPrice();
            int quantity = order.getItem().getQuantity();
            int i = idList.get(customerId) + salesPrice - targetPrice;
            idList.set(customerId, i);
            int j = salesList.get(salesId) + (salesPrice - targetPrice) * quantity;
            salesList.set(salesId, j);
        }
        List<Integer> idListStore = new ArrayList<>(idList);
        Collections.sort(idList);
        Collections.reverse(idList);
        System.out.println("\nTop 3 best customers: ");
        for (int i = 0; i < 3; i++) {
            int j = idList.get(i);
            System.out.println("customer id: " + idListStore.indexOf(j) + ", sum of difference: " + j);
            idListStore.set(idListStore.indexOf(j), -1);
        }
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
