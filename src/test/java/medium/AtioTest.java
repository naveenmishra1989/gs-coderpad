package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtioTest {

    @Test
    void atoi() {
        System.out.println(atio("1230"));
        System.out.println((int)'0');

    }
    private int atio(String  str){
        char[] chars = str.toCharArray();
        int result =0;
        for (char ch:chars) {
            result = result * 10 +ch-48;
        }
        return result;
    }
}