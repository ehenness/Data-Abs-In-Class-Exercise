
import java.util.Stack;


public class validParentheses {
    public boolean isValid(String s) {
        if(s.length() <= 1) {
            return false;
        }
        Stack<Character> check = new Stack<>();
        
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                check.push(s.charAt(i));
            }
            else {
                if(s.charAt(i) == ')'){
                    if(check.pop() != '(') {
                        return false;
                    }
                }
                if(s.charAt(i) == ']'){
                    if(check.pop() != '[') {
                        return false;
                    }
                }
                if(s.charAt(i) == '}'){
                    if(check.pop() != '{') {
                        return false;
                    }
                }
            }
        }
        if (check.isEmpty() == false) {
            return false;
        }
        else {
            return true;
        }

    }
}
//if stack isn't empty at the end, something hasn't been matched and should return flase