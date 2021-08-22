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
public class Stack {
 int stack[];
 int top;
 Stack(int size){
 stack=new int[size];
 top=-1;
 }
 boolean isempty(){
 if(top==-1)
     return true;
 else
     return false;
 }
 void push(int item){
 if(top>=stack.length-1)
 { System.out.println("stack is full");}
 else
 {top++;
 stack[top]=item;
 }
 }
 int pop () {
if ( isempty( )){
System.out.println("Stack is empty");
return -1 ; 
}else{
int item = stack [top] ;
top -- ;
return item ;}
}
 int peek() 
{ 
if (top < 0) { 
System.out.println("Stack Underflow"); 
return 0; 
} 
else { 
int x = stack[top]; 
return x; 
} 
}}

