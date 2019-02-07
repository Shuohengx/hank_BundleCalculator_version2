package com.hank.BundleCalculator.hank_BundleCalculator_version2.service;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledBundle;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrder;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrderItem;

import java.io.*;

public class OrderParser {


    public void orderParse(FilledOrder filledOrder, String filename){

        try(Writer writer = new FileWriter(new File(filename)))
        {
            try(BufferedWriter bw = new BufferedWriter(writer))
            {
                for (FilledOrderItem filledOrderItem:filledOrder.getFilledOrderItems()){
                    bw.write(filledOrderItem.bundleTotalOrderGet()+" "+filledOrderItem.getMediaType()+" $"+filledOrderItem.totalCostGet());
                    bw.newLine();

                    for(FilledBundle filledBundle:filledOrderItem.getFilledBundles()){
                        if (filledBundle.getNumberOfBundle()==0)
                            continue;
                        bw.write("   "+filledBundle.getNumberOfBundle()+ " * "+ filledBundle.getBundle().getQuantity()+ " $"+filledBundle.costIndividualGet());
                        bw.newLine();
                    }
                }
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}


