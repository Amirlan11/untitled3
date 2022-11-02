package com.company;

import static com.company.GFG.tsp;

public class Main {

    public static void main(String[] args) {
        int n = 4;

        int[][] graph = {{0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}};
        boolean[] v = new boolean[n];
        v[0] = true;
        int ans = Integer.MAX_VALUE;
        ans = tsp(graph, v, 0, n, 1, 0, ans);
        System.out.println(ans);
    }
}
