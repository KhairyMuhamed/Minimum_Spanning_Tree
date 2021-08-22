/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minimum.spanning.tree;

import java.util.Scanner;



/**
 *
 * @author Mohamoud Elassy
 */
public class MinimumSpanningTree {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter maximum number of Edges:");
    int x=s.nextInt();
    System.out.println("Enter maximum number of Nodes:");
    int y=s.nextInt();
    if(x>y){
    Graph g=new Graph(x);
    for(int i=0;i<y;i++){
    System.out.println("Enter node"+" "+(i+1)+":");
    char c=s.next().charAt(0);
    g.addNode(c);
    }
    for(int i=0;i<x;i++){
    System.out.println("Enter two number that make edge between two nodes :");
    int start=s.nextInt();
    int end=s.nextInt();
    g.addEdge(start, end);
    }
    System.out.println("------------------------------------------");
    g.mstanddfs();}
    else{
    Graph g=new Graph(y);
    for(int i=0;i<y;i++){
    System.out.println("Enter node"+" "+(i+1)+":");
    char c=s.next().charAt(0);
    g.addNode(c);
    }
    for(int i=0;i<x;i++){
    System.out.println("Enter two number that make edge between two nodes :");
    int start=s.nextInt();
    int end=s.nextInt();
    g.addEdge(start, end);
    }
    System.out.println("------------------------------------------");
    g.mstanddfs();}
    
    
     /*Graph g=new Graph(10);
    g.addNode('a');
    g.addNode('b');
    g.addNode('c');
    g.addNode('d');
    g.addNode('e');
    g.addEdge(1,2);
    g.addEdge(2,3);
    g.addEdge(3,4);
    g.addEdge(4,5);
    g.addEdge(1,3);
    g.mstanddfs();*/
    
    
    }
    
}
