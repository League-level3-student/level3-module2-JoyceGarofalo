package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int j = 0; j < eggs.size(); j++) {
			if(eggs.get(j).equals("cracked")) {
				return j; 
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int oy = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i) == true) {
				oy += 1;
			}
		}
		return oy;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		Double tall = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > tall) {
				tall = peeps.get(i);
			}
		}
		return tall;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String largest = "";
		int wordsize = 0;
		int letters = 0;
		for (int i = 0; i < words.size(); i++) {
			letters = words.get(i).length();
			if (letters > wordsize) {
				wordsize = letters;
			}
		}
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length() == wordsize){
				return words.get(i);
			}
		}
		return null;
	}

	public static Object containsSOS(List<String> message1) {		//doesn't work
		// TODO Auto-generated method stub
		for (int i = 0; i < message1.size(); i++) {
			if(message1.contains("... --- ...")) {
				return true;
			}
		}
		return message1;
		
	}
}
