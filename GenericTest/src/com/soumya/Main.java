package com.soumya;

import java.util.List;

public class Main {

	static <T> T m(T...t) {
		
		return t[0];
	}
	public static void main(String[] args) {

		List.<Integer>of(4,6);
		
		Main.<String>m(new String[] {});
		
		List.of(new int[] {});
	}

}
