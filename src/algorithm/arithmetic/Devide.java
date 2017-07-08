package algorithm.arithmetic;
/**
 * Devide using subtraction only
 * @author Khanh
 *
 */
public class Devide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			int n = (int) Math.floor(Math.random() * 101);
			int d = (int) Math.floor(Math.random() * 101);
			int[] res = devide(n, d);
			System.out.println(n + "," + d + ":" + res[0] + "," + res[1]);
			assert(res[0] * d + res[1] == n);
		}
	}
	/**
	 * 
	 * @param n
	 * @param d
	 * @return [q, r] q=quotient, r=remainder 
	 */
	static int[] devide(int n, int d) {
//		n = 16, d=3 => q = 5, r = 1
		int q = 0;
		while (n >= d) {
			n = n - d;
			q++;
		}
		int r = n;
		return new int[] {q, r};
	}
}
