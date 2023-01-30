package com.gl.main;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BracketsManager {
	private static Set<Bracket> predefinedBrackets;
	static {
		predefinedBrackets = new LinkedHashSet<>();
		predefinedBrackets.add(new Bracket('[', ']'));
		predefinedBrackets.add(new Bracket('{', '}'));
		predefinedBrackets.add(new Bracket('(', ')'));
		predefinedBrackets.add(new Bracket('<', '>'));
	}

	public static Set<Character> getOpenBracketsSet() {
		Set<Character> openBracketsSet = new LinkedHashSet<>();
		Iterator<Bracket> itr = predefinedBrackets.iterator();
		while (itr.hasNext()) {
			Bracket bracket = itr.next();
			openBracketsSet.add(bracket.getOpenBracket());
		}
		return openBracketsSet;
	}

	public static Set<Character> getCloseBracketsSet() {
		Set<Character> closeBracketSet = new LinkedHashSet<>();
		Iterator<Bracket> itr = predefinedBrackets.iterator();
		while (itr.hasNext()) {
			Bracket bracket = itr.next();
			closeBracketSet.add(bracket.getCloseBracket());
		}
		return closeBracketSet;
	}

	public static Bracket getBracket(Character closedBracket) {
		for (Bracket b : predefinedBrackets)
			if (b.getCloseBracket().equals(closedBracket))
				return b;
		return null;
	}
}
