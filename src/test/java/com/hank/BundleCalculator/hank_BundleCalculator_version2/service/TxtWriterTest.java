package com.hank.BundleCalculator.hank_BundleCalculator_version2.service;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration.ConfigLoader;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration.InputReader;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrder;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.Order;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class TxtWriterTest {
    ConfigLoader configLoader;
    InputReader inputReader;

    //---------------------------------
    FilledOrder filledOrder;
    Order order;
    //---------------------------------
    OrderFiller orderFiller;

    OrderParser orderParser;


    TxtWriter txtWriter;

    @Before
    public void setUp() throws Exception {
        configLoader =new ConfigLoader();
        inputReader = new InputReader();

        filledOrder = new FilledOrder();
        order = new Order();

        orderFiller = new OrderFiller();

        orderParser = new OrderParser();

        txtWriter = new TxtWriter();
    }

    @Test
    public void write() throws IOException {
        configLoader.configLoad("Config_file.txt");

        filledOrder = configLoader.getFilledOrder();
        order = inputReader.inputRead("input_file.txt");
        //-----------------------------
        orderFiller.bundle_num_update(order,filledOrder);


        txtWriter.write("output_file",filledOrder);
    }
}