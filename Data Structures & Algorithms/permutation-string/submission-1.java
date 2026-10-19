class Solution {
public boolean checkInclusion(String s1, String s2) {
    	int n = s1.length();
        int m = s2.length();
        if (n > m) return false;
    	
    	int[] s1Map = new int[26];
    	int[] s2Map = new int[26];
    	
    	// First window
    	for (int i = 0; i < n; i++) {
            s1Map[s1.charAt(i) - 'a']++;
            s2Map[s2.charAt(i) - 'a']++;
        }
    	
    	for (int i = n; i < m; i++) {
    		if (Arrays.equals(s1Map, s2Map)) {
                return true;
            }
    		s2Map[s2.charAt(i) - 'a']++;
    		s2Map[s2.charAt(i - n) - 'a']--;
    	}
    	
    	return Arrays.equals(s1Map, s2Map);
    }
}
