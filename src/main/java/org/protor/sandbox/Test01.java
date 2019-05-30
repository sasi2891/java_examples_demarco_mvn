package org.protor.sandbox;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Test01 {

	public static void main(String[] args) {
		
		int[] ia1 = new int[] {1, 2, 3, 555};
		int[] ia2 = new int[] {-1, -2, -3};
		int[] ia3 = ArrayUtils.addAll(ia1, ia2);
		
		System.out.println( Arrays.toString(ia3) );

	}

}
