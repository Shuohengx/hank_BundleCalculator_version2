package com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledBundle;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrder;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrderItem;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.SubmissionBundle;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.util.ContentsReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConfigLoader {
    private FilledOrder filledOrder = new FilledOrder();

    public void configLoad(String filename){
        ContentsReader contentsReader = new ContentsReader();


       for (String content:contentsReader.contentsRead(filename)){
           if(content!=null){
               String[] inputData = content.replaceAll("[|@$]"," ").split("\\s+");
               String mediaID = inputData[0];
               String mediaType = inputData[1];
               FilledOrderItem filledOrderItem = new FilledOrderItem(mediaType,mediaID);

               for (int i =2;i<inputData.length;i=i+2) {

                   int quantity = Integer.parseInt(inputData[i]);
                   double cost = Double.parseDouble(inputData[i+1]);

                   SubmissionBundle submissionBundle = new SubmissionBundle(quantity,cost);
                   FilledBundle filledBundle = new FilledBundle(submissionBundle);

                   filledOrderItem.bundleAdd(filledBundle);

               }
               this.filledOrder.addFilledOrderItem(filledOrderItem);
            //   System.out.println(Arrays.asList(inputData));
           }
       }
    }

    public FilledOrder getFilledOrder() {
        return filledOrder;
    }
}
