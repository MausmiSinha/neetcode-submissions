class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
		
		int[] arr = new int[26];
		
		for(int i =0; i< s.length() ; i++) {
			arr[(int)s.charAt(i) - 97] = arr[(int)s.charAt(i) - 97]+1;
			arr[(int)t.charAt(i) - 97] = arr[(int)t.charAt(i) - 97]-1;
		}
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i] != 0) {
				return false;
			}
		}
		
		return true;
    }
}
