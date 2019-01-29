package com.hank.BundleCalculator.hank_BundleCalculator_version2.progress;


import java.util.*;


public class BundleDistributionCalculator {

    public  List<Integer> bundleDistributionCalculate(int[] candidates, int target){
        List<List<Integer>> results = new ArrayList<>();
        List<List<Integer>> results_proximity = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        List<Integer> bundle_distribution;

        Arrays.sort(candidates);
        dfsCore(results, results_proximity,0, 0, tmp, candidates, target);

        if(results.size()!=0)
            bundle_distribution = results.get(results.size() - 1);
        else
             bundle_distribution = result_select(results_proximity);

        Collections.reverse(bundle_distribution);
        return bundle_distribution;
    }

    private void dfsCore(List<List<Integer>> res, List<List<Integer>> res2,
                         int curIdx, int sum, List<Integer> tmp, int[] candidates,
                         int target) {
        if (sum > target) {
                res2.add(new ArrayList<>(tmp));
                return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = curIdx; i < candidates.length; i++) {
            sum += candidates[i];
            tmp.add(candidates[i]);
            dfsCore(res, res2, i, sum, tmp, candidates, target);
            tmp.remove(tmp.size() - 1);
            sum -= candidates[i];
        }
    }

    private List<Integer> result_select(List<List<Integer>> results){
        long sum_min=0;
        List<Integer> result_selected = new ArrayList<>();



        for(List<Integer> result:results){
            IntSummaryStatistics stats = result.stream().mapToInt((x)->x).summaryStatistics();
            long sum = stats.getSum();

            if(result_selected.size()==0|(sum<=sum_min&&result.size()<result_selected.size())){
                sum_min = sum;
                result_selected = result;
            }
        }
        return result_selected;
    }
}
