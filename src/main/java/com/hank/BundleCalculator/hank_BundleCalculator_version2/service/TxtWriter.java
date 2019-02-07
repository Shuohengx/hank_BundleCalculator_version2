package com.hank.BundleCalculator.hank_BundleCalculator_version2.service;


import java.io.*;


public class TxtWriter {




    public void write(String filename) throws IOException{
        try(Writer writer = new FileWriter(new File(filename+".txt")))
        {
            try(BufferedWriter bw = new BufferedWriter(writer))
            {
                bw.write("60");
            }
        }
    }

/*
        File file = new File(filename+".txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.close();
            bw.close();
        }
        catch (Exception e){

        }
        */
    }







