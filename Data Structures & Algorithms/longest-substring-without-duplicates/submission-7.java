class Solution {
    public int lengthOfLongestSubstring(String s) {
		
		if(s.length() == 1 || s.length() == 0) {
			return s.length();
		}

	      int max = 0, count=0;
	      HashMap<Character, Integer> map = new HashMap<>();
	      int l=0,r=0;
	      for(r = 0; r<s.length(); r++) {
	    	  // Check if already not present in the window
	    	  if(!map.containsKey(s.charAt(r)) || map.get(s.charAt(r))<l) {
	    		  map.put(s.charAt(r), r);
	    	  } else {
	    		  max = Math.max(max, r-l);
	    		  l = map.get(s.charAt(r))+1;
	    		  map.put(s.charAt(r), r);
	    	  }
	      }
	      max = Math.max(max, r-l);
	      return max;
	}
	      
}
