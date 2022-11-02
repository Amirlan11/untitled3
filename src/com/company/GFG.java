package com.company;


class GFG {
    static int tsp(int[][] graph, boolean[] v, int currPos, int n, int count, int cost, int ans) {
        if (count == n && graph[currPos][0] > 0) {
            ans = Math.min(ans, cost + graph[currPos][0]);
            return ans;
        }
        for (int i = 0; i < n; i++) {
            if (v[i] == false && graph[currPos][i] > 0) {
                v[i] = true;
                ans = tsp(graph, v, i, n, count + 1, cost + graph[currPos][i], ans);
                v[i] = false;
            }
        }
        return ans;
    }

}
