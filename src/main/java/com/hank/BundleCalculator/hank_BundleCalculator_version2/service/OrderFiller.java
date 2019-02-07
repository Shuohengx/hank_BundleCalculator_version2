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
            List<Integer> bundleDistribution = new ArrayList<>();
            bundleDistribution = bundleDistributionCalculator.bundleDistributionCalculate(bundleQuantities,target);
            System.out.println(bundleDistribution);

            //----------------------------------------
            Map<Object, Integer> map = new TreeMap<Object, Integer>();
            for (Object k : bundleDistribution) {
                if (map.get(k) == null) {
                    map.put(k, 1);
                } else {
                    map.put(k, map.get(k) + 1);
                }
            }

            orderItemFiller.bundleNumsUpdate(orderItem,filledOrder,map);

        }

    }
}






