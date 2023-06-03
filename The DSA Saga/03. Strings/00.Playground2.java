import java.util.*;

class Playground {
    public static void main(String[] args) {
        //// SYNTAX
        StringBuilder d1 = new StringBuilder("CSE");
        System.out.println(d1.hashCode());

        StringBuilder d2 = new StringBuilder("CSE");
        System.out.println(d2.hashCode());

        StringBuilder d3 = new StringBuilder("IT");
        System.out.println(d3.hashCode());

        d1.append(" AI");
        System.out.println(d1.hashCode());

        System.out.println(d1 + " " + d2);

        String s1 = "CSE";
        System.out.println(s1.hashCode());

        String s2 = "CSE";
        System.out.println(s2.hashCode());

        String s3 = "IT";
        System.out.println(s3.hashCode());

        s1 = "COE";
        System.out.println(s1.hashCode() + " " + s2.hashCode());

        //// DELETE AND UPDATE OPERATION

        StringBuilder d1 = new StringBuilder("CSE");

        d1.append(" AI"); // concatenate n2 length

        // O(n1)
        // O(n2)
        // O(n1 + n2) : answer
        // O(1)

        d1.setCharAt(1, 'O'); // update or set // O(1)
        d1.deleteCharAt(0); // remove first character // O(n)
        d1.deleteCharAt(d1.length() - 1); // remove last character // O(1)

        System.out.println(d1);

        //////////////////////////////////////////////////

        StringBuilder d1 = new StringBuilder("CSE");
        // n = 26

        for (char ch = 'a'; ch <= 'z'; ch++) { // O(n)
            d1.append(ch); // O(1)

        }
        System.out.println(d1);

        //////////////////////////////////////////////////

        String s1 = "CSE";
        String s2 = "CSE";
        String s3 = "IT";

        // == operator: string literal
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        // equals function: data
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false

        String s4 = new String("CSE");
        String s5 = new String("CSE");
        String s6 = new String("IT");

        System.out.println(s4 == s5); // false
        System.out.println(s1 == s4); // false
        System.out.println(s4 == s6); // false

        System.out.println(s4.equals(s5)); // true
        System.out.println(s1.equals(s4)); // true
        System.out.println(s4.equals(s6)); // false

        ////////////////////////////////////////////////

    public static void main(String[] args) {
        String s1 = "CSE";
        String s2 = "IT";
        System.out.println(s1 + " " + s2); // CSE  IT
        swap(s1 , s2);
        System.out.println(s1 + " " + s2); // CSE IT
        
    } 

    public static void swap(String s1 , String s2){
            System.out.println(s1 + " " + s2); // CSE IT 
            String s3 = s1;
            s1 = s2;
            s2 = s3;
            System.out.println(s1 + " " + s2); // IT CSE
        }

        /////////////////////////////////////////////


    public static void main(String[] args) {
       Integer a = 10;
       System.out.println(a); // 10
       update(a);
       System.out.println(a); // 10 
        
    }
    public static void update(Integer x){
           System.out.println(x); // 10
           x++;
           System.out.println(x); // 11    
        }

        ///////////////////////////////////////////////


         public static void main(String[] args) {
       Integer a1 = 10;
       Integer a2 = 20;
        System.out.println(a1 + " " + a2); // 10 20 
        swap(a1 , a2);
        System.out.println(a1 + " " + a2); // 10 20  
    }
    public static void swap(Integer a1 , Integer a2){
        System.out.println(a1 + " " + a2); // 10 20 
        Integer a3 = a1;
        a1 = a2;
        a2 = a3;
        System.out.println(a1 + " " + a2); // 20 10 
    }

    }
}