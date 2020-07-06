package com.stayready.assessment1.part1;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        n=n-1;
        return (n*(n+1))/2;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        Integer remainder=0;
        Integer reverse=0;
        while(val>=1){
            //remainder so we get the tens
            remainder = val %10;
            //get the centenas or hundresds we got to multiply by remainder
            reverse= reverse*10 + remainder;
            //divide current n by 10
            val =val / 10;
        }
        return reverse;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        //if even we return true
        return val%2==0? true: false; 
        
       
    }
}

