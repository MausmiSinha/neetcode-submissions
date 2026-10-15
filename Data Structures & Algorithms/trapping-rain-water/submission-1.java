class Solution {
    public int trap(int[] height) {

        int l=0;
        int r=0;

        int[] leftHighest = new int[height.length];
        int[] rightHighest = new int[height.length];

        int area = 0;
        int totalArea = 0;

        for(int i=0; i<height.length; i++){
            l = (height[i]>= l)? height[i]:l;
            leftHighest[i] =l;
        }

         for(int i=height.length-1; i>=0; i--){
            r = (height[i]>=r )? height[i]:r;
            rightHighest[i] =r;
        }
        
        for(int i=0; i<height.length; i++){
            area = Math.min(leftHighest[i],rightHighest[i]) - height[i];
            if(area<0){
                area= 0;
            }
            totalArea = totalArea+area;
        }

        return totalArea;
    }
}
