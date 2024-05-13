package Recursion;

import java.util.Stack;

class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        
        if(s.size() == 1 ) return s;
        
        int temp = s.pop();
        sort(s);
        insert(s, temp);
        return s;
    }
    
    public static void insert(Stack<Integer> s, int temp){
        if(s.isEmpty() || s.peek() <= temp){
            s.push(temp);
            return;
        }
        
        int val = s.peek();
        s.pop();
        insert(s, temp);
        s.push(val);
        
        return; 
        
    }
  
}