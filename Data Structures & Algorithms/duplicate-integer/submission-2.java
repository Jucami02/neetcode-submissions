class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result = false;

        if(nums.length > 0){
            int num = nums[0];
            for(int i = 0; i < nums.length; i++){
                for(int j = i+1; j < nums.length; j++){
                    if(nums[j] == nums[i]){
                        result =  true;
                        }
                } 
            }

        }
        return result;
    }
}