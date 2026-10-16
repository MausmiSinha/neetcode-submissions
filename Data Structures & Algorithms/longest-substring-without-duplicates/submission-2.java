class Solution {
    public int lengthOfLongestSubstring(String s) {

      int max = 0;
        for (int i = 0; i < s.length(); i++) {
        HashMap<Character, Integer> map = new  HashMap<>();
        for (int j = i; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                break;
            }
            map.put(s.charAt(j),1);
        }
        max = Math.max(max, map.size());
    }
    return max;
        
    }
}
