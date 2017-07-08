package algorithm.devideandconquer;

import java.util.ArrayList;
import java.util.List;

import algorithm.Utils;

public class Median {

	public static void main(String[] args) {
		int [] s = Utils.randomArray(5);
		int v = selection(s, 1);
		Utils.printArray(s);
		System.out.println(s[v]);
	}
	
//	SELECTION
//	Input: A list of numbers S; an integer k
//	Output: The kth smallest element of S (index 0..|s|-1
//	For instance, if k = 1, the minimum of S is sought, 
//	whereas if k = |s|/2, it is the median.
	public static int selection(int[] s, int k) {
		int v = s.length/2;
		int[] leftK = findLeftK(s, v);
		int[] kVals = findK(s, v);
		int[] rightK = findRightK(s, v);
		if (leftK.length < k && k <= (leftK.length + kVals.length)) {
			return v;
		} else if (k <= leftK.length) {
			return selection(leftK, k);
		} else if (k > (leftK.length + kVals.length)) {
			return selection(rightK, k - (leftK.length + kVals.length));
		}
		return 0;
	}

	public static int[] findLeftK(int[] s, int v) {
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < s.length; i++) {
			if (s[i] < s[v]) {
				arr.add(s[i]);
			}
		}
		int[] res = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			res[i] = arr.get(i);
		}
		return res;
	}
	
	public static int[] findK(int[] s, int v) {
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < s.length; i++) {
			if (s[i] == s[v]) {
				arr.add(s[i]);
			}
		}
		int[] res = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			res[i] = arr.get(i);
		}
		return res;
	}
	
	public static int[] findRightK(int[]s, int v) {
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < s.length; i++) {
			if (s[i] > s[v]) {
				arr.add(s[i]);
			}
		}
		int[] res = new int[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			res[i] = arr.get(i);
		}
		return res;
	}
}
