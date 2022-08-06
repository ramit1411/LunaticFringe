package slidingWindow;

import java.util.HashMap;

public class LongestSubStringWithKUniqueValue_Variable {
	private static int getLongestSubString(String str,int numOfUniqueCharacters) {
		
		int start=0,end=0;
		int maxLength = Integer.MIN_VALUE;
		HashMap<Character,Integer> characterCountMap = new HashMap<Character,Integer>();

		while(end < str.length()) {
			char currentChar = str.toCharArray()[end];
			
			if(characterCountMap.containsKey(currentChar)) {
				characterCountMap.put(currentChar,characterCountMap.get(currentChar)+1);
			} else {
				characterCountMap.put(currentChar,1);
			}

			if(characterCountMap.size() < numOfUniqueCharacters) {
				end++;
			} else if(characterCountMap.size() == numOfUniqueCharacters) {
				maxLength = Math.max(maxLength,end-start+1);
				end++;
			} else if(characterCountMap.size() > numOfUniqueCharacters) {
				
				while(characterCountMap.size() > numOfUniqueCharacters) {
					if(characterCountMap.containsKey(str.toCharArray()[start])) {
				characterCountMap.put(str.toCharArray()[start],characterCountMap.get(str.toCharArray()[start])-1);

						if(characterCountMap.get(str.toCharArray()[start]) == 0) {
							characterCountMap.remove(str.toCharArray()[start]);
						}
						start++;
					}
				}
				end++;
			}
		}

		return maxLength;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Longest Substring -> "+getLongestSubString("aabacbebebe",3));
	}

}
