public class stringOps {
    public static void main(String[] args) {
        String str1 = new String("Meghan");
        String str2 = new String("Tashi");
        System.out.println(str1);
        System.out.println(str2);
        // Length Operation
        // System.out.println(str1.length());

        // // Concat Operation
        // System.out.println(str1.concat(" " + str2));

        // // charAt Operation
        // System.out.println(str1.charAt(3));

        // System.out.println(str1.trim());

        // System.out.println(str1.replace('a', 'x'));

        // String str3 = "India";
        // String str4 = "INDIA";

        // System.out.println(str3.equals(str4));
        // System.out.println(str3.equalsIgnoreCase(str4));
        // System.out.println(str1.substring(2, 6));

        StringBuffer sb1 = new StringBuffer("Meghan ");
        StringBuffer sb2 = new StringBuffer("Tashi");

        System.out.println(sb1.replace(1, 3, "OK"));

        Character c = new Character('k');
        System.out.println(c);

        Float f = new Float(90.2939);
        System.out.println(f);
        System.out.println(sb2);
    }
}
