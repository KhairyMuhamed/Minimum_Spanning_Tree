/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minimum.spanning.tree;


/**
 *
 * @author Mohamoud Elassy
 */


class Graph {
  
  private Node NodeList[];
  private int adjMat[][];
  private int numofnodes;
  private Stack dfs;
  
  private class Node  {
  private char Data;
  private boolean Visited;
  
       Node(char Data) {
       this.Data =Data;
       Visited = false;
  }
}
  
  public Graph(int length) {
    NodeList = new Node[length];
    adjMat = new int[length][length];
    numofnodes = 0;
    dfs = new Stack(length);
  }
  private int addedNodes=0;
  public void addNode(char label) {
     addedNodes=addedNodes+1;
    NodeList[numofnodes++] = new Node(label);
  }
  private int addedEdges=0;
  public void addEdge(int start, int end) {
      addedEdges=addedEdges+1;
    adjMat[start-1][end-1] = 1;
    adjMat[end-1][start-1] = 1;
  }
  
  private void GetNode(int v) {
    System.out.print(NodeList[v].Data);
  }
  
  private int getAdjUnvisitedNode(int v) {
    for(int i = 0; i < numofnodes; i++) {
      if(adjMat[v][i] == 1 && NodeList[i].Visited == false) {
        return i;
      }
    }
    return -1;
  }
  
  public void mstanddfs() {
    if(addedEdges==addedNodes-1)
        System.out.println("The number of ways that we dont need is"+ "0");
    else if(addedEdges>=addedNodes)
        System.out.println("The number of ways that we dont need is "+(addedEdges-addedNodes+1));  
    else
        System.out.println("number of edges greater than number of nodes,try again!");
    NodeList[0].Visited = true;
    dfs.push(0);
    while(!dfs.isempty()) {   
      int current = dfs.peek();
      int v = getAdjUnvisitedNode(current);
      if(v == -1) {
        dfs.pop();
      } else {
          
        NodeList[v].Visited = true;
        GetNode(current);
        GetNode(v);
        System.out.print("||");
        dfs.push(v);
        
      }
    }
  }
}
