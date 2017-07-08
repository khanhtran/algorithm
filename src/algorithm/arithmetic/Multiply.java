package algorithm.arithmetic;
//x= 11, y = 13, x * y = ?
// To multiply two decimal numbers x and y, write them next to each
// other, as in the example below. Then repeat the following: divide the
// first number by 2,
// rounding down the result (that is, dropping the :5 if the number was
// odd), and double the
// second number. Keep going till the first number gets down to 1. Then
// strike out all the rows
// in which the first number is even, and add up whatever remains in the
// second column
public class Multiply {
	public static int mul(int x, int y) {
		if (y == 0) {
			return 0;
		}
		if (x == 1) {
			return y;
		}
		int z = mul(x / 2, y);
		if (x % 2 == 0) {
			return 2 * z;
		} else {
			return y + 2 * z;
		}
	}

	public static int mulNoRecursive(int x, int y) {
		if (x == 0) {
			return 0;
		}
		int p = x % 2 == 0 ? 0 : y;
		do {
			x = x / 2;
			y = y * 2;
			if (x % 2 == 1) {
				p += y;
			}
		} while (x > 1);
		return p;
	}

	public static void main(String[] args) {
		System.out.println(mulNoRecursive(11, 13) + " " + 11 * 13);
		System.out.println(mulNoRecursive(12, 13) + " " + 12 * 13);
		System.out.println(mulNoRecursive(11, 14) + " " + 11 * 14);
		System.out.println(mulNoRecursive(12, 14) + " " + 12 * 14);
		System.out.println("----------");
		System.out.println(mul(11, 13) + " " + 11 * 13);
		System.out.println(mul(12, 13) + " " + 12 * 13);
		System.out.println(mul(11, 14) + " " + 11 * 14);
		System.out.println(mul(12, 14) + " " + 12 * 14);
	}
}
