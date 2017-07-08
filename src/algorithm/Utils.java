package algorithm;
public class Utils {
	static final int MAX_VAL = 100;
	/*
	 * Generate a random number that < n
	 * */
	public static int random(int n) {
		return (int) Math.floor(Math.random() * n);
	}
	
	public static void printArray(int[] a) {
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			str.append(a[i]);
			if ( i < a.length - 1) {
				str.append(", ");
			}
		}
		System.out.println(str);
	}
	
	public static int[] randomArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = random(MAX_VAL);
		}
		return a;
	}
}
