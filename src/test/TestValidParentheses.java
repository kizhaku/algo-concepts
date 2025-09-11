package test;

import com.kizhaku.learn.problems.ValidParentheses;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

public class TestValidParentheses {

    private Map<String, Boolean> inputs;
    private ValidParentheses validParentheses = new ValidParentheses();

    @BeforeEach
    public void init() {
        inputs = Map.of("()", true, "()[]{}", true, "(]", false, "([])", true
        , "]{", false, "[", false);
    }

    @Test
    public void testValidParentheses() {
        inputs.forEach((k, v) -> {
            System.out.println("Testing with: " +k);
            assertEquals(v, validParentheses.isValid(k));
        });
    }
}
