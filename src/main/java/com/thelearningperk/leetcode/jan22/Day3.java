package com.thelearningperk.leetcode.jan22;

/**
 * Problem Name : Find the Town Judge
 *
 * Problem Description : https://leetcode.com/problems/find-the-town-judge/
 *
 * @author nadeem@thelearningperk
 * Date : 03/01/22
 */
public class Day3 {

    public int findJudge(int n, int[][] trust) {
        int[] in = new int[n+1];
        int[] out = new int[n+1];

        for(int[] pair : trust) {
            out[pair[0]]++;
            in[pair[1]]++;
        }

        for(int i = 1; i <= n; i++) {
            if(in[i] == n-1 && out[i] == 0) return i;
        }
        return -1;
    }
}
