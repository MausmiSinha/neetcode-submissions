class Solution {
    	public String minWindow(String s, String t) {
		
			if(t.length()> s.length()) return "";
	        
			HashMap<Character, Integer> HMap = new HashMap<>(), NMap = new HashMap<>();
			
			for(int i=0; i<t.length(); i++) {
				HMap.put(t.charAt(i), 0);
				NMap.put(t.charAt(i), NMap.getOrDefault(t.charAt(i), 0)+1);
			}
			
			int minLength=Integer.MAX_VALUE, idxR = -1, idxL = -1, have = 0, l=0;
			int need = NMap.size();
			
			
			for(int r=0; r<s.length(); r++) {
				if(HMap.containsKey(s.charAt(r))) {
					HMap.put(s.charAt(r), HMap.get(s.charAt(r))+1);
					if(HMap.get(s.charAt(r)).equals((NMap).get(s.charAt(r)))) have++;
				}
				
				while(have == need) {
					if(minLength > (r-l+1)) {
						minLength = (r-l+1);
						idxL = l;
						idxR = r;
					}
					
					if(HMap.containsKey(s.charAt(l))) {
						HMap.put(s.charAt(l), HMap.get(s.charAt(l))-1);
						if(HMap.get(s.charAt(l)) < NMap.get(s.charAt(l))) have--;
					}
					l++;
				}
				
			}
			if(idxL ==-1 || idxR == -1) return "";
			return s.substring(idxL,idxR+1);
	    }
}
