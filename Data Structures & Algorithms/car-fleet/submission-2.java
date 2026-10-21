class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

            	int n = position.length;
    	int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[] { position[i], speed[i] };
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));
        int fleets = 0;
        double maxTime = 0;
        
        for (int i = 0; i < n; i++) {
        	
            double time = (double) (target - arr[i][0]) / arr[i][1];
            
            if (time > maxTime) {
                fleets++;
                maxTime = time;
            }
        }
        
    	return fleets;
        
    }
}
