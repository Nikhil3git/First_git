package com.infirstgit;

import java.util.ArrayList;

public class Aarray_list {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("nikhil");
		al.add(24);
		al.add("push");
		al.add("repository");
		al.add(80);
		
		System.out.println("this arraylist cointains - " +al);
		for(Object i:al) {
			System.out.println(i);
			
		}
		
	}

}
