package com.hank.BundleCalculator.hank_BundleCalculator_version2.model;

import java.util.List;

public class FilledOrder {
    private List<FilledOrderItem> filledOrderItems;

    public void addFilledOrderItem(FilledOrderItem filledOrderItem){
        filledOrderItems.add(filledOrderItem);
    }

}
