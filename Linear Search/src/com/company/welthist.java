package com.company;

public class welthist {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {1, 2, 4},
                {1, 2, 5}
        };

        System.out.println(richestArray(arr));
        System.out.println(maximumWealth(arr));
    }

    static int richestArray(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }


    static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int richest = 0;
        for (int i = 0; i < m; i++) {
            int summ = 0;
            for (int j = 0; j < n; j++) {
                summ += accounts[i][j];
            }
            if (summ > richest) {
                richest = summ;
            }
        }
        return richest;
    }

}
