import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) { 
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);
        return result;
    }

    public void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
       
        if (current.size() == nums.length) {

            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
           
            if (!used[i]) {
                used[i] = true;
                current.add(nums[i]);
                backtrack(nums, current, used, result);
                used[i] = false;
                current.remove(current.size() - 1);
            }
        }
    }
}