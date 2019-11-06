/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;

import com.assignment5.entities.Item;
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
}
