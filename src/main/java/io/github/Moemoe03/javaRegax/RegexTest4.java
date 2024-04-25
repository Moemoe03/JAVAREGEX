package io.github.Moemoe03.javaRegax;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.print("Enter data : ");
     Scanner sc = new Scanner(System.in);
     String regex = sc.nextLine();
     Pattern pattern = Pattern.compile(regex.toLowerCase());
     Matcher matcher = pattern.matcher("This is google you can search any thing you want and i will show you!!!!".toLowerCase());
     while(matcher.find()) {
    	 System.out.println(matcher.group()+ " found at " + matcher.start() + "and end at " + matcher.end());
     }
	}

}
