class Solution {
    public int countSeniors(String[] details) {

        int result = 0;

        for(String citizen : details){
            if(Integer.parseInt(citizen.substring(11,13)) > 60){
                result++;
            }
        }
        return result;        
    }
}