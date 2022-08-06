package slidingWindow;

import java.util.HashMap;

public class LongestSubArraySumAllUniqueChars_VariableLength {

	private static int getLongestSubstringWithAllUniqueCharacters(String str) {
		
		int start=0,end=0;
		int maxLength = Integer.MIN_VALUE;

		HashMap<Character,Integer> unqiueCharacterCount = new HashMap<Character,Integer>();

		while(end<str.length()) {
			
			char currentChar = str.toCharArray()[end];
			
			if(unqiueCharacterCount.containsKey(currentChar)) {
				unqiueCharacterCount.put(currentChar,unqiueCharacterCount.get(currentChar)+1);
			} else {
				unqiueCharacterCount.put(currentChar,1);
			}

			if(unqiueCharacterCount.size() == (end-start+1)) {
				maxLength = Math.max(maxLength,(end-start+1));
				end++;
			} else if (unqiueCharacterCount.size() < (end-start+1)) {
		
				while(unqiueCharacterCount.size() < (end-start+1)) {
		
					if(unqiueCharacterCount.containsKey(str.toCharArray()[start])) {
						unqiueCharacterCount.put(str.toCharArray()[start],unqiueCharacterCount.get(str.toCharArray()[start])-1);
		
						if(unqiueCharacterCount.get(str.toCharArray()[start]) == 0) {
						 unqiueCharacterCount.remove(str.toCharArray()[start]);
						}
					}
					start++;
				}
				end++;
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Longest Substring Unqiue -> "+getLongestSubstringWithAllUniqueCharacters("pwwkew"));
	}

}
