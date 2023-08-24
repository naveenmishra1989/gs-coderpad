package com.example.gscoderpad.low;

public  class SecondSmallest
{
	/* Function to print first smallest and second smallest
      elements */
	static int print2Smallest(int arr[])
	{
		int first, second, arr_size ;

		/* There should be at least two elements */
		if (arr.length < 2)
		{

			return -1;
		}

		 first = second = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length ; i ++){
            /* If current element is smaller than first
              then update both first and second */
			if (arr[i] < first)
			{
				second = first;
				first = arr[i];
			}

            /* If arr[i] is in between first and second & "arr[i] != first" if 1st smallest are duplicate
               then update second  */
			else if (arr[i] < second && arr[i] != first)
				second = arr[i];
		}

			return second;

	}

	public static void main(String args[]) {

		int[] a = { 0 };
		int[] b = { 0, 1 ,1};
		int[] c = {3,5,8,9,2,2};

		boolean result = true;
		result &= print2Smallest(a) == -1;
		result &= print2Smallest(b) == 1;
		result &= print2Smallest(c) == 3;

		if (result) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}
}