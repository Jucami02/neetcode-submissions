
class Solution {
    public boolean isAnagram(String s, String t) {

        boolean result = false;

        char[] char1 = s.toLowerCase().toCharArray();
        char[] char2 = t.toLowerCase().toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        if(Arrays.equals(char1, char2)){
            result = true;
        }

        return result;
    }
}
