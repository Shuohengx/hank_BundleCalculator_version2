package com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.Order;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.OrderItem;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.util.ContentsReader;

import java.util.ArrayList;
import java.util.List;

public class InputReader {
    private List<OrderItem> orderItems = new ArrayList<>();


    public Order inputRead(String filename){
        Order order = new Order();
        List<OrderItem> orderItems = new ArrayList<>();
        ContentsReader contentsReader = new ContentsReader();

  //      contentsReader.ontentsRead(filename);

        for (String content:contentsReader.contentsRead(filename)){
            if(content!=null){
                String[] inputData = content.split(" ");
                String MediaType = inputData[1];
                int quantityRequired = Integer.parseInt(inputData[0]);
                order.addItem(new OrderItem(MediaType,quantityRequired));
             //   this.orderItems.add(new OrderItem(MediaType,quantityRequired));
            }
        }
        return order;

    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    private boolean isFormatCorrect(String content){
        String[] orderItem = content.split(" ");
        return true;


    }

}
