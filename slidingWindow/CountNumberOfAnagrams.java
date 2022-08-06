package slidingWindow;

import java.util.HashMap;

public class CountNumberOfAnagrams {

	private static int countTheNumberOfAnagrams() {

		String str = "forxxorfxdofr";
		String pattern = "for";

		int windowSize = pattern.length();
//		System.out.println("windowSize - "+windowSize);
		int start=0,end=0,distinctCharactersCount=0,anagramCount=0;

		HashMap<Character,Integer> distinctCharacterCountMap = new HashMap<Character,Integer>();

		createDistinctValueMap(distinctCharacterCountMap,pattern);

		distinctCharactersCount = distinctCharacterCountMap.size();

//		System.out.println("distinctCharactersCount - "+distinctCharactersCount);
//		System.out.println("distinctCharacterCountMap  - "+distinctCharacterCountMap);
		while(end<str.length()) {
			
//			System.out.println("distinctCharacterCountMap - "+distinctCharacterCountMap);
//			System.out.println("str.toCharArray()[end]) - "+str.toCharArray()[end]);
//			System.out.println("end - "+end);
			
			if(distinctCharacterCountMap.containsKey(str.toCharArray()[end])) {
				distinctCharacterCountMap.put(str.toCharArray()[end],distinctCharacterCountMap.get(str.toCharArray()[end]) - 1);
				System.out.println("distinctCharacterCountMap - "+distinctCharacterCountMap);
				if(distinctCharacterCountMap.get(str.toCharArray()[end]) == 0) {
					distinctCharactersCount-- ;
				}  
			
			}
			
			
			 
			if( ((end-start)+1) < windowSize) {
				end++;
			} else {
				
				if( ((end-start)+1) == windowSize) {

					if(distinctCharactersCount == 0) {
						anagramCount++;
					} 
					
					if(distinctCharacterCountMap.containsKey(str.toCharArray()[start])) {
						distinctCharacterCountMap.put(str.toCharArray()[start],distinctCharacterCountMap.get(str.toCharArray()[start]) + 1);
						if(distinctCharacterCountMap.get(str.toCharArray()[start]) !=null && distinctCharacterCountMap.get(str.toCharArray()[start]) == 1){
							 distinctCharactersCount ++;
		                }
					
					}
					
					
					System.out.println("distinctCharacterCountMap 1- "+distinctCharacterCountMap);
					start++;
					end++;
				}
			}
		}
		
		return anagramCount;
	}


	private static void createDistinctValueMap(HashMap<Character,Integer> distinctCharacterCountMap,String pattern) {
		
		for(char distinctCharacter : pattern.toCharArray()) {
			if(distinctCharacterCountMap.containsKey(distinctCharacter)) {
				distinctCharacterCountMap.put(distinctCharacter,distinctCharacterCountMap.get(distinctCharacter) + 1);

			} else {
				distinctCharacterCountMap.put(distinctCharacter,1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The occurances of Anagrams - "+countTheNumberOfAnagrams());
	}

}
