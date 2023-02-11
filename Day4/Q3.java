package Day4;

/*
Question 268: Missing Number

Given an array nums containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array.
 */
public Q3{
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != count){
                return count;
            }
            count++;
        }
        return count;
    }

    public void Main(String[]args){
        int nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}