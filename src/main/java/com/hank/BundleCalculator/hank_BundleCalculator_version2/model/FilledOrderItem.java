package com.hank.BundleCalculator.hank_BundleCalculator_version2.model;

import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.List;

public class FilledOrderItem {
    OrderItem orderItem;
    List<FilledBundle> bundles;

    public FilledOrderItem(OrderItem item){
        this.orderItem = item;
        bundles = new ArrayList<>();
    }
    public FilledOrderItem(FilledBundle bundle){
        this.bundles.add(bundle);

    }

}
