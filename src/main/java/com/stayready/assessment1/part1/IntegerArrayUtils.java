package com.stayready.assessment1.part1;

import java.util.Arrays;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        
        Integer sum=0;
        //add all elemnts in the array
        for(Integer element:intArray){
            sum+=element;

        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer total=1;
        //get product of each element going tthrough array

        for(Integer element: intArray)
        {
            total *=element;
        }

        return total;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        //get average by addding elements and dividing by lenght of array
        Double average= 0.0;
        for(Integer element: intArray){
            average+= element;
        }
        return average/intArray.length;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    
    public static Integer getLargest(Integer[] intArray) {
        //sort array so we can get the last element for most largest int
        Arrays.sort(intArray);
        return intArray[intArray.length-1];
    }
}
