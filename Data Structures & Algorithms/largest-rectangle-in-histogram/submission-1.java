class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0, r=0;
        Stack<Integer[]> st = new Stack<>();
        
        for(r = 0; r<heights.length; r++){
 
            int start = r;
            while(!st.isEmpty() && heights[r]< st.peek()[0]){
                maxArea = Math.max(maxArea, (r-st.peek()[1])*st.peek()[0]);
                start = st.pop()[1];
            }
            
            st.push(new Integer[] {heights[r], start});
        }
        
        while(!st.isEmpty()){
            maxArea = Math.max(maxArea, (r-st.peek()[1])*st.pop()[0]);
            // st.pop()[0];
        }
        
        return maxArea;
    }
}
