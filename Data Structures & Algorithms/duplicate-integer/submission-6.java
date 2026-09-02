class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hNums = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!hNums.add(nums[i])){
                return true;
            }
        }
        return false;

        
    }
}