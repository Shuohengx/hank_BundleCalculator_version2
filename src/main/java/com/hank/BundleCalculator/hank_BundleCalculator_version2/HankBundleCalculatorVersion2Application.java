package com.hank.BundleCalculator.hank_BundleCalculator_version2;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration.ConfigLoader;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration.InputReader;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrder;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.Order;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.service.OrderFiller;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.service.OrderParser;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.service.TxtWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.imageio.IIOException;
import java.io.IOException;


@SpringBootApplication
public class HankBundleCalculatorVersion2Application {

	public static void main(String[] args) {
		SpringApplication.run(HankBundleCalculatorVersion2Application.class, args);
		//-----------------------------------------------
		ConfigLoader configLoader = new ConfigLoader();
		InputReader inputReader = new InputReader();
		FilledOrder filledOrder;
		Order order;
		OrderFiller orderFiller = new OrderFiller();
		OrderParser orderParser = new OrderParser();
		TxtWriter txtWriter = new TxtWriter();

		//----------------------------------------------Input+Configuration
		configLoader.configLoad("Config_file.txt");

		filledOrder = configLoader.getFilledOrder();
		order = inputReader.inputRead("input_file.txt");

		//-----------------------------
		orderFiller.bundle_num_update(order,filledOrder);


		//Output
		try {
			txtWriter.write("output_file",filledOrder);
		}catch (IOException ex){
			ex.printStackTrace();
		}









	}








}

