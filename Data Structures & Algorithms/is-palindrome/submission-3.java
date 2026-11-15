class Solution {
    public boolean isPalindrome(String s) {
        String newStr = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
	
	int l = 0;
	int r = newStr.length()-1;
	
	while(l<r) {
		if(newStr.charAt(l) != newStr.charAt(r)) return false;
		
		l++;
		r--;
	}
	return true;
    }
}
