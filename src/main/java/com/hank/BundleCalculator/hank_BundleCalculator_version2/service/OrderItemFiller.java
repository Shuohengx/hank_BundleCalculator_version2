package com.hank.BundleCalculator.hank_BundleCalculator_version2.service;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrder;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrderItem;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.Order;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.OrderItem;

import java.util.Map;

public class OrderItemFiller {

    public int[] bundleQuantitiesGet(OrderItem orderItem, FilledOrder filledOrder){
        int[] bundleQuantities = {};
        for (FilledOrderItem filledOrderItem:filledOrder.getFilledOrderItems()){
            if(!orderItem.getMediaType().toUpperCase().equals(filledOrderItem.getMediaType().toUpperCase()))
                continue;
            bundleQuantities = filledOrderItem.bundleQuantitiesGet();
        }
        return bundleQuantities;
    }


    public void bundleNumsUpdate(OrderItem orderItem, FilledOrder filledOrder, Map<Object, Integer> map){
        for (FilledOrderItem filledOrderItem:filledOrder.getFilledOrderItems()){
            if(!orderItem.getMediaType().toUpperCase().equals(filledOrderItem.getMediaType().toUpperCase()))
                continue;
            filledOrderItem.bundleNumUpdate(map);
        }
    }



}

