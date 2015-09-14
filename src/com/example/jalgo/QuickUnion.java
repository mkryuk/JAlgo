package com.example.jalgo;

/**
 * Created by maxim on 08.09.2015.
 */
public class QuickUnion extends Printable{

    public QuickUnion(int N){
        super(N);
    }
    public void union(int p, int q){
        int pid = getRoot(p);
        int qid = getRoot(q);
        if (pid == qid) return;

        id[pid] = qid;
    }

    public boolean connected(int p, int q){
        return getRoot(p) == getRoot(q);
    }

    private int getRoot(int i){
        while (id[i] != i) i = id[i];
        return i;
    }
}
