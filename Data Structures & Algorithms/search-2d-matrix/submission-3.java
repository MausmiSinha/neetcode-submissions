class Solution {
    	 public boolean searchMatrix(int[][] matrix, int target) {

	      int row = matrix.length, col = matrix[0].length, startRow = 0, endRow = row-1;
	      while(startRow<=endRow) {
	    	  int midRow = startRow + (endRow-startRow)/2;
	    	  if(target >= matrix[midRow][0] &&  target<= matrix[midRow][col-1]) {
	    		  //Do Binary Search Again
	    		  int start = 0, end = col-1;
	    		  while(start<=end) {
	    			  int mid = start + (end-start)/2;
	    			  if(target == matrix[midRow][mid]) {
	    				  return true;
	    			  }else if(target> matrix[midRow][mid]){
	    				  start = mid+1;
	    			  }else {
	    				  end = mid-1;
	    			  }
	    		  }
	    		  return false;
	    	  } else if(target < matrix[midRow][0]) {
	    		  endRow = midRow -1;
	    	  } else {
	    		  startRow = midRow +1;
	    	  }
	      }
	      
	      return false;
	        
	    }

}
