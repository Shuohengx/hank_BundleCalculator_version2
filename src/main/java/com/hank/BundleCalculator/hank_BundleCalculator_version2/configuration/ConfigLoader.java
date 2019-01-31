package com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrder;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrderItem;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.OrderItem;

import java.util.List;

public class ConfigLoader {




    public void configLoad(ContentsReader contentsReader, FilledOrder filledOrder, String filename){

        contentsReader.ContentsRead("input_file.txt");

       for (String content:contentsReader.getContents()){
           if(content!=null){
               String[] inputData = content.split(" ");
               String MediaType = inputData[1];
               int quantity = Integer.parseInt(inputData[0]);
               filledOrder.addFilledOrderItem(new FilledOrderItem(new OrderItem(MediaType,quantity)));
           }
       }
    }
}
