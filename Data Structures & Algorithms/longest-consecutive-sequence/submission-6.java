class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toSet());
        int longest = 0;

        for(int n: numSet){
            if(!numSet.contains(n-1)){
                int length = 0;
                while (numSet.contains(n + length)){
                    length+=1;

                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
