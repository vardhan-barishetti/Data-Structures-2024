package Recursion;

import java.util.Stack;

class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty()) return;
        
        int num = s.pop();
        reverse(s);
        insert_bottom(s, num);
    }
        
    static void insert_bottom(Stack<Integer> s, int num){
        if(s.isEmpty()){
            s.push(num);
        }
        else{
            int top = s.pop();
            insert_bottom(s, num);
            s.push(top);
        }
        
    }
   
}