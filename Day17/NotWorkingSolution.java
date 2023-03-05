package Day17;
import java.util.HashMap;
import java.util.Stack;

public class NotWorkingSolution {
    public boolean isValid(String s) {
        int len = s.length();
        if(len % 2 != 0){
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Character complement = ' ';
        Character item = ' ';
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        int i = 1;

        while(!stack.isEmpty() && i != len){
            complement = map.get(s.charAt(i));
            item = stack.peek();
            if(item != complement){
                stack.push(s.charAt(i));
                i++;
            }else{
                stack.pop();
                i++;

                if(i < len && stack.isEmpty()){
                    stack.push(s.charAt(i));
                    i++;
                }
            }
        }

        return stack.size() == 0;  
    }    
}
