package com.dwivedyKT;


import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		// Test Cases
		System.out.println(is_Anagram("cellar", "recall"));  //returns True

		System.out.println(is_Anagram("arm", "elbow"));    // returns False
		
		// class TempTracker test cases
		
		
		TempTracker tempTracker = new TempTracker();
		
		try {
			tempTracker.insert(9);
			tempTracker.insert(30);
			tempTracker.insert(30);
			tempTracker.insert(40);
			tempTracker.insert(40);
			
			System.out.println("Temperature List: "+ tempTracker.getTempList());
			
			System.out.println("Maximum Temperature in List: "+ tempTracker.get_max());
			
			System.out.println("Minimum Temperature in List: "+ tempTracker.get_min());
			
			System.out.println("Mean Temperature in List: "+ tempTracker.get_mean());
			
			System.out.println("Mode Temperature in List: "+ tempTracker.get_mode());
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
		
	static boolean is_Anagram(String str1, String str2) {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
           return true;
        } else {  
        	return false; 
        }  
    }  

}
