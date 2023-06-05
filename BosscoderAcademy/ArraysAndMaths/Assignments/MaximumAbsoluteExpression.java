package BosscoderAcademy.ArraysAndMaths.Assignments;

/*
 * Given two arrays of integers with equal lengths, return the maximum value of:
|arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|
where the maximum is taken over all 0 <= i, j < arr1.length.

Example 1:
Input: arr1 = [1,2,3,4], arr2 = [-1,4,5,6]
Output: 13

Example 2:
Input: arr1 = [1,-2,-5,0,10], arr2 = [0,-2,-1,-7,-4]
Output: 20
 */
public class MaximumAbsoluteExpression {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n = arr1.length;

        int [] array1 = new int[n];
        int [] array2 = new int[n];
        int [] array3 = new int[n];
        int [] array4 = new int[n];

        for(int i = 0; i < n; i++){
            int s = arr1[i];
            int t = arr2[i];

            array1[i] = s + t + i;
            array2[i] = s + t - i;
            array3[i] = s - t + i;
            array4[i] = s - t - i;
        }

        int ans1 = findDiffOfMaxMin(array1);
        int ans2 = findDiffOfMaxMin(array2);
        int ans3 = findDiffOfMaxMin(array3);
        int ans4 = findDiffOfMaxMin(array4);

        return Math.max(Math.max(ans1, ans2), Math.max(ans3, ans4));
    }

    public int findDiffOfMaxMin(int [] array){
        int n = array.length;

        int min = array[0];
        int max = array[0];

        for(int i=1; i<n; i++){
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }
        return max - min;
    }
}
