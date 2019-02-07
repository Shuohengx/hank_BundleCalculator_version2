package com.hank.BundleCalculator.hank_BundleCalculator_version2.service;


import java.io.*;

//用不来,调用会出错没有catch住
public class TxtWriter {




    public void write(String filename) throws IOException{
        try(Writer writer = new FileWriter(new File(filename+".txt")))
        {
            try(BufferedWriter bw = new BufferedWriter(writer))
            {
                bw.write("60");
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }


}







