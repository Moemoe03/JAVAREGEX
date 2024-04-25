package io.github.Moemoe03.javaRegax;

import java.util.regex.*;

public class RegexTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       String regex = "[abc]?";one only
//		String regex = "[abcdef]+"; one and moe 
//		String regex = "[abcde]{2}"; infinity
//		String regex = "[abcdef]{4,10}"; 4 to 10 
//		String regex = "[abc]*"; not and more
//		String regex = ".+"; one and more than any other
//		String regex = "^(\\d)(\\d)(.)(\\d)(\\d)(\\d)$";
//		String regex = "^(\\d+)(.)(\\d*)$";
		String regex = "^([a-zA-Z0-9[^\\#$%^&*]]+)(@)([a-zA-Z]+)(.)([a-zA-z]{2,})";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher("moemoekhaing070@gmail.com");
       System.out.println(matcher.matches());
	}

}
