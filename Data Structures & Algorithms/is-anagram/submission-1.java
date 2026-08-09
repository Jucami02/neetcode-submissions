
class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] char1 = s.toLowerCase().toCharArray();
        char[] char2 = t.toLowerCase().toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        if(Arrays.equals(char1, char2)){
            return true;
        }

        return false;
    }
}
