package br.com.ibgregorio;

import java.util.Arrays;

public class ChallengeArrangeArray {

    public static void ordenaArrayInteiros(byte[] nums) {
        if (nums.length > 0) {
            Arrays.sort(nums);
        }
    }


    public static void main(String[] args) {
        String str = "byte array size example";
        byte values[] = str.getBytes();
        for(int i =0 ; i < values.length ; i++) System.out.print(values[i]+" ");
        System.out.println();
        ordenaArrayInteiros(values);
        for(int i =0 ; i < values.length ; i++) System.out.print(values[i]+" ");

    }
}
