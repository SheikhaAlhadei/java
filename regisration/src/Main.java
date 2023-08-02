import java.util.Scanner;
import java.util.regex.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        System.out.println("welcome to Registration Forms  ");

        Scanner read = new Scanner(System.in);

        System.out.println("Enter your Name ");
        String name = read.next();
        System.out.println(Pattern.matches("[a-zA-Z]", name));


        System.out.println("Enter your Password");
        String pass = read.next();
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", pass));

        System.out.println("Enter your Phone  ");
        String ph = read.next();
        System.out.println(Pattern.matches("[968][0-9]{11}", ph));


        System.out.println("Enter your Email  ");
        String em = read.next();
        Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
        Matcher m = p.matcher("foobar@gmail.com");

        if (m.find())
            System.out.println("Correct!");

        }}


//        List<em> emails = new ArrayList();
//        emails.add("user@domain.com");
//        emails.add("user@domain.co.in");
//        emails.add("user1@domain.com");
//        emails.add("user.name@domain.com");
//        emails.add("user#@domain.co.in");
//        emails.add("user@domaincom");
//
//
//        emails.add("user#domain.com");
//        emails.add("@yahoo.com");
//
//        String regex = "^(.+)@(.+)$";
//
//        Pattern pattern = Pattern.compile(regex);
//
//        for(String em : emails){
//            Matcher matcher = pattern.matcher(email);
//            System.out.println(email +" : "+ matcher.matches());
//        }
//

//        em = "username@domain.com";
//         String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
//        assertTrue(em.patternMatches(em, regexPattern));
//






//        List emails = new ArrayList();
//        emails.add("user@domain.com");
//        emails.add("user@domain.co.in");
//        emails.add("user1@domain.com");
//        emails.add("user.name@domain.com");
//        emails.add("user#@domain.co.in");
//        emails.add("user@domaincom");
//
//
//        emails.add("user#domain.com");
//        emails.add("@yahoo.com");
//
//        String regex = "^(.+)@(.+)$";
//
//        Pattern pattern = Pattern.compile(regex);
//
//        for(String em : emails){
//            Matcher matcher = pattern.matcher(email);
//            System.out.println(email +" : "+ matcher.matches());
//        }
//
//


//
//        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
//
//        Pattern pattern = Pattern.compile(regex);

//        emailAddress = "username@domain.com";






































//    public class ArrayList {
//
//
//
//
//
//
//
//    }

