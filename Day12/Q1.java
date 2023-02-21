package Day12;

/*
 * Question 326 - Power of Three
 * Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.
 * 
 */

public class Q1 {
    public boolean isPowerOfThree(int n) {
        int div = 0;
        if(n <= 0){
            return false;
        }

        if(n == 1){
            return true;
        }

        while(n % 3 == 0){
            div = n / 3;
            n = div;
        }

        if(div == 1){
            return true;
        }
        return false;
    }
}
