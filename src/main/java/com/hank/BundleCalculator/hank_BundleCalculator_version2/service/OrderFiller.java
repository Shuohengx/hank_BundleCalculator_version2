package com.hank.BundleCalculator.hank_BundleCalculator_version2.service;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.*;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.progress.BundleDistributionCalculator;

import java.util.*;

public class OrderFiller {

    public void bundle_num_update(Order order,FilledOrder filledOrder){
        OrderItemFiller orderItemFiller = new OrderItemFiller();
        BundleDistributionCalculator bundleDistributionCalculator = new BundleDistributionCalculator();

        for (OrderItem orderItem:order.getItems()){
            int[] bundleQuantities = orderItemFiller.bundleQuantitiesGet(orderItem,filledOrder);
            int target = orderItem.getQuantityRequired();

            //----------------------------------------
            List<Integer> bundleDistribution = bundleDistributionCalculator.bundleDistributionCalculate(bundleQuantities,target);
            Map<Object, Integer> bundleDistributionMap = new TreeMap<>();
            for (Object k : bundleDistribution) {
                bundleDistributionMap.merge(k, 1, (a, b) -> a + b);
            }
            //---------------------------------------
            orderItemFiller.bundleNumsUpdate(orderItem,filledOrder,bundleDistributionMap);

        }
    }
}













/*
            for (Object k : bundleDistribution) {


                if (bundleDistributionMap.get(k) == null) {
                    bundleDistributionMap.put(k, 1);
                } else {
                    bundleDistributionMap.put(k, bundleDistributionMap.get(k) + 1);
                }
            }
            */






