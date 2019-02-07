package com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.Order;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.OrderItem;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.util.ContentsReader;


public class InputReader {


    //----------------读取输入信息----------------------//

    public Order inputRead(String filename){
        Order order = new Order();
        ContentsReader contentsReader = new ContentsReader();

        for (String content:contentsReader.contentsRead(filename)){
            if(content!=null){
                String[] inputData = content.split(" ");
                String MediaType = inputData[1];
                int quantityRequired = Integer.parseInt(inputData[0]);
                order.addItem(new OrderItem(MediaType,quantityRequired));
            }
        }
        return order;
    }

}
