public class Example2 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abc" ;
        String str3 = "abcd";

        str2 += "d";

        System.out.println(str1 == str3);

        System.out.println(str1 == str2);

        System.out.println(str1.intern() == str2.intern());


    }

}
