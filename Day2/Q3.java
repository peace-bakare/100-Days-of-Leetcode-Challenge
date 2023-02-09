package Day2;

/*Given two integers num1 and num2, return the sum of the two integers. */

public class Q3 {
    public int sum(int num1, int num2){
        if(num1 + num2 < 0){
            return Integer.parseInt("-" + (Math.abs(num1 + num2)));
        }
        return (num1 + num2);
    }

    public void Main(String[]args){
        System.out.println(sum(12, 5));
        System.out.println(sum(-10, 4));
        System.out.println(sum(-6, 94));
    }
}
