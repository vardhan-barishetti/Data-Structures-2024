package Recursion;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<String>();
        backtracking(res, "", 0, 0, n);
        return res;

        
    }

    void backtracking(List<String> res, String str, int open,int close, int n){
        if(str.length() == n*2 ){
            res.add(str);
            return;
        }

        if(open < n) backtracking(res, str+"(", open+1, close, n);
        if(open > close) backtracking(res, str+")", open, close+1, n);
            
    }
}