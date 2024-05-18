package Recursion;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        // if(nums.length == 0){
        //     return res;
        // }
        
        int i = 0;
        uniqueElements(nums, res, subset, i);
        return res;
        
    }
    public void uniqueElements(int[] nums,List<List<Integer>> res, List<Integer> subset, int i ){
        if(i >= nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        uniqueElements(nums, res, subset, i + 1);

        subset.remove(subset.size() - 1);
        uniqueElements(nums, res, subset, i + 1);

        return;

    }

}