import java.util.*;
import java.lang.*;
import java.io.*;

public class blockCode {
    public static void main(String[] args){
        int[] arr1 = {1,3,5,8};
        int[] arr2 = {2,5,5,9,1,3};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] sum = new int[Math.max(len1, len2)+1];

        int cover = 0;
        int i = len1 - 1, j = len2 - 1, k = sum.length - 1;
        while (i >= 0 && j >=0) {
            sum[k] = (arr1[i] + arr2[j]) % 10 + cover;
            cover = (arr1[i] + arr2[j]) / 10;
            i--;
            j--;
            k--;
        }

        if (i > 0){
            while (i >= 0){
                sum[k] = arr1[i] + cover;
                cover = 0;
                i--;
                k--;
            }
        }
        else{
            while (j >= 0) {
                sum[k] = arr2[j] + cover;
                cover = 0;
                j--;
                k--;
            }
        }
        if (sum[k] == 0){
            sum = Arrays.copyOfRange(sum, 1, sum.length);
        }
        System.out.println(Arrays.toString(sum));
    }
}
