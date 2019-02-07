package com.hank.BundleCalculator.hank_BundleCalculator_version2.model;

import java.util.Map;

public class FilledBundle {
    private SubmissionBundle bundle;
    private int numberOfBundle;

    public FilledBundle(SubmissionBundle bundle) {
        this.bundle = bundle;
    }

    public FilledBundle(int numberOfBundle) {
        this.numberOfBundle = numberOfBundle;
    }

    public SubmissionBundle getBundle() {
        return bundle;
    }

    public int getNumberOfBundle() {
        return numberOfBundle;
    }

    public void setNumberOfBundle(int numberOfBundle) {
        this.numberOfBundle = numberOfBundle;
    }

    public int bundleQuantityGet(){
        return this.getBundle().getQuantity();
   }


    public double costIndividualGet(){
        return this.getNumberOfBundle()*this.getBundle().getCost();
    }





}
