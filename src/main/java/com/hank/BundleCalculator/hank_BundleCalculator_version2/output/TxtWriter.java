package com.hank.BundleCalculator.hank_BundleCalculator_version2.output;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class TxtWriter {







    public void write(String filename){


        File file = new File(filename+".txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.close();
            bw.close();
        }
        catch (Exception e){

        }
    }






}
