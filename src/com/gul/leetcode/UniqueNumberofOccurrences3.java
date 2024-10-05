package com.gul.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurrences3 {

	public static void main(String[] args) {


//		int arr[] = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };

//		int arr[] = { 1, 2, 2, 1, 1, 3 };

		int arr[] = { 26, 2, 16, 16, 5, 5, 26, 2, 5, 20, 20, 5, 2, 20, 2, 2, 20, 2, 16, 20, 16, 17, 16, 2, 16,
				20, 26, 16 };

//		int arr[] = { 1, 2 };

		HashMap<Integer,Integer> map = new HashMap<>();

		       for(int i =0; i< arr.length;i++){
		        map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		       }
		       HashSet<Integer> val= new HashSet(map.values());
		       if(map.size() == val.size()) {
			       System.out.println("TRUE");
		       }else {
			System.out.println("false");
		}
		       
//		      return map.size() == val.size();  working
		       
	}

}
