package low;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondSmallestTest {

    @Test
    void print2Smallest() {
        int a[] = new int[]{1,5,9,6};
        int b[] = new int[]{1,1,5,9,5};
        System.out.println(print2Smallest(a));
        System.out.println(print2Smallest(b));
    }

    private int print2Smallest(int[] array){
        int first,second;
        if (array.length<2)
        return -1;
        first = second = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i]<first){
                second = first ;
               first = array[i];
            }else if (array[i]<second && array[i]!=first){
                second = array[i];
            }
        }
        return second;
    }
}