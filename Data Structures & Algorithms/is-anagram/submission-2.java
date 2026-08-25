class Solution {
    public boolean isAnagram(String s, String t) {

        char[] text1 = s.toCharArray();
        char[] text2 = t.toCharArray();

        Arrays.sort(text1);
        Arrays.sort(text2);


        String s1 = String.valueOf(text1);
        String s2 = String.valueOf(text2);




        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }

    }
}
