package com.gul.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaStringRegexTest2 {
	public static void main(String[] args) {

//		String pat = "[\\d]{2,3}\\.[\\d]{2,3}\\.[\\d]{2,3}\\.[\\d]{2,3}";
//		boolean pa = Pattern.matches(pat, "000.12.12.034");
//		if (pa) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
//		   Scanner in = new Scanner(System.in);
//		        while(in.hasNext()){
//		            String IP = in.next();
		            
		              String pat ="[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}";
		    Pattern    p = Pattern.compile(pat); 
		    String IP ="666.666.23.23";
		    Matcher matcher = p.matcher(IP);
		    boolean b = matcher.matches();
		    System.out.println(b);
//		                     }
//		                     in.close();
		
//		  String pat = "[\\d]{2,3}\\.[\\d]{2,3}\\.[\\d]{2,3}\\.[\\d]{2,3}";
//		        Pattern p = Pattern.compile(pat);
//		         
//		     Matcher m = p.matcher("000.12.12.034");  
//		      boolean b = m.matches();  
//		      if(b){
//		          System.out.println(true);
//		      }else{
//		           System.out.println(false);
//		      }

	}
}
