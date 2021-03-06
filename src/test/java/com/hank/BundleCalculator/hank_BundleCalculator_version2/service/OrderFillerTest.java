package com.hank.BundleCalculator.hank_BundleCalculator_version2.service;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration.ConfigLoader;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration.InputReader;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrder;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.Order;
import org.junit.Before;
import org.junit.Test;

public class OrderFillerTest {
    private ConfigLoader configLoader;
    private InputReader inputReader;


    private FilledOrder filledOrder;
    private Order order;

    private OrderFiller orderFiller;


    @Before
    public void setUp() {
        configLoader =new ConfigLoader();
        inputReader = new InputReader();
        filledOrder = new FilledOrder();
        order = new Order();
        orderFiller = new OrderFiller();

    }

    @Test
    public void bundle_num_update() {
        configLoader.configLoad("Config_file.txt");

        filledOrder = configLoader.getFilledOrder();
        order = inputReader.inputRead("input_file.txt");
        //-----------------------------
        orderFiller.bundle_num_update(order,filledOrder);




    }
}