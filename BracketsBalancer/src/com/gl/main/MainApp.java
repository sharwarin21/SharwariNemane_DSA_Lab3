package com.gl.main;

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class MainApp {
	public static String checkBrackets(String expression) {
		Set<Character> openBrackets = BracketsManager.getOpenBracketsSet();
		Set<Character> closeBrackets = BracketsManager.getCloseBracketsSet();
		Stack<Character> bracketsStack = new Stack<>();
		Character actual, expected;
		for (int i = 0; i < expression.length(); i++) {
			Character ch = expression.charAt(i);
			if (openBrackets.contains(ch))
				bracketsStack.push(ch);
			else if (closeBrackets.contains(ch)) {
				if (bracketsStack.isEmpty())
					return "The entered expression " + expression + " has Unbalanced Brackets!";
				actual = bracketsStack.pop();
				expected = BracketsManager.getBracket(ch).getOpenBracket();
				if (!actual.equals(expected))
					return "The entered expression " + expression + " has Unbalanced Brackets!";
			} else
				return "The entered expression " + expression + " has Unexpected Characters!";
		}
		return "The entered expression " + expression + " has Balanced Brackets!";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Bracket Expression:");
		String expression = scan.nextLine();
		String result = checkBrackets(expression);
		System.out.println(result);
		scan.close();
	}
}
