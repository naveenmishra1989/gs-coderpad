package com.example.gscoderpad.low;

public class SquareRoot {
  /*
  *   double squareRoot( double x )
  *
  */

	private static double findSqrt(double x, double min, double max) {
		double mid = (max + min) / 2;
		double midsq = mid*mid;
		if(midsq < x + 0.001 && midsq > x - 0.001) {
			return mid;
		}
		else if( midsq > x + 0.001) {
			return findSqrt(x, min, mid);
		}
		else {
			return findSqrt(x, mid, max);	
		}		
	}

  public static double squareRoot( double x )
  {
    return findSqrt(x, 0, x);
  }

  public static void main( String args[])
  {
    double[] inputs = {2, 4, 100};
    double[] expected_values = { 1.41421, 2, 10 };
    double threshold = 0.001;
    for(int i=0; i < inputs.length; i++)
    {
      if( Math.abs(squareRoot(inputs[i])-expected_values[i])>threshold )
      {
        System.out.printf( "Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i], squareRoot(inputs[i]) );
      }
    }
    System.out.println( "All tests passed");
  }
}