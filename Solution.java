import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    static int oddNumber(int arr[], int arr_size) {
        Map<Integer, Integer> map = new HashMap();
        for(int e : arr) {
            map.put(e, map.getOrDefault(e,0)+1);
        }
        for(Integer e : map.keySet()){
            if (map.get(e) % 2 != 0) {
                return e;
            }
        }
        return -1;
    }

    static int[] twoSum(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            int x = target - arr[i];
            if (map.containsKey(x)) {
                return new int[] {map.get(x), i};
            }
            else {
                map.put(arr[i], i);
            }
        }
        return null;
    }

    static void Npq(int list[], int p, int q) {
        ArrayList<Integer> lucky = new ArrayList<>();
        ArrayList<Integer> unlucky = new ArrayList<>();
        ArrayList<Integer> whoknows = new ArrayList<>();
        for (int i = 0; i < list.length; i ++) {
            if (list[i] % 2 == 0){
                if (list[i] % 3 != 0){
                    lucky.add(list[i]);
                }
                else {
                    whoknows.add(list[i]);
                }
            }
            else {
                if (list[i] % 3 == 0) {
                    unlucky.add(list[i]);
                }
            }
        }
        System.out.println("Lucky numbers; "+lucky);
        System.out.println("Unlucky numbers; "+unlucky);
        System.out.println("Whoknows numbers; "+whoknows);
        return;
    }


    static String higherSaler(String name, int number) {
        Map<String, Integer> map = new HashMap<>();
        if (!map.containsKey(name)) {
            map.put(name, map.getOrDefault(name, number)+number);
        }
        //ArrayList<String> names = read.file;
        int max = 0;
        String salerName = new String();
        for (Map.Entry<String, Integer> saler: map.entrySet()) {
            if (map.containsKey(name) && saler.getValue() > max) {
                max = saler.getValue();
                salerName = saler.getKey();
            }
        }
        return salerName;
    }

    public static void main (String[] args) {
        //code
        int arr[] = new int[] {8,4,4,8,23};
        int arr_size = arr.length;
        int target = 12;
        System.out.println(twoSum(arr, target));

        int list[] = new int[] {2, 3, 4, 5, 6, 7, 8, 9};
        int p = 2, q = 3;
        Npq(list,p,q);
    }
}
