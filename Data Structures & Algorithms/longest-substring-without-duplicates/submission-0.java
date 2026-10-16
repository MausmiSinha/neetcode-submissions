class Solution {
    public int lengthOfLongestSubstring(String s) {

      int max = 0;
        for (int i = 0; i < s.length(); i++) {
        HashMap<Character, Integer> charMap = new  HashMap<>();
        for (int j = i; j < s.length(); j++) {
            if (charMap.containsKey(s.charAt(j))) {
                break;
            }
            charMap.put(s.charAt(j),1);
        }
        max = Math.max(max, charMap.size());
    }
    return max;
        
    }
}
