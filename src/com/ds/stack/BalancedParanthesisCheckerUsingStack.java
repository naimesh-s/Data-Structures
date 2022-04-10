package com.ds.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Balanced parenthesis checker to check the parenthesis is balanced or not. Also, considering empty string input as balanced string. 
 * For Example :- input = "[({})]" --> output = valid 
 * 				  input = "{[)}(]" --> output = Invalid
 * 
 * @author naimesh.shah
 *
 */
public class BalancedParanthesisCheckerUsingStack {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string of parenthesis to check : \n");

		String str = sc.next();
		boolean isBalanced = isParanthesisBalanced(str);
		if (isBalanced) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

	public static boolean isParanthesisBalanced(String str) {

		if (str.isEmpty()) {
			return true;
		}

		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == '[') || (str.charAt(i) == '(') || (str.charAt(i) == '{')) {
				st.push(str.charAt(i));
			} else {
				if (!st.isEmpty() && ((str.charAt(i) == ']' && st.peek() == '[')
						|| (str.charAt(i) == ')' && st.peek() == '(') || (str.charAt(i) == '}' && st.peek() == '{'))) {
					st.pop();
				} else {
					st.push(str.charAt(i));
				}
			}
		}

		return !st.isEmpty() ? false : true;
	}
}
