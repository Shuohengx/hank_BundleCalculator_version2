package com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrder;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.Order;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.OrderItem;
import org.junit.Before;
import org.junit.Test;

public class InputReaderTest {

    private InputReader inputReader;
    private Order order;


    @Before
    public void setUp() throws Exception {
        inputReader = new InputReader();
        order = new Order();


    }

    @Test
    public void inputRead() {


        order = inputReader.inputRead("input_file.txt");
        for(OrderItem orderItem: order.getItems()){
            System.out.println(orderItem.getQuantityRequired());
            System.out.println(orderItem.getMediaType());
        }

    }
}