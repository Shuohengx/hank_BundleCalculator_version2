package com.hank.BundleCalculator.hank_BundleCalculator_version2;

import com.hank.BundleCalculator.hank_BundleCalculator_version2.output.TxtWriter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;



@SpringBootApplication
public class HankBundleCalculatorVersion2Application {

	public static void main(String[] args) {
		SpringApplication.run(HankBundleCalculatorVersion2Application.class, args);
		//-----------------------------------------------
		//output part
		TxtWriter txt = new TxtWriter();
		txt.write("output_file");





	}








}
