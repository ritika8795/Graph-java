/*This program performs a DFS traversal of graph  */
import java.util.*;
import java.lang.*;
import java.io.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg  =sc.nextInt();
            for(int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= edg; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            
            ArrayList<Integer> res = new Traversal().dfs(list, nov);
            for (int i = 0; i < res.size (); i++) 
                System.out.print (res.get(i) + " ");
            System.out.println();
        }
    }
}



class Traversal
{
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
       boolean[] visited= new boolean[N]; // by default this is set to false in java
       ArrayList<Integer> arr= new ArrayList<>();
       for (int i=0;i<N;i++)
       {
           if(visited[i]==false)
           {
               DFSUtil(i,visited,arr,g);
           }
       }
       return arr;
       
    }
    //Recursive function to perform DFS
    static void DFSUtil(int i, boolean[] visited, ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> g)
    {
        visited[i]=true;
        arr.add(i);
        
        for(int j=0;j<g.get(i).size();j++)
        {
            int n=g.get(i).get(j);
            if(!visited[n])
            DFSUtil(n,visited,arr,g);
        }
    }
    
}

