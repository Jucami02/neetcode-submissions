class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result = false;

        HashSet<Integer> validNums = new HashSet<Integer>();

        for(Integer num : nums){
            if(!validNums.add(num)){
                result =  true;
                break;

            }

        }
        return result;
    }
}