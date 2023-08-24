package low;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {

    @Test
    void squareRoot() {
        System.out.println(squareRoot(12d));
        System.out.println(squareRootRec(12d));
    }

    private double squareRoot(double num) {
        double sqrRoot = num / 2; //mid of number
        double temp;
        do {
            temp = sqrRoot;
            sqrRoot = (temp + (num / temp)) / 2;
        } while ((temp - sqrRoot) != 0);

        return sqrRoot;
    }

    private double squareRootRec(double num) {
        return findSqrRoot(num, 0, num);
    }

    private double findSqrRoot(double num, double min, double max) {
        double mid = (min + max) / 2;
        double sqrMid = mid * mid;
        if (sqrMid < num + 0.001 && sqrMid > num - 0.001) {
            return mid;
        }else if(sqrMid > num+0.001){
            return findSqrRoot(num,min,mid);
        }else {
            return findSqrRoot(num, mid, max);
        }


    }
}