package io.github.Moemoe03.javaRegax;

import java.util.regex.*;

public class RegexTest {
    public static void main(String[] args) {
        String[]str = {"J2EE000","J2EE001","J2EE002","J2EE005","J2EE0011"};

        String regex = "^J2EE[0-9]{3}$";
        Pattern pattern = Pattern.compile(regex);

        for (String string : str) 
        {
            Matcher matcher = pattern.matcher(string);
            System.out.println(matcher.matches());
        }
    }
}
