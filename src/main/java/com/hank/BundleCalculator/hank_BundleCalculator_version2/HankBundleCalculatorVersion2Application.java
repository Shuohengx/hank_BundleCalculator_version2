package com.hank.BundleCalculator.hank_BundleCalculator_version2;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.model.FilledOrder;
import com.hank.BundleCalculator.hank_BundleCalculator_version2.service.TxtWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HankBundleCalculatorVersion2Application {

	public static void main(String[] args) {
		SpringApplication.run(HankBundleCalculatorVersion2Application.class, args);
		//-----------------------------------------------
		FilledOrder filledOrder = new FilledOrder();



		//output part
	//	TxtWriter txt = new TxtWriter();
	//	txt.write("output_file");





	}








}

