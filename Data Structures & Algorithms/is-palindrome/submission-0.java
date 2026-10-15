class Solution {
    public boolean isPalindrome(String s) {

        //eliminar espacios de string
        String lowerString = s.toLowerCase();
        String cleanString = lowerString.replaceAll("[^a-zA-Z0-9]", "");
        int arraySize =  cleanString.length();


        //la mitad del string
        int lastIndex = arraySize/2;


        for(int i = 0; i < lastIndex; i++){
            if((cleanString.charAt(i)) != (cleanString.charAt(arraySize-1))){
                return false;
            }
            arraySize--;
        }
        return true;
        
    }
}
