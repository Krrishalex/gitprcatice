package day4;

public class CountChars {

	public static void main(String[] args) {
		String s="jshdkjn zdckzxkzjsbv sjfbs";
		int vowels=0,consonants=0,space=0;
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(Character.isAlphabetic(c)) {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					vowels++;
				}
				else {
					consonants++;
				}
			}
			else {
				space++;
			}
			
		}
		
System.out.println("v:"+vowels+":"+"co:"+consonants+":"+"space:"+space);
	}

}
