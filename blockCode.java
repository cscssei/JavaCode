import java.util.*;
import java.lang.*;
import java.io.*;

public class blockCode {
    public static void main(String[] args){
        int[] arr1 = {1,3,5,8};
        int[] arr2 = {2,5,5,9,1,3};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] sum = new int[Math.max(len1, len2)];

        if (len1 > len2) {
            sum = arr1;
        } else {
            sum = arr2;
        }

        for (int i = 0; i < len1 && i < len2; i++) {
            sum[i] = arr1[i] + arr2[i];
            sum[i] = sum[i] < 10 ? sum[i] : sum[i] > 10 ? (sum[i] - 10) : 1;
            int j = i;
        }

        System.out.println(Arrays.toString(sum));
    }
}
