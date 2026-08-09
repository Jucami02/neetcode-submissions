class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> grupos = new HashMap<>();

        for (String word : strs) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = String.valueOf(chars);

            if (!grupos.containsKey(key)) {
                grupos.put(key, new ArrayList<>());
            }

            grupos.get(key).add(word);
        }

        return new ArrayList<>(grupos.values());
    }
}