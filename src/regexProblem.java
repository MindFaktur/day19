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
        String firstName = SC.next();

        System.out.println("Please enter your Last Name");
        String lastName = SC.next();

        System.out.println("Please enter your Email");
        String email = SC.next();

        String specialCharacters = "^[a-zA-Z0-9][a-zA-Z0-9+_.-]+@[a-zA-Z0-9][a-zA-Z0-9]+[+_.-][a-zA-Z0-9]+$";

        RP.printsValidOrInvalid(RP.regexChecker("^[A-Z][a-z]{3,}",firstName),firstName,"First Name" );
        RP.printsValidOrInvalid(RP.regexChecker("^[A-Z][a-z]{3,}",lastName),lastName,"Last Name" );
        RP.printsValidOrInvalid(RP.regexChecker(specialCharacters,email),email,"Email-id" );

    }

    private void printsValidOrInvalid(boolean val, String name, String userField){
        if ( val ){
            System.out.println(userField + " " + name + " is Valid ");
        }else{
            System.out.println(userField + " " + name + " is Invalid ");
        }
    }

    private boolean regexChecker(String regex, String name)
    {
        return Pattern.matches(regex,name);
    }

}
