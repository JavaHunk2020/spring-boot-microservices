package com.keubiko.service;

public class FactorialService {

	/**
	 * This method has dependency on any other service?????
	 * @param num
	 * @return
	 */
	public int fact(int num) {

		if (num < 0 || num > 10) {
			throw new ArithmeticException("Hey! you cannot compute factorial of negative num!");
		}

		int ff = 1;
		for (int x = 2; x <= num; x++) {
			ff = ff * x;
		}
		return ff;
	}

}
