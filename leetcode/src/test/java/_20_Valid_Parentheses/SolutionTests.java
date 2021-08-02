package _20_Valid_Parentheses;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author islander-007
 * @email ....@gmail.com
 * @date
 * @project code-in-java
 */
public class SolutionTests {

  Solution solution = new Solution();

  @Test
  void solution() {
    String s1 = "()";
    boolean tt = solution.IsValidParentheses(s1);
    assertTrue(tt);
    String s2 = "()[]{}";
    boolean t2 = solution.IsValidParentheses(s2);
    assertTrue(t2);
    String s3 = "(]";
    boolean t3 = solution.IsValidParentheses(s3);
    assertFalse(t3);
    String s4 = "([)]";
    boolean t4 = solution.IsValidParentheses(s4);
    assertFalse(t4);
    String s5 = "{[]}";
    boolean t5 = solution.IsValidParentheses(s5);
    assertTrue(t5);
  }


}
