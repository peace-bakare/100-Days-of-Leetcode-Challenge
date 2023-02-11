Package Day4;

/* Given a non-empty array of integers nums, every element appears twice except for one. 
Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 */

public Q1{
    public int singleNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++){
            if(hashSet.contains(nums[i])){
                hashSet.remove(nums[i]);
            }else{
                hashSet.add(nums[i]);
            }
        }
        Iterator<Integer> iterate = hashSet.iterator();
        //int left = iterate.hasNext();
        return iterate.next();

    }

    public void Main(String[]args){
        int [] nums = {2,2,1};

        System.out.println(singleNumber(nums));
    }
}