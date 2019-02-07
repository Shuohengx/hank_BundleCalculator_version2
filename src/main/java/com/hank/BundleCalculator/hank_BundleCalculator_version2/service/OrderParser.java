package com.hank.BundleCalculator.hank_BundleCalculator_version2.service;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledBundle;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrder;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrderItem;

import java.io.*;

public class OrderParser {


    public String firstLineGet(FilledOrderItem filledOrderItem){
        return filledOrderItem.bundleTotalOrderGet()+" "+filledOrderItem.getMediaType()+" $"+filledOrderItem.totalCostGet();
    }

    public String DetailGet(FilledBundle filledBundle){
        return "   "+filledBundle.getNumberOfBundle()+ " * "+ filledBundle.getBundle().getQuantity()+ " $"+filledBundle.costIndividualGet();
    }





}


