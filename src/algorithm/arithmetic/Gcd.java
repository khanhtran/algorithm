package algorithm.arithmetic;

public class Gcd {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			int x = (int) Math.floor(Math.random() * 1000000) + 1;
			int y = (int) Math.floor(Math.random() * 1000000) + 1;
			System.out.println();
			System.out.print(x + ", " + y);
			int g = gcd2(x, y);
			System.out.print(" =" + g);
			assert(x % g == 0 && y % g == 0);
			System.out.println();
		}
//		System.out.println(gcd2(52, 26));
	}

	public static int gcd1(int x, int y) {
		if (x == y) {
			return x;
		}
		if (x == 1 || y == 1) {
			return 1;
		}

		if (x > y) {
			return gcd1(x - y, y);
		} else {
			return gcd1(x, y - x);
		}
	}
	
	public static int gcd2(int x, int y) {
		if ( x == 0) {
			return y;
		}
		if (y == 0) {
			return x;
		}
		if (x == y) {
			return x;
		}
		if (x == 1 || y == 1) {
			return 1;
		}

		if (x > y) {
			return gcd2(x % y, y);
		} else {
			return gcd2(x, y % x);
		}
	}
}
