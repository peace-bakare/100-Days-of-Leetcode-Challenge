package Day4;

public Q2{
    public int firstBadVersion(int n) {
        int left = 0; int right = n;

        while (left < right){
            int mid = left + (right - left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    public void Main(String[]args){
        int n = 5;
        System.out.println(firstBadVersion(n));
    }
}