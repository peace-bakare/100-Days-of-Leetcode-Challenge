import java.util.ArrayList;
import java.util.List;

/*Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true. */


public class Q1 {
    public List<String> fizzbuzz(int n){
        List<String> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                list.add("FizzBuzz");
            }else if(i % 3 == 0){
                list.add("Fizz");
            }else if(i % 5 == 0){
                list.add("Buzz");
            }else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

    public void Main(String[]args){
        int n = 3;
        System.out.println(fizzbuzz(n));
    }
}
