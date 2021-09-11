package week2day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if(text1.length()==text2.length()) {
			 char[] chtext1 = text1.toCharArray();
			char[] chtext2=text2.toCharArray();
			Arrays.sort(chtext1);
			Arrays.sort(chtext2);
		
			
			if(Arrays.equals(chtext1,chtext2)) 
				System.out.println(text1+ " and " +text2+" is a anagram");
				else
					System.out.println(text1+ " and " +text2+ " is not anagram");
				
				
			
		}
			
		}
	

}
