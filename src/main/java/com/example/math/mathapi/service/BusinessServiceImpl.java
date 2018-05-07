package com.example.math.mathapi.service;

import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl {

	private DataService dataService;

	public BusinessServiceImpl(DataService dataService) {
		this.dataService = dataService;
	}

	public int getMaxOfAllData() {
		int[] arr = dataService.getAllData();
		int max = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	public int getSum() {
		int[] arr = dataService.getAllData();
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		return sum;
	}

	/**
	 * Get LCM (Lowest Common Multiplicative) of two given numbers.
	 * 
	 * @param n1
	 *            - First parameter
	 * @param n2
	 *            - Second parameter
	 * @return int - LCM of n1 and n2
	 */
	public int getLCM(int n1, int n2) {
		// if n1 and n2 are equal, then lcm is n1.
		if (n1 == n2) {
			return n2;
		}

		int large = n1 > n2 ? n1 : n2;
		int lcm = large;
		for (int i = large; i <= (n1 * n2); i++) {
			if (i % n1 == 0 && i % n2 == 0) {
				lcm = i;
				break;
			}
		}
		return lcm;
	}

	/**
	 * Get GCD (Greatest Common Divisor) of two given numbers.
	 * 
	 * @param n1
	 *            - First parameter
	 * @param n2
	 *            - Second parameter
	 * @return int - GCD of n1 and n2
	 */
	public int getGCD(int n1, int n2) {
		int gcd = 1;
		int min = getMin(n1, n2);
		for (int i = min; i >= 1; i--) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				gcd = i;
				break;
			}
		}
		return gcd;
	}

	/**
	 * Get minimum of two given numbers.
	 * 
	 * @param n1
	 *            - First parameter
	 * @param n2
	 *            - Second parameter
	 * @return int - minimum of n1 and n2.
	 */
	public static int getMin(int n1, int n2) {
		return n1 < n2 ? n1 : n2;
	}

}