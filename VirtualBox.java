import java.util.Scanner; //for using scanner to take inpute from user
import java.text.SimpleDateFormat; //for date format
import java.util.Date; //for date
import java.awt.Desktop; //this is for the Browser
import java.net.URI; //this is also for the browser

public class VirtualBox {
    Scanner sc = new Scanner(System.in);
    static int pass = 12345;// this is default password
    static String user = "User";// this is default username

    // int shut;
    // this login method is for the displaying login details
    public static void login() throws Exception {
        cls();
        // String user="User";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n---------------------------------------------------------\n\n");
            System.out.println("\t\t\t** Welcome " + user + " **\n");
            System.out.print("\n\t\t Enter Password(Only digits):");
            int passEx = sc.nextInt();
            if (pass == passEx) {
                System.out.println("\n\nLogging in......");
                start();
            } else {
                System.out.println("Invalid password");
            }
        }
    }

    public void vowelFinder() throws Exception {
        cls();
        System.out.println("Enter Your Sentence:");
        String s = sc.next();
        System.out.println("Vowels present in " + s + " String are ");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'U')
                System.out.println(s.charAt(i));
        }
        exits();
    }

    public static void guessGame() {
        cls();
        int attempt = 1;
        int tr = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n\n-----------------------------------------------------------------------------");
        System.out.println(
                "Welcome to Guess Number Game \nYou Will Be Asked To Guess A Number To Win The Game \nYou have Maximum 5 Attemp Limit");
        do {

            System.out.print("Enter a guess number between 1 to 100\t\t\t(ATTEMPT:" + attempt + ")\n");
            if (userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();
                if (userGuessNumber == secretNumber) {
                    System.out.println("OOhhOO!, Your Number is Correct. You Win the Game!");
                    userInput.next();
                    break;
                } else if (userGuessNumber < secretNumber)
                    System.out.println("Your Guess Number is Smaller.");
                else if (userGuessNumber > secretNumber)
                    System.out.println("Your Guess Number is Greater.");
                if (attempt == 5) {
                    System.out.println("You have exceeded the maximum attempt. \n\n your Number was " + secretNumber);
                    System.out.println("Want to try again.\n if yes press 1 and if not press 0");
                    tr = userInput.nextInt();
                    cls();
                    // break;
                }
                attempt++;
            } else {
                System.out.println("Enter a Valid Integer Number");
                break;
            }
        } while (userGuessNumber != secretNumber && tr == 1);
    }

    // this calender method is for displaying the calender of 2022
    public void calender() throws Exception {
        cls();
        System.out.println("\t\t\t\t\t\t\t\t\t\t January   2022\n" +
                "\n" +
                "\n" +
                "\t\tJanuary\t\t\t\t\t\t\tFebruary\t\t\t\t\t\t\t\tMarch\n" +
                "S\tM\tT\tW\tT\tF\tS\t\tS\tM\tT\tW\tT\tF\tS\t\tS\tM\tT\tW\tT\tF\tS\n" +
                "\t\t\t\t\t\t1\t\t\t\t1\t2\t3\t4\t5\t\t\t\t1\t2\t3\t4\t5\n" +
                "2\t3\t4\t5\t6\t7\t8\t\t6\t7\t8\t9\t10\t11\t12\t\t6\t7\t8\t9\t10\t11\t12\n" +
                "9\t10\t11\t12\t13\t14\t15\t\t13\t14\t15\t16\t17\t18\t19\t\t13\t14\t15\t16\t17\t18\t19\n" +
                "16\t17\t18\t19\t20\t21\t22\t\t20\t21\t22\t23\t24\t25\t26\t\t20\t21\t22\t23\t24\t25\t26\n" +
                "23\t24\t25\t26\t27\t28\t29\t\t27\t28\t\t\t\t\t\t\t27\t28\t29\t30\t31\t\t\n" +
                "30\t31\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\tApril\t\t\t\t\t\t\t\tMay\t\t\t\t\t\t\t\t\tJune\n" +
                "S\tM\tT\tW\tT\tF\tS\t\tS\tM\tT\tW\tT\tF\tS\t\tS\tM\tT\tW\tT\tF\tS\n" +
                "\t\t\t\t\t1\t2\t\t1\t2\t3\t4\t5\t6\t7\t\t\t\t\t1\t2\t3\t4\n" +
                "3\t4\t5\t6\t7\t8\t9\t\t8\t9\t10\t11\t12\t13\t14\t\t5\t6\t7\t8\t9\t10\t11\n" +
                "10\t11\t12\t13\t14\t15\t16\t\t15\t16\t17\t18\t19\t20\t21\t\t12\t13\t14\t15\t16\t17\t18\n" +
                "17\t18\t19\t20\t21\t22\t23\t\t22\t23\t24\t25\t26\t27\t28\t\t19\t20\t21\t22\t23\t24\t25\n" +
                "24\t25\t26\t27\t28\t29\t30\t\t29\t30\t31\t\t\t\t\t\t26\t27\t28\t29\t30\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\tJuly\t\t\t\t\t\t\t\tAugust\t\t\t\t\t\t\t\tSeptember\n" +
                "S\tM\tT\tW\tT\tF\tS\t\tS\tM\tT\tW\tT\tF\tS\t\tS\tM\tT\tW\tT\tF\tS\n" +
                "\t\t\t\t\t1\t2\t\t\t1\t2\t3\t4\t5\t6\t\t\t\t\t\t1\t2\t3\n" +
                "3\t4\t5\t6\t7\t8\t9\t\t7\t8\t9\t10\t11\t12\t13\t\t4\t5\t6\t7\t8\t9\t10\n" +
                "10\t11\t12\t13\t14\t15\t16\t\t14\t15\t16\t17\t18\t19\t20\t\t11\t12\t13\t14\t15\t16\t17\n" +
                "17\t18\t19\t20\t21\t22\t23\t\t21\t22\t23\t24\t25\t26\t27\t\t18\t19\t20\t21\t22\t23\t24\n" +
                "24\t25\t26\t27\t28\t29\t30\t\t28\t29\t30\t31\t\t\t\t\t25\t26\t27\t28\t29\t30\t\n" +
                "31\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\tOctober\t\t\t\t\t\t\tNovember\t\t\t\t\t\t\t\tDecember\n" +
                "S\tM\tT\tW\tT\tF\tS\t\tS\tM\tT\tW\tT\tF\tS\t\tS\tM\tT\tW\tT\tF\tS\n" +
                "\t\t\t\t\t\t1\t\t\t\t1\t2\t3\t4\t5\t\t\t\t\t\t1\t2\t3\n" +
                "2\t3\t4\t5\t6\t7\t8\t\t6\t7\t8\t9\t10\t11\t12\t\t4\t5\t6\t7\t8\t9\t10\n" +
                "9\t10\t11\t12\t13\t14\t15\t\t13\t14\t15\t16\t17\t18\t19\t\t11\t12\t13\t14\t15\t16\t17\n" +
                "16\t17\t18\t19\t20\t21\t22\t\t20\t21\t22\t23\t24\t25\t26\t\t18\t19\t20\t21\t22\t23\t24\n" +
                "23\t24\t25\t26\t27\t28\t29\t\t27\t28\t29\t30\t\t\t\t\t25\t26\t27\t28\t29\t30\t31\n" +
                "30\t31\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\n");
        exits();

    }

    // this setting method is for running the setting option
    public void settings() throws Exception {
        cls();
        System.out.println("\n\n|About Machine|\t\t\t|Security|");
        System.out.println("  1\t\t\t\t 2");
        System.out.println("\nEnter your choice:");
        int setch = sc.nextInt();
        switch (setch) {
            case 1:

                break;
            case 2:
                System.out.println("\n\n|Change User name|\t\t\t|Change System Password|");
                System.out.println("  1\t\t\t\t\t 2");
                System.out.println("\nEnter your choice:");
                int secCh = sc.nextInt();
                switch (secCh) {
                    case 1:
                        cls();
                        System.out.println("\n\n------------------------------------------------------------");
                        System.out.println("Enter New Name:");
                        // String nwName
                        user = sc.next();
                        System.out.println("User Name changed to " + user + " successfully");
                        exits();
                        break;
                    case 2:
                        cls();
                        System.out.println("\n\n------------------------------------------------------------");
                        System.out.println("Enter Previous Password:");
                        int pPass = sc.nextInt();
                        if (pPass == pass) {
                            System.out.println("Enter New Password:");
                            pass = sc.nextInt();
                            System.out.println("Password changed to " + pass + " Successfully");
                            exits();
                        } else {
                            System.out.println("Invalid Password");
                            break;
                        }
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        exits();
                }

        }
    }

    public void browser() throws Exception {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://bing.com"));
    }

    public int apps() throws Exception {
        cls();
        System.out.println("\n\n|Shut Down|\t\t\t|Settings|");
        System.out.println("  1\t\t\t\t 2");
        System.out.println("\n\n|Calender|\t\t\t|Vowel Finder|");
        System.out.println("  3\t\t\t\t 4");
        System.out.println("\n\n|Browser|");
        System.out.println("  5");
        System.out.println("\nEnter your choice:");
        int appch = sc.nextInt();
        switch (appch) {
            case 1:
                cls();
                System.out.println("\t\t\tShutting down.....");
                return 1;
            // break;
            case 2:
                System.out.println("\n\nOpening Setting....");
                settings();
                break;
            case 3:
                System.out.println("\n\nOpening Calender....");
                calender();
                break;
            case 4:
                System.out.println("\n\nOpening Vowel Finder......\n\n");
                vowelFinder();
                break;
            case 5:
                System.out.println("\n\nOpening Browser....");
                browser();
                break;
            default:
                System.out.println("Invalid Input");
        }
        return 0;
    }

    public void cal() {

        int a, b;
        int ck;
        do {
            cls();
            System.out.println("\n\nEnter operation you want to perform(+,-,*,/,%):");
            String op = sc.next();
            System.out.println("Enter 1st number:");
            a = sc.nextInt();
            System.out.println("Enter 2nd number:");
            b = sc.nextInt();
            switch (op) {
                case "+":
                    System.out.println("\n\nPerforming Addition...");
                    System.out.println("\n1st number:" + a + "\n2nd number:" + b);
                    System.out.println("\n\nAddition of two numbers are:" + (a + b));
                    break;
                case "-":
                    System.out.println("Performing Subtraction...");
                    System.out.println("1st number:" + a + "\n2nd number:" + b);
                    System.out.println("Subtraction of two numbers are:" + (a - b));
                    break;
                case "*":
                    System.out.println("Performing Multiplication...");
                    System.out.println("1st number:" + a + "\n2nd number:" + b);
                    System.out.println("Multiplication of two numbers are:" + (a * b));
                    break;
                case "/":
                    System.out.println("Performing Division....");
                    System.out.println("1st number:" + a + "\n2nd number:" + b);
                    System.out.println("Division of two numbers are:" + (a / b));
                    break;
                default:
                    System.out.println("Invalid operation.\nPlease try again..");
            }
            System.out.println("\nWant to try again.\nif yes press 1 if no press 0");
            ck = sc.nextInt();
        } while (ck == 1);

    }

    void search() throws Exception {
        int ck = 1;
        do {
            cls();
            System.out.println("Enter element:");
            String ele = sc.next();
            if (ele.equalsIgnoreCase("apps") || ele.equalsIgnoreCase("app") || ele.equalsIgnoreCase("ap")) {
                apps();
            } else if (ele.equalsIgnoreCase("games") || ele.equalsIgnoreCase("game") || ele.equalsIgnoreCase("gam")) {
                guessGame();
            } else if (ele.equalsIgnoreCase("notepad") || ele.equalsIgnoreCase("note") || ele.equalsIgnoreCase("npad")
                    || ele.equalsIgnoreCase("pad")) {

            } else if (ele.equalsIgnoreCase("cal") || ele.equalsIgnoreCase("calculator")
                    || ele.equalsIgnoreCase("calci")) {
                cal();
            } else if (ele.equalsIgnoreCase("calender") || ele.equalsIgnoreCase("dates")
                    || ele.equalsIgnoreCase("calen")) {
                calender();
            } else if (ele.equalsIgnoreCase("shut") || ele.equalsIgnoreCase("shut down")
                    || ele.equalsIgnoreCase("log out")) {
                // apps();
            } else if (ele.equalsIgnoreCase("settings") || ele.equalsIgnoreCase("setting")
                    || ele.equalsIgnoreCase("set")) {
                settings();
            } else if (ele.equalsIgnoreCase("security") || ele.equalsIgnoreCase("secure")
                    || ele.equalsIgnoreCase("sec")) {
                settings();
            } else if (ele.equalsIgnoreCase("vowel finder") || ele.equalsIgnoreCase("vowel")
                    || ele.equalsIgnoreCase("vovel")) {
                vowelFinder();
            } else if (ele.equalsIgnoreCase("brower") || ele.equalsIgnoreCase("browse")
                    || ele.equalsIgnoreCase("search")) {
                browser();
            } else {
                System.out.println("Sorry, nothing found !");
            }
            System.out.println("\nWant to try again.\nif yes press 1 if no press 0");
            ck = sc.nextInt();
        } while (ck == 1);

    }

    public static void main(String args[]) throws Exception {
        login();
    }

    public static void start() throws Exception {
        cls();
        int shut = 0;
        while (shut == 0) {
            shut = 0;
            cls();
            VirtualBox v = new VirtualBox();
            Scanner sc = new Scanner(System.in);
            System.out.println("\n------------------------------------------------------------\n");
            SimpleDateFormat formatter = new SimpleDateFormat("\t\t\t\t\t\t\t\t\tdd/MM/yyyy HH:mm:ss"); // code to give
                                                                                                        // format of
                                                                                                        // date and time
            Date date = new Date();
            System.out.println(formatter.format(date)); // printing the date and time on screen
            System.out.println("\n\t\t\t**Virtual Machine**");
            System.out.println("\n\n\n|APP|\t\t|GAMES|");
            System.out.println("  1\t\t   2");
            System.out.println("\n|NOTEPAD|\t|CALCULATOR|");
            System.out.println("  3\t\t   4");
            System.out.println("\n\n|Search|");
            System.out.println("  0\n");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Enter your coice:");
            int ch = sc.nextInt();
            System.out.println("-----------------------------------------------------------------");

            // System.out.println("---------------------------------------------------------------");
            switch (ch) {
                case 1:
                    System.out.println("\n\nOpening APP....");
                    shut = v.apps();
                    break;
                case 2:
                    System.out.println("Opening GAMES....");
                    cls();
                    System.out.println("\n---------------------------------------------------");
                    System.out.println("\n|Guess The Number Game|");
                    System.out.println("  1");
                    System.out.println("Enter your Choice:");
                    int gCh = sc.nextInt();
                    switch (gCh) {
                        case 1:
                            guessGame();
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Opening NOTEPAD....\n\nnow you can start writing..");
                    String in = sc.next();
                    System.out.println("\n\n\n");
                    break;
                case 4:
                    System.out.println("Opening CALCULATOR....");
                    v.cal();
                    break;
                case 0:
                    System.out.println("search here...");
                    v.search();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception E) {
            System.out.println(E);
        }
    }

    public void exits() throws Exception {
        System.out.println("Want to exit\n press 1 ");
        int ex = sc.nextInt();
        if (ex == 1)
            start();
        else
            exits();
    }
}