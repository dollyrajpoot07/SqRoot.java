// Square root of an integer
// Given an integer X, find its square root. If X is not a perfect square, then return floor(√x).
// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2.

// Input: x = 11
// Output: 3
// Explanation:  The square root of 11 lies in between 3 and 4 so floor of the square root is 3.

class SqRoot {
	static int countSquares(int x) {
		int sqr = (int) Math.sqrt(x);
		int result = (int) (sqr);
		return result;
	}

	public static void main(String[] args) {
		int x = 9;
		System.out.print(countSquares(x));
	}
}
