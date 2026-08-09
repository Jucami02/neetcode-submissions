class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList();


        for (int i = 0; i < nums.length; i++){
            if (list.size() > 0){
                break;
            }
            for(int j = 0; j < nums.length; j++){
                if((nums[i]+nums[j]) == target){
                    if( i != j ){
                        list.add(i);
                        list.add(j);
                        break;
                    }
                }
            }
        }
        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
        
    }
}
