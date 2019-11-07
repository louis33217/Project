/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import com.assignment5.analytics.AnalysisHelper;
import com.assignment5.analytics.DataStore;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import java.io.IOException;

/**
 *
 * @author kasai
 */
public class GateWay {
    
    AnalysisHelper helper;
    
    public GateWay() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();
        helper = new AnalysisHelper();
        
        DataReader orderReader = new DataReader(generator.getOrderFilePath());
        String[] orderRow;
        while((orderRow = orderReader.getNextRow()) != null){
            generateOrder(orderRow);
        }
        DataReader productReader = new DataReader(generator.getProductCataloguePath());
        String[] prodRow;
        while((prodRow = productReader.getNextRow()) != null){
            generateProduct(prodRow);
        }
        runAnalysis();
    }
    public static void main(String args[]) throws IOException{
        GateWay inst = new GateWay();
    }
    
    public static void printRow(String[] row){
        for (String row1 : row) {
            System.out.print(row1 + ", ");
        }
        System.out.println("");
    }
    
    private void generateOrder(String[] row) {
        int orderId = Integer.parseInt(row[0]);
        int itemId = Integer.parseInt(row[1]);
        int productId = Integer.parseInt(row[2]);
        int quantity = Integer.parseInt(row[3]);
        int supplierId = Integer.parseInt(row[4]);
        int customerId = Integer.parseInt(row[5]);
        int salePrice = Integer.parseInt(row[6]);
        Item item = generateItem(itemId, productId, salePrice, quantity);
        Order order = new Order(orderId, supplierId, customerId, item);
        DataStore.getInstance().getOrders().put(orderId, order);
    }
    
    private Item generateItem(int itemId, int productId, int salePrice, int quantity) {
        Item item = new Item(productId, salePrice, quantity);
        DataStore.getInstance().getItems().put(itemId, item);
        return item;
    }
    
    private void generateProduct(String[] row) {
        int productId = Integer.parseInt(row[0]);
        int minPrice = Integer.parseInt(row[1]);
        int maxPrice = Integer.parseInt(row[2]);
        int targetPrice = Integer.parseInt(row[3]);
        Product product = new Product(maxPrice, minPrice, maxPrice, targetPrice);
        DataStore.getInstance().getProducts().put(productId, product);
    }
    
    private void runAnalysis() {
        helper.topThreeProducts();
        helper.topBestCustomers();
    }
}
