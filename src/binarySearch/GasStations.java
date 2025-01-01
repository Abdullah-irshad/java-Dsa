package binarySearch;

import java.util.ArrayList;

public class GasStations {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int k =4;
//        int[] arr = {1,13,17,23};
//        int k =5;
//        System.out.println(gasStations(arr,k));

        double diff = 1e-2;
    }
    static double gasStations(int[] arr, int k){
        int[] howMany = new int[arr.length];
        for (int gasStation=1;gasStation<=k;gasStation++){
            double maxSections = -1;
            int maxIndex =-1;
            for (int i=0;i<arr.length-1;i++){
                double diff = arr[i+1]-arr[i];
                double sectionLength = diff /(double) (howMany[i]+1);
                if(maxSections < sectionLength){
                    maxSections = sectionLength;
                    maxIndex =i;
                }
            }
            howMany[maxIndex]++;
        }
        double maxAns = -1;
        for (int i=0;i<arr.length-1;i++){
            double diff = arr[i+1]-arr[i];
            double sectionLength = diff /(double) (howMany[i]+1);
            if (sectionLength > maxAns){
                maxAns = sectionLength;
            }
        }
        return maxAns;
    }
}


