package Day25;

public class Rotate {
    public static int [] rotate(int[] nums, int k) {
        int i = 0; 
	    int j = k - 1;
        int n = nums.length;
        int c = n - 1;
        
        //Reverse all elements in the array
        while(i<c){
            int temp = nums[i];
        	nums[i] = nums[c];
        	nums[c] = temp;
        	i++; c--;
        }

        while(i<j){
        	int temp = nums[i];
        	nums[i] = nums[j];
        	nums[j] = temp;
        	i++; j--;
        }
        
        if(n - k > 1){
            int a = k; 
            int b = n - 1;
            while(a < b){
            	int temp = nums[a];
            	nums[a] = nums[b];
            	nums[b] = temp;
            	a++; b--;
            }
        }

        return nums;
    }

    public static void main(String [] args){
        int [] array = {1, 2, 3, 4, 5};
	    int k = 4;
		System.out.println("Rotated Array is: " + rotate(array, k));
    }
}
