package com.ds.stack;

public class TestStack {

	public static void main(String[] args) {
		StackUsingArrays st = new StackUsingArrays(5);
		st.push(5);
		st.push(10);
		st.push(15);
		st.push(20);
		st.push(25);
		
		System.out.println("[");
		for(Object o: st.getStackItems()) {
			System.out.println(o+", ");
		}
		System.out.println("]");
	}

}
