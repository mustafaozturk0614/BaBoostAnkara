package com.bilgeadam.lesson018.stack;

import java.util.Stack;

/*
 * 
 * 
 * 
 */
public class ParaSayma {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> yeniStack = new Stack<Integer>();
		stack.add(200);
		stack.add(100);
		stack.push(20);
		stack.push(25);
		stack.add(20);

//		stack.forEach(s -> System.out.println(s));
//		int size = stack.size();
//		for (int i = 0; i < stack.size(); i++) {
//			System.out.println(stack.pop());
//		}

//		while (stack.empty() == false) {
//			System.out.println(stack.pop());
//
//		}

		int toplam = 0;

		while (stack.isEmpty() == false) {

			if (stack.peek() < 100) {
				toplam += stack.pop();
			} else {
				yeniStack.add(stack.pop());
			}

		}

		System.out.println(toplam);

		yeniStack.forEach(s -> System.out.println(s));

	}

}
