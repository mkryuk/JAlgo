package com.example.jalgo;

/**
 * Created by maxim on 08.09.2015.
 */
public class WeightedQuickUnionPathCompression extends Printable{
    int[] sz;

    public WeightedQuickUnionPathCompression(int N) {
        super(N);
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
        }
    }

    public void union(int p, int q) {
        int i = getRoot(p);
        int j = getRoot(q);
        if (i == j) return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    public boolean connected(int p, int q) {
        return getRoot(p) == getRoot(q);
    }

    private int getRoot(int i) {
        while (id[i] != i) {
            //this is the only difference from WeightedQuickUnion
            //it's compresses the path to the root
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
}
