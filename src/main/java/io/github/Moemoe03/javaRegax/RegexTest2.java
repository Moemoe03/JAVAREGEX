package io.github.Moemoe03.javaRegax;

import java.util.regex.*;

public class RegexTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String regex = "^J2EE[0-9]{3}$";
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher("J2EE001");
       System.out.println(matcher.matches());
	}

}
