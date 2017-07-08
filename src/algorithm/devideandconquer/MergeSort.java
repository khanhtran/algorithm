package algorithm.devideandconquer;

import algorithm.Utils;

public class MergeSort {

	/**
	 * Merge 2 sorted array into one
	 * 
	 * @param a
	 * @param b
	 * @return merged array (sorted)
	 */
	public static int[] merge(int a[], int b[]) {
		if (a.length == 0) {
			return b;
		}
		if (b.length == 0) {
			return a;
		}

		if (a[0] < b[0]) {
			return add(a[0], merge(removeFirst(a), b));
		} else {
			return add(b[0], merge(a, removeFirst(b)));
		}
	}

	public static int[] add(int x, int a[]) {
		int[] b = new int[a.length + 1];
		b[0] = x;
		for (int i = 1; i < b.length; i++) {
			b[i] = a[i - 1];
		}
		return b;
	}

	public static int[] removeFirst(int[] a) {
		int[] b = new int[a.length - 1];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i + 1];
		}
		return b;
	}

	public static int[] mergeSort(int a[], int l, int r) {
		if (l > r) {
			return new int[0];
		} else if (l == r) {
			return new int[] { a[l] };
		}
		int m = (l + r) / 2;
		int[] a1 = mergeSort(a, l, m);
		int[] a2 = mergeSort(a, m + 1, r);

		return merge(a1, a2);
	}

	public static void main(String[] args) {
		// int a[] = new int[] {1,3,5};
		// int b[] = new int[] {2,4};
		// int[] c = merge(a, b);
		// Utils.printArray(c);

		int a[] = Utils.randomArray(20);
		Utils.printArray(a);
		Utils.printArray(mergeSort(a, 0, a.length - 1));
	}
}
