package com.Studying;

public class Main {

    public static void main(String[] args)
    {
        double[] a = {5, -4, 5, -7, 200, 2, 3, -6, 100, 3, 4};

        Triple tr;
        tr = MaxSubarray.maxSubarray(a, 0, a.length - 1);

        System.out.print(tr.low + " " +  tr.high + " " + tr.sum);
    }
}
