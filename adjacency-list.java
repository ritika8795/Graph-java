/*Create and Print adjacency list
Tested on GeeksFor Geeks 
https://practice.geeksforgeeks.org/problems/print-adjacency-list/0
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		 Scanner myObj = new Scanner(System.in);
		  int t = myObj.nextInt();
		  while(t-->0)
		  {
		      int V= myObj.nextInt();
		      int E= myObj.nextInt();
		      ArrayList<ArrayList<Integer>> graph= new ArrayList<ArrayList<Integer>>();
		      for(int j=0;j<V;j++)
		        graph.add(new ArrayList<Integer>());
		     
		      for(int j=0;j<E;j++)
		      {
		          int a= myObj.nextInt();
		          int b= myObj.nextInt();
		          addedge(graph,a,b);
		          
		      }
		      for(int i=0;i<graph.size();i++) { 
		          System.out.print(i); 
			for(int j=0;j<graph.get(i).size();j++){ 
				System.out.print("-> "+graph.get(i).get(j)); 
			} 
			System.out.println();
		} 
		  }
	}
	
static void addedge(ArrayList<ArrayList<Integer>> graph, int a, int b)
	{
	    graph.get(a).add(b);
	    graph.get(b).add(a);
	}
}

