package com.infirstgit;

import java.util.LinkedList;

public class Linked_list {
	public static void main(String[] args) {
		
		LinkedList ls = new LinkedList();
		ls.add(1);
		ls.add(58);
		ls.add(858);
		ls.add("end");
		
		for(Object i :ls) {
			System.out.println(i);
		}
		
	}

}
