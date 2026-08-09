class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result = false;

        if (nums.length > 0){
            HashSet<Integer> vistos = new HashSet<>();

            for (int num : nums) {
                if (!vistos.add(num)) {
                    result = true;
                    break; 
                }
            }
        }    
        return result;
    }
}