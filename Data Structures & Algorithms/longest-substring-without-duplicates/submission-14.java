class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 1 || s.length() == 0) {
			return s.length();
		}
        HashMap<Character, Integer> map = new HashMap<>();
	
	int st=0, maxLength= Integer.MIN_VALUE;
	for(int end = 0; end<s.length(); end ++) {
		if(map.containsKey(s.charAt(end))) {
			
			st = Math.max(st, map.get(s.charAt(end)) + 1);
			map.put(s.charAt(end), end);
		}else {
			map.put(s.charAt(end), end);
		}

        maxLength = Math.max(maxLength, end-st+1);
	}
	
	return maxLength;
    }
}
