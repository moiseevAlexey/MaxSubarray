package com.Studying;



class Triple
{
    public int low;
    public int high;
    public double sum;

    Triple(int low, int high, double sum)
    {
        this.low = low;
        this.high = high;
        this.sum = sum;
    }
}



public class MaxSubarray
{



    public static Triple maxCrossing(double[] array, int low, int middle, int high)
    {
        int maxLeft = middle;
        double leftSum = array[maxLeft];
        double sum = 0;
        for (int i = middle; i >= low; i--)
        {
            sum += array[i];
            if (sum >= leftSum)
            {
                leftSum = sum;
                maxLeft = i;
            }
        }

        int maxRight = middle + 1;
        double rightSum = array[maxRight];
        sum = 0;
        for (int i = middle + 1; i <= high ; i++)
        {
            sum += array[i];
            if (sum >= rightSum)
            {
                rightSum = sum;
                maxRight = i;
            }
        }

        return new Triple(maxLeft, maxRight, rightSum + leftSum);
    }



    public static Triple maxSubarray(double[] array, int low, int high)
    {
        if (low == high)
        {
            return new Triple(low, high, array[low]);
        }
        else
        {
            Triple left, right, cross;
            int middle = (low + high) / 2;

            left = maxSubarray(array, low, middle);
            right = maxSubarray(array, middle + 1, high);
            cross = maxCrossing(array, low, middle, high);

            if ((left.sum > right.sum) && (left.sum > cross.sum))
            {
                return left;
            }
            else if (right.sum > cross.sum)
            {
                return right;
            }
            else
            {
                return cross;
            }
        }
    }
}
