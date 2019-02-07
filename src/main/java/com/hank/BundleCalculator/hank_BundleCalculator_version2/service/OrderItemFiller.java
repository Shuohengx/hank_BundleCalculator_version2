package com.hank.BundleCalculator.hank_BundleCalculator_version2.service;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.*;

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

//-------------Update and reverse sort-----------------------------------------------------------------------------
    public void bundleNumsUpdate(OrderItem orderItem, FilledOrder filledOrder, Map<Object, Integer> bundleDistributinMap){
        for (FilledOrderItem filledOrderItem:filledOrder.getFilledOrderItems()){

            if(!orderItem.getMediaType().toUpperCase().equals(filledOrderItem.getMediaType().toUpperCase()))
                continue;

            filledOrderItem.getFilledBundles().sort((o1, o2) -> Integer.compare(o2.bundleQuantityGet(), o1.bundleQuantityGet()));
            filledOrderItem.bundleNumUpdate(bundleDistributinMap);
        }
    }



}

