package week3;

public class question7 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        System.out.println("String before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        /*
        concat string a and b (HelloWorld)
         */
        a = a+b;
        // use substring to cut element inside string
        // substring(startIndex, endIndex)
        // then return the value in string
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("String after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);


    }
}
