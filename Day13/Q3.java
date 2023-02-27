package Day13;

/*
 * Question 69 - Sqrt(x)
 * 
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
 * The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 */

public class Q3 {
    public int mySqrt(int x) {
        int odd = 1;
        int count = 0;

        while (x >= odd){
            x -= odd;
            count++;
            odd = odd + 2;
        }

        return count;
    }
}
