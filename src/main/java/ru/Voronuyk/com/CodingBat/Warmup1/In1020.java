package ru.Voronuyk.com.CodingBat.Warmup1;

public class In1020 {
    /*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
     */
    public static void main(String[] args) {
        in1020(12, 99);
        in1020(21, 12) ;
        in1020(8, 99) ;
    }
    public static boolean in1020(int a, int b) {
        boolean res ;
        if ((a>=10 & a<=20) | (b>=10 & b <=20)){
            res = true;
        }else {
            res = false;
        }
        System.out.println(res);
        return res;
    }
}
