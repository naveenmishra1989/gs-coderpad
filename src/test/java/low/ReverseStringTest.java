package low;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseStr() {

        boolean result = true;

        result = result && reverseStr("abcd").equals("dcba");
        result = result && reverseStr("sapient").equals("tneipas");

        if (result) {
            System.out.println("All tests pass");
        } else {
            System.out.println("There are test failures");
        }

    }

    private String reverseStr(String str) {
        char[] chars = str.toCharArray();
        final StringBuilder builder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }
        return builder.toString();
    }
}