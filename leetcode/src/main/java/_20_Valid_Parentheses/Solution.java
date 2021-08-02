package _20_Valid_Parentheses;

import java.util.Stack;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date
 * @project code-in-java
 */
public class Solution {

  public boolean IsValidParentheses(String in) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < in.length(); i++) {
      char s = in.charAt(i);
      switch (s) {
        case '[':
        case '(':
        case '{':
          stack.push(s);
          break;
        case ']':
          if (!stack.empty() && stack.peek().equals('[')) {
            stack.pop();
            break;
          } else {
            return false;
          }
        case ')':
          if (!stack.empty() && stack.peek().equals('(')) {
            stack.pop();
            break;
          } else {
            return false;
          }
        case '}':
          if (!stack.empty() && stack.peek().equals('{')) {
            stack.pop();
            break;
          } else {
            return false;
          }
        default:
          return false;
      }
    }
    //忽略了（ 、（（等情况
    if (stack.empty()) {
      return true;
    }
    return false;
  }
}
