package com.chinex.boroja.analysis;

public class UnionFind {

    public UnionFind(int N) { //initialize union find data structure with N objects (0 to N-1)

    }
    //add connection between P and q
    public void union (int pConnection, int qConnection ) {

    }
    //are p and q in the same connection
    boolean connected(int pConnection, int qConnection) {
        return true;
    }
    //component identifier for p (0 to N - 1)
    int find(int pConnection) {
        return pConnection;
    }
    //number of components
    int count() {
        return count();
    }
}

//Quick Find Java Implementation
class QuickFindUnionFind {
    private int[] id;

    public QuickFindUnionFind(int N) {
        //set id of each object to itself (N array accesses)
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }
    //check whether p and q are in the same component (2 array accesses)
    public boolean connected(int pConnect, int qConnect) {
        return id[pConnect] == id[qConnect];
    }
    public void union(int pConnect, int qConnect) {
        int pConnectId = id[pConnect];
        int qConnectId = id[qConnect];
        //change all entries with id[p] to id[q]
        //(at most 2N + 2 array accesses)

        for (int i = 0; i < id.length; i++)
            if (id[i] == pConnectId) id[i] = qConnectId;
    }
}

//Quick Union Java Implementation
//Quick Find Java Implementation
class QuickFindUnionFind0 {
    private int[] id;

    public QuickFindUnionFind0(int N) {
        //set id of each object to itself (N array accesses)
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    //chase parent pointers until reach root(depth of i array accesses)
    private int root(int i) {
        while (i != id[i])
            id[i] = id[id[i]]; //only one extra line of code path compression
            i = id[i];
        return i;
    }
    //check if p and q have the same root (depth of p and q array access)
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    //change root of p to point to root of q (depth of p and q array accesses)
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
//weighted quick union
//Data structure is same as quick union, but maintain extra array sz[i]
