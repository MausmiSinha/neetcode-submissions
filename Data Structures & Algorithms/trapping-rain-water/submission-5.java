class Solution {
   	 public int trap(int[] height) {
		 
		  if (height == null || height.length == 0) {
        return 0;
    }

    int l = 0, r = 0;
    int[] leftHighest = new int[height.length];
    int[] rightHighest = new int[height.length];

    for (int i = 0; i < height.length; i++) {
        l = height[i] >= l ? height[i] : l;
        leftHighest[i] = l;
    }

    for (int i = height.length - 1; i >= 0; i--) {
        r = height[i] >= r ? height[i] : r;
        rightHighest[i] = r;
    }

    int totalArea = 0;
    for (int i = 0; i < height.length; i++) {
        totalArea += Math.min(leftHighest[i], rightHighest[i]) - height[i];
    }

    return totalArea;
	    }
	 
}
