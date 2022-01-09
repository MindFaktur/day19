import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import sun.awt.image.AbstractMultiResolutionImage;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regexProblem {

    private static final Scanner SC = new Scanner(System.in);

    private final String nameRegex = "^[A-Z][a-z]{3,}$";
    private final String emailRegex = "^[a-zA-Z0-9][a-zA-Z0-9+_.-]+@[a-zA-Z0-9][a-zA-Z0-9]+[+_.-][a-zA-Z0-9]+$";
    private final String mobNumberRegex = "^[0-9]{2} [6789][0-9]{9}$";
    private final String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8,20}$";

    public static void main(String[] args)
    {
        regexProblem RP = new regexProblem();

        String firstName = RP.getInput("First Name");
        String lastName = RP.getInput("Last Name");
        String email = RP.getInput("Email-id");
        String phoneNumber = RP.getInput("Phone Number");
        String password = RP.getInput("Password");

        RP.printsValidOrInvalid(RP.regexChecker(RP.nameRegex,firstName),firstName,"First Name" );
        RP.printsValidOrInvalid(RP.regexChecker(RP.nameRegex,lastName),lastName,"Last Name" );
        RP.printsValidOrInvalid(RP.regexChecker(RP.emailRegex,email),email,"Email-id" );
        RP.printsValidOrInvalid(RP.regexChecker(RP.mobNumberRegex,phoneNumber),phoneNumber,"Phone Number" );
        RP.printsValidOrInvalid(RP.regexChecker(RP.passwordRegex,password),password,"Password" );

    }

    private String getInput(String userField)
    {
        System.out.println("Please enter your " + userField);
        return SC.nextLine();
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
