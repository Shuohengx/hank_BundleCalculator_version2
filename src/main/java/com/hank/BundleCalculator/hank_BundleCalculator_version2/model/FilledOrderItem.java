package com.hank.BundleCalculator.hank_BundleCalculator_version2.model;

import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FilledOrderItem {
    private OrderItem orderItem;
    private List<FilledBundle> filledBundles = new ArrayList<>();
    private String mediaType;
    private String mediaId;

    public void bundleAdd(FilledBundle bundle){
        this.filledBundles.add(bundle);
    }

    public FilledOrderItem(String mediaType, String mediaId) {
        this.mediaType = mediaType;
        this.mediaId = mediaId;
    }

    public String getMediaType() {
        return mediaType;
    }

    public String getMediaId() {
        return mediaId;
    }

    public List<FilledBundle> getFilledBundles() {
        return filledBundles;
    }

    public int[] bundleQuantitiesGet(){
        List<Integer> bundleQuantities = new ArrayList<Integer>();
        for(FilledBundle filledBundle:this.filledBundles){
            bundleQuantities.add(filledBundle.bundleQuantityGet());
        }
        int[] bundleQuantitiesInt = bundleQuantities.stream().mapToInt(i -> i).toArray();;
        return bundleQuantitiesInt;
    }


    public void bundleNumUpdate(Map<Object, Integer> bundleDistribution){
        int[] bundleQuantity = this.bundleQuantitiesGet();
        for(Object key:bundleDistribution.keySet()){
           for (int i=0;i<bundleQuantitiesGet().length;i++){
               if (bundleQuantity[i] == (int) key){
                   this.getFilledBundles().get(i).setNumberOfBundle(bundleDistribution.get(key));
               }
           }
        }


    }

}
