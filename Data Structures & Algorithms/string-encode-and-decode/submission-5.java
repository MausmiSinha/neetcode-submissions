class Solution {

   public String encode(List<String> strs) {
    	
    	if(strs.size() == 0) {
    		return Character.toString((char)258);
    	}
    	
    	StringBuilder encodedStr = new StringBuilder(); 
    	
    	for(String str: strs) {
    		encodedStr.append(str).append((char)257);
    	}
    	
    	encodedStr.deleteCharAt(encodedStr.length()-1);
    	
    	return encodedStr.toString();

    }

    public List<String> decode(String str) {
    	
    	if(str.equals(Character.toString((char)258))) return Arrays.asList();
    	
    	return Arrays.asList(str.split(Character.toString((char)257), -1));

    }
}
