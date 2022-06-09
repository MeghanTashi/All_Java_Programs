import java.lang.String;

class stringMethods {
    public static void main(String[] s) {

        System.out.println("---------------------------------------");

        String s1 = "Hello Java";
        String s2 = "Hello World";
        String s3 = "hello world";

        System.out.println("String1: " + s1);
        System.out.println("String2: " + s2);
        System.out.println("String3: " + s3);
        System.out.println("---------------------------------------");

        char ch = s1.charAt(1);

        System.out.println("Character at index 1 of String1: " + ch);
        System.out.println("---------------------------------------");

        int cmp = s1.compareTo(s2);

        if (cmp > 0) {
            System.out.println("String 1 is greater than String 2");
        } else if (cmp < 0) {
            System.out.println("String 2 is greater than String 1");
        } else {
            System.out.println("String 1 equal to String2");
        }

        System.out.println("---------------------------------------");

        System.out.println("String1 equal to String2: " + s1.equals(s2));

        System.out.println("---------------------------------------");

        System.out.println("String2 equal to String 3(Ignoring Case): " + s2.equalsIgnoreCase(s3));

        System.out.println("---------------------------------------");

        System.out.println("Length of String 1: " + s1.length());

        System.out.println("---------------------------------------");

        System.out.println("Replacing letter 'l' with 'e' in String 1 ..... ");
        System.out.println("New String 1: " + s1.replace('l', 'e'));

        System.out.println("---------------------------------------");

        System.out.println("Is String 1 starts with H: " + s1.startsWith("H"));

        System.out.println("---------------------------------------");

        System.out.println("Is String1 ends with l : " + s1.endsWith("l"));

        System.out.println("---------------------------------------");

        System.out.println("Index of letter H in String1:" + s1.indexOf("H"));

        System.out.println("---------------------------------------");

        System.out.println("Substring of String 1 from index 5: " + s1.substring(5));

        System.out.println("---------------------------------------");

        System.out.println("Concatenating String1 with String2: " + s1.concat(s2));

        System.out.println("---------------------------------------");

        System.out.println("Converting String 1 into Lower Case.....");
        System.out.println(s1.toLowerCase());

        System.out.println("---------------------------------------");

        System.out.println("Converting String 2 into Lower Case.....");
        System.out.println(s2.toLowerCase());

        System.out.println("---------------------------------------");
        System.out.println("Converting String 1 into Upper Case.....");
        System.out.println(s1.toUpperCase());

        System.out.println("---------------------------------------");
        System.out.println("Converting String 2 into Upper Case.....");
        System.out.println(s2.toUpperCase());

        System.out.println("---------------------------------------");

    }
}
