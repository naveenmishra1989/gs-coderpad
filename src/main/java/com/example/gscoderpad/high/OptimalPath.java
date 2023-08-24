package com.example.gscoderpad.high;

import java.util.HashMap;

/*
** Instructions to candidate.
**  1) You are an avid rock collector who lives in southern California. Some rare 
**     and desirable rocks just became available in New York, so you are planning 
**     a cross-country road trip. There are several other rare rocks that you could 
**     pick up along the way. 
**     
**     You have been given a grid filled with numbers, representing the number of 
**     rare rocks available in various cities across the country.  Your objective 
**     is to find the optimal path from So_Cal to New_York that would allow you to 
**     accumulate the most rocks along the way. 
**     
**     Note: You can only travel either north (up) or east (right).
**  2) Consider adding some additional tests in doTestsPass().
**  3) Implement optimalPath() correctly.
**  4) Here is an example:
**                                                           ^
**                 {{0,0,0,0,5}, New_York (finish)           N
**                  {0,1,1,1,0},                         < W   E >
**   So_Cal (start) {2,0,0,0,0}}                             S
**                                                           v 
**   The total for this example would be 10 (2+0+1+1+1+0+5).
*/
public class OptimalPath {
	public static Integer optimalPath(Integer[][] grid) {
		int max = 0;
		int rows = grid.length;
		HashMap<Pair, Integer> cache = new HashMap<Pair, Integer>();
		max = getMaxRocks(grid, rows - 1, 0, cache);
		return max;
	}

	private static int getMaxRocks(Integer[][] grid, int row, int col, HashMap<Pair, Integer> cache) {
		Pair pair = new Pair(row, col);
		if(cache.containsKey(pair)) {
			return cache.get(pair);
		}
		if(row < 0 || col >= grid[0].length) {
			return 0;
		}
		int northMax = getMaxRocks(grid, row-1, col, cache);
		int eastMax = getMaxRocks(grid, row, col + 1, cache);
		int val = Math.max(northMax, eastMax) + grid[row][col];
		cache.put(pair, val);
		return val;
	}

	public static boolean doTestsPass() {
		boolean result = true;
		result &= optimalPath(new Integer[][] {
			{ 0, 0, 0, 0, 5 },
			{ 0, 1, 1, 1, 0 },
			{ 2, 0, 0, 0, 0 }
		}) == 10;
		result &= optimalPath(new Integer[][] {
			{ 0, 0, 1 },
			{ 1, 1, 2 },
			{ 2, 2, 3 },
			{ 3, 3, 4 },
		}) == 16;
		return result;
	}

	public static void main(String[] args) {
		if (doTestsPass()) {
			System.out.println("All tests pass");
		} else {
			System.out.println("Tests fail.");
		}
	}
	
	static class Pair {
		int row;
		int col;
		public Pair(int row, int col) {
			this.row = row;
			this.col = col;
		}
		
		@Override
		public int hashCode() {
			return row * 37 + col * 91;
		}
		
		@Override
		public boolean equals(Object obj) {
			Pair pair = (Pair) obj;
			return this.row == pair.row && this.col == pair.col;
		}
	}
	
}
