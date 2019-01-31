package com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrder;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrderItem;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.OrderItem;

public class InputReader {

    public void inputRead(ContentsReader contentsReader, FilledOrder filledOrder){

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
