class Solution {

    public String encode(List<String> strs) {
        StringBuilder completeString = new StringBuilder("");

        for(String string : strs){
            completeString
            .append(string.length())
            .append("#")
            .append(string);
        }

        return completeString.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while(i < str.length()){
        int j = i;

        while (str.charAt(j) != '#') {
            j++;
            }      
        
        int length = Integer.parseInt(str.substring(i,j));

        i = j + 1;

        result.add(str.substring(i, i + length));

        i = i + length;   

        }

        return result;
    }
}
