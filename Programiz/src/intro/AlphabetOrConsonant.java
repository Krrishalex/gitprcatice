package intro;

public class AlphabetOrConsonant {

	public static void main(String[] args) {
		
		char c='2';
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			System.out.println("Vowel");
		else 
			System.out.println("Consonant");
		
		
		System.out.println(Character.isAlphabetic(c));

	}

}
