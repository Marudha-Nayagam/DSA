//https://leetcode.com/problems/contains-duplicate/

import java.util.*;

class ContainsDuplicate { 
    public boolean Duplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();

        for (int val : nums) {
            if(hset.contains(val)) {
                return true;
            }
            hset.add(val);
        }
        return false;
       
    }
    public static void main(String[] args) {
        ContainsDuplicate result = new ContainsDuplicate();
        int[] input = new int[]  {1,2,3,4,1};
        System.out.println(result.Duplicate(input));
    }
}