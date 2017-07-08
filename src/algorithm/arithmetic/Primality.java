package algorithm.arithmetic;

/**
 * Primality test The simplest probabilistic primality test is the Fermat
 * primality test (actually a compositeness test). It works as follows: Given an
 * integer n, choose some integer a coprime to n and calculate an − 1 modulo n.
 * If the result is different from 1, then n is composite. If it is 1, then n
 * may or may not be prime.
 * 
 * @author Khanh
 *
 */
public class Primality {
	public static boolean isPrime(int n) {
		if (n == 2 || n == 3) {
			return true;
		}
		int max = (int) Math.ceil(Math.sqrt(n));
		for (int i = 2; i <= max; i++) {
			if ((n % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
//		for (int i = 0; i < 100; i++) {
//			int n = Utils.random(200);
//			System.out.println(n + ": " + isPrime(n));
//		}
		int n = 561;
		System.out.println(n + ": " + isPrime(n));
	}
}
