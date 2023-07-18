package org.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagram {


	public static void main(String[] args) {
		String s[]={"eat", "tea", "tan", "ate", "nat", "bat"}; 
		stringArrayAnagram(s);
		// [aet, aet, ant, aet, ant, abt]

	}
	public static HashMap<String, Integer> stringArrayAnagram (String[] s) {
		
		HashMap<String, Integer> map=new HashMap<>();
		
		ArrayList<String> list=new ArrayList<>(); 
		
		//int count=1;
		
		for(int i=0; i<s.length; i++) {
			
			char[] ch=s[i].toCharArray();
			Arrays.sort(ch);
			String strSorted=new String(ch);
			
			if(map.containsKey(strSorted)) 
			{ 
				//int count = map.get(strSorted);
				//map.put(strSorted, count+1);
				map.put(strSorted, map.get(strSorted) + 1);

			}else {

				map.put(strSorted, 1);

			}

			list.add(strSorted);	

		}

		System.out.println(map); 
		return map;

	}
}


