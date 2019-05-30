package org.protor.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;

public class Test01 {

	public static void main(String[] args) {

		int[] ia1 = new int[] {1, 2, 3, 555};
		int[] ia2 = new int[] {-1, -2, -3};
		int[] ia3 = ArrayUtils.addAll(ia1, ia2);

		System.out.println( Arrays.toString(ia3) );

		System.out.println("---------------------------");

		List<Double> list1 = new ArrayList<Double>();

		List<Double> list2 = new ArrayList<Double>();

		list2.add(-1.7);
		list2.add(-4.0);

		System.out.println(Arrays.toString(list2.toArray()));

		list1.addAll(list2);
		list1.addAll(list2);
		System.out.println(Arrays.toString(list1.toArray()));

		Collections.sort(list1);
		System.out.println(Arrays.toString(list1.toArray()));

		System.out.println("---------------------------");

		Map<String, Integer> m = new HashMap<String, Integer>();

		String[] strings = new String[] {"AAA", "Avv", "ss3", "AAA", "Avv", "Avv"};

		for (String a : strings) {
			Integer freq = m.get(a);
			m.put(a, (freq == null ? 1 : freq + 1));
		}
		System.out.println(m.size() + " parole distinte:");
		System.out.println(m);
		
		m.put("AAA", -49);
		System.out.println(m);
		
		int kk = 0;
		System.out.println(strings[kk] + " ---> " + m.get(strings[kk]));
	}

}
