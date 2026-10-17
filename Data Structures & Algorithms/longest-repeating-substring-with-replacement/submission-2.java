class Solution {
    public int characterReplacement(String s, int k) {

    	  	int l = 0;
    	int maxFreq = 0;
    	int max = 0;
    	
    	int[] charFreq = new int[26];
    	
    	for(int r = 0; r<s.length(); r++) {
    		
    		charFreq[s.charAt(r) - 'A']++ ;
    		maxFreq = Math.max(maxFreq, charFreq[s.charAt(r) - 'A']);
    		
    		if((r-l+1)> max && ((r-l+1)- maxFreq)<= k) {
    			max = (r-l+1);
    		}else {
    			charFreq[s.charAt(l)-'A']--;
    			l++;
    		}
    	}
        return max;
        
    }
}
