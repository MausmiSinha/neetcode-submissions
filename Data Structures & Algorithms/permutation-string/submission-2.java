class Solution {
public boolean checkInclusion(String s1, String s2) {
	if ( s1.length() >  s2.length()) return false;
	int k = s1.length();
	int[] arr = new int[26];
	
	for(int i=0; i<k; i++) {
		arr[s1.charAt(i)-'a']++;
		arr[s2.charAt(i)-'a']--;
	}
	
	for(int i= k; i< s2.length() ; i++) {
		if(Arrays.stream(arr).allMatch(x -> x == 0)) return true;
			arr[s2.charAt(i)-'a']--;
		arr[s2.charAt(i - k)- 'a']++;
	}
       return  Arrays.stream(arr).allMatch(x -> x == 0);
    }
}
