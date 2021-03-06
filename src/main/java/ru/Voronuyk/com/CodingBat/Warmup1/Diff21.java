package ru.Voronuyk.com.CodingBat.Warmup1;

public class Diff21 {
    /*
    Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.

    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
    */
    public static void main(String[] args) {
        diff21(19);
        diff21(10);
        diff21(21);
    }
    public static int diff21(int n) {
    int res ;
    if (n >21){
        res = (n-21)*2 ;
    }else {
        res = 21 - n;
    }
        System.out.println(res);
    return res;
    }
}
