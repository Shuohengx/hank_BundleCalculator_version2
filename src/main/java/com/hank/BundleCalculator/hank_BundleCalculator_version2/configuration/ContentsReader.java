package com.hank.BundleCalculator.hank_BundleCalculator_version2.configuration;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;



public class ContentsReader {

    private List<String> contents;

    public List<String> getContents() {
        return contents;
    }

    public void ContentsRead(String filename){
        Path path = Paths.get(filename);
        try {
            List<String> contents = Files.readAllLines(path);
            for (String content:contents){
                contents.add(content);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }




}
