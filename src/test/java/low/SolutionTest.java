package low;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMin() {
        int val[] = new int[]{2,4,6,8,1};
        System.out.println(findMin(val));
    }

    private int findMin(int[] array){
        if (array.length<1)
            return 0;
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
             if (array[i] < min)
                 min = array[i];
        }
        return min;
    }
}