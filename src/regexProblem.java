import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import sun.awt.image.AbstractMultiResolutionImage;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regexProblem {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args)
    {
        regexProblem RP = new regexProblem();
        System.out.println("Please enter your first Name");
        String userName = SC.next();
        if( RP.regexChecker("^[A-Z][a-z]{3,}",userName) )
        {
            System.out.println("Yes");
            return;
        }
        System.out.println("no");
    }

    private boolean regexChecker(String regex, String name)
    {
        return Pattern.matches(regex,name);
    }

}
