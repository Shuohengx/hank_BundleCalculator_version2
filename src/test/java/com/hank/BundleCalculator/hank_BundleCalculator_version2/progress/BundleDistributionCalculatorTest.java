package com.hank.BundleCalculator.hank_BundleCalculator_version2.progress;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BundleDistributionCalculatorTest {
    private BundleDistributionCalculator bundleDistributionCalculator;

    @Before
    public void setUp() throws Exception {
        bundleDistributionCalculator = new BundleDistributionCalculator();
    }

    @Test
    public void bundleDistributionCalculate() {

        int[] candidates1 = {9,5,3};
        int target1 = 4;
        List<Integer> results1 = bundleDistributionCalculator.bundleDistributionCalculate(candidates1,target1);
        List<Integer> result1_assert = Arrays.asList(5);
        System.out.println(results1);

        //----------------------------------------------------------
        int[] candidates2 = {9,5,3};
        int target2 = 19;
        List<Integer> results2 = bundleDistributionCalculator.bundleDistributionCalculate(candidates2,target2);
        List<Integer> result2_assert = Arrays.asList(9,5,5);
        System.out.println(results2);

        //-----------------------------------------------------------
        int[] candidates3 = {9,5,3};
        int target3 = 6;
        List<Integer> results3 = bundleDistributionCalculator.bundleDistributionCalculate(candidates3,target3);
        List<Integer> result3_assert = Arrays.asList(3,3);
        System.out.println(results3);
        //------------------------------------------------------------
        int[] candidates4 = {9,5,3};
        int target4 = 10;
        List<Integer> results4 = bundleDistributionCalculator.bundleDistributionCalculate(candidates4,target4);
        List<Integer> result4_assert = Arrays.asList(5,5);
        System.out.println(results4);
        //------------------------------------------------------------
        int[] candidates5 = {9,5,3};
        int target5 = 13;
        List<Integer> results5 = bundleDistributionCalculator.bundleDistributionCalculate(candidates5,target5);
        List<Integer> result5_assert = Arrays.asList(5,5,3);
        System.out.println(results5);
        //-------------------------------------------------------------
        int[] candidates6 = {9,5,3};
        int target6 = 2;
        List<Integer> results6 = bundleDistributionCalculator.bundleDistributionCalculate(candidates6,target6);
        List<Integer> result6_assert = Arrays.asList(3);
        System.out.println(results6);
        //-------------------------------------------------------------
        int[] candidates7 = {9,5,3};
        int target7 = 7;
        List<Integer> results7 = bundleDistributionCalculator.bundleDistributionCalculate(candidates7,target7);
        List<Integer> result7_assert = Arrays.asList(5,3);
        System.out.println(results7);
        //-------------------------------------------------------------
        int[] candidates8 = {9,5,3};
        int target8 = 137;
        List<Integer> results8 = bundleDistributionCalculator.bundleDistributionCalculate(candidates8,target8);
        List<Integer> result8_assert = Arrays.asList(9,9,9,9,9,9,9,9,9,9,9,9,5,5,5,5);
        System.out.println(results8);


















    }

}