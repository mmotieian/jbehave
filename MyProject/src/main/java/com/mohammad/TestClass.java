package com.mohammad;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello World..!");
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println("-------------------");
		
		for(int num : list)
			System.out.println(num);
		
		MainThread t1 = new MainThread();
		t1.start();
		t1.join();
		t1 = new MainThread();
		t1.start();
		t1.join();
		t1 = new MainThread();
		t1.start();
		t1.join();
		t1 = new MainThread();
		t1.start();
	}
}
