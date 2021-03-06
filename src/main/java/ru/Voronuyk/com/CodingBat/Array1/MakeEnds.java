package ru.Voronuyk.com.CodingBat.Array1;

import java.util.Arrays;

public class MakeEnds {
    /*
Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
The original array will be length 1 or more.


makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
     */
    public static void main(String[] args) {
        makeEnds(new int[]{1, 2, 3});
        makeEnds(new int[]{1, 2, 3, 4});
        makeEnds(new int[]{7, 4, 6, 2});
    }
    public static int[] makeEnds(int[] nums) {
        int[] res = new int[]{nums[0],nums[nums.length-1]};
        System.out.println(Arrays.toString(res));
        return res;
    }
}


