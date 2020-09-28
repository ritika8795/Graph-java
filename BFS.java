/* Program to perform BFS Traversal of a Graph 
Tested on GeeksFor Geeks 
https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();

            for (int i = 0; i < nov; i++) list.add(i, new ArrayList<Integer>());

            for (int i = 1; i <= edg; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            ArrayList<Integer>res = new Traversal().bfs(list,nov);
            for (int i =0 ;i < res.size (); i++) 
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}

class Traversal {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int N) {
       boolean[] visited= new boolean[N];
       
       LinkedList<Integer> queue= new LinkedList<>();
       queue.add(0);
       visited[0]=true;
       ArrayList<Integer> arr= new ArrayList<>();
       while(queue.size()!=0)
       {
           int s= queue.poll();
           arr.add(s);
           for(int j=0;j<g.get(s).size();j++)
           {
                int n=g.get(s).get(j);
                if(!visited[n])
                {
                    visited[n]=true;
                    queue.add(n);
                }
           }
       }
       return arr;
       
    }
}
