package com.example.gscoderpad.high;

import java.util.ArrayList;
//Given a a string of letters and a dictionary, the function longestWord should
//find the longest word or words in the dictionary that can be made from the letters
//Input: letters = "oet", dictionary = {"to","toe","toes"}
//Output: {"toe"}
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

class Dictionary {
	private String[] entries;
	private TreeMap<String, List<String>> treeMap = new TreeMap<String, List<String>>();

	public Dictionary(String[] entries) {
		this.entries = entries;
		int[] occurrences = new int[26];
		for(String entry : entries) {
			treeMap.compute(getSortedWord(occurrences, entry), (key, value) -> {
				if(value == null) {
					return new ArrayList<String>() {
						private static final long serialVersionUID = 4647805917417749709L;
						{
							add(entry);
						}
					};
				}
				value.add(entry);
				return value;
			});
		}
	}

	public boolean contains(String word) {
		int[] occurrences = new int[26];
		word = getSortedWord(occurrences, word);
		for(String entry : entries) {
			if(getSortedWord(occurrences, entry).equalsIgnoreCase(word)) {
				return true;
			}
		}
		return false;
	}
	
	public Set<String> getLongestWords(String word) {
		return new HashSet<String>(treeMap.get(getSortedWord(null, word)));
	}
	
	private void fillOccurrences(int[] occurrences, String word) {
		char[] charArray = word.toCharArray();
		for(char ch : charArray) {
			occurrences[ch % 'a'] = occurrences[ch % 'a'] + 1;
		}
	}
	
	private String getSortedWord(int[] occurrences, String word) {
		if(occurrences == null || occurrences.length != 26) {
			occurrences = new int[26];
		}
		fillOccurrences(occurrences, word);
		StringBuilder stringBuilder = new StringBuilder();
		for(int index = 0; index < occurrences.length; index++) {
			for(int iteration = 0; iteration < occurrences[index]; iteration++) {
				char ch = (char) ('a' + index);
				stringBuilder.append(ch);
			}
			occurrences[index] = 0;
		}
		return stringBuilder.toString();
	}
}

public class DictionaryProgram {
	public static Set<String> longestWord(String letters, Dictionary dict) {
		Set<String> result = dict.getLongestWords(letters);
		return result;
	}

	public static boolean pass() {
		Dictionary dict = new Dictionary(new String[] { "to", "toe", "toes", "doe", "dog", "god", "dogs", "banana" });
		boolean r = new HashSet<String>(Arrays.asList("toe")).equals(longestWord("oet", dict));
		return r;
	}

	public static void main(String[] args) {
		if (pass()) {
			System.out.println("Pass");
		} else {
			System.err.println("Fails");
		}
	}
}
