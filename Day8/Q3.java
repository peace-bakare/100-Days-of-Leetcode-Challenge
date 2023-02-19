package Day8;

/*
 * Question 191 - Number of 1 Bits
 * Write a function that takes the binary representation of an unsigned integer and returns the number 
 * of '1' bits it has (also known as the Hamming  weight).

Note:

Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be 
given as a signed integer type. It should not affect your implementation, as the integer's internal binary 
representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, 
the input represents the signed integer. -3.
 */
public class Q3{
    //Abridged solution
    public int hammingWeight(int n) {
        String number = Integer.toBinaryString(n);
        int count = 0;
        int len = number.length();

        for(int i=0; i<len; i++){
            if(number.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}