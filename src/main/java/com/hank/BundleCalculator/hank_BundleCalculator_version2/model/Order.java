package com.hank.BundleCalculator.hank_BundleCalculator_version2.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();

    public void addItem(OrderItem item){
        this.items.add(item);
    }

    public void deleteItem(OrderItem item){
        this.items.remove(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
