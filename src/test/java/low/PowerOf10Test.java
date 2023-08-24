package low;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOf10Test {

    @Test
    void isPowerOf10() {
        System.out.println(isPowerOf10(1));
        System.out.println(isPowerOf10(10));
        System.out.println(isPowerOf10(11));
        System.out.println(isPowerOf10(10000));
    }

    private boolean isPowerOf10(int num){
        if(num<10)
            return false;
        while (num > 1){
            if(num%10 != 0)
                return false;
            num = num/10;
        }
        return true;
    }
}