import java.util.Scanner;

//  1. The username is between 4 and 25 characters.
//  2. It must start with a letter.
//  3. It can only contain letters, numbers, and the underscore character.
// 4. It cannot end with an underscore character.

public class Main {

    public static Boolean CodelandUsernameValidation(String str) {

        String regex = "[a-zA-Z][a-zA-Z0-9_]{3,24}[a-zA-Z0-9]$";
        boolean aux;

        aux = str.matches(regex) ? true : false;

        return aux;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }
}