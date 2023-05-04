package com.keubiko;

import java.util.ArrayList;
import java.util.List;

public class Doss {
	
	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("10");
		list.add("10.4");
		double sum=list.stream().mapToDouble(s->Double.parseDouble(s)).sum();
		System.out.println(sum);
	}

}
