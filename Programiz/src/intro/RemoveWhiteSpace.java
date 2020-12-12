package intro;

public class RemoveWhiteSpace {
	
	public static void main(String[] args) {
		
		String str="ahd  dhhd dhhdh dkkdkrhd";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(Character.isAlphabetic(c)) {
				res=res+c;
			}
		}
		System.out.println(res);
	}

}
