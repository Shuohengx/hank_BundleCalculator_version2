package com.hank.BundleCalculator.hank_BundleCalculator_version2.model;

public class SubmissionBundle {
    private int quantity;
    private double cost;

    public SubmissionBundle(int quantity, double cost) {
        this.quantity = quantity;
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }
}


