class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        	HashMap<String, List<String>> map = new HashMap<>();
	
	for(String s: strs) {
		String oldStr = s;
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		s = new String(arr);
		if(map.containsKey(s)) {
			map.get(s).add(oldStr);
		}else {
			map.put(s, new ArrayList<String>(Arrays.asList(oldStr)));
		}
	}
	
	List<List<String>> result = new ArrayList<>();
	
	for(String key: map.keySet()) {
		result.add(map.get(key));
	}
	
	return result;
    }
}
