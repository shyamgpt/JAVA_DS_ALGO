package string_topic;

public class AnagramCheckSoln {
	
	
	public static boolean AnaGramCheck(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() == str2.length()) {
			for(int i =0 ; i<str1.length(); i++) {
				for(int j =0; j<str2.length(); j++) {
					if(str1.charAt(i) == str2.charAt(j)) {
						return true;
					} else {
						return false;
					}
				}
			}
		}
		return true;
//		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Bored";
		String str2 = "Robed";
		boolean res = AnaGramCheck(str1, str2);
		System.out.println(res);

	}

}
