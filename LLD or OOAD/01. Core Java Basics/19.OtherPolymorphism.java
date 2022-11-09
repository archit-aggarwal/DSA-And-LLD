class Driver {
    public static void fun(long var) {
        System.out.println(var);
    }

    public static void fun2(char var) {
        System.out.println(var);
    }

    public static void main(String[] args) {
        // 1. Operator Overloading
        int var1 = 100;
        int var2 = 200;

        System.out.println(var1 + var2);
        // + => Addition of two integers

        String str1 = "Archit";
        String str2 = "Aggarwal";
        System.out.println(str1 + str2);
        // + => Concatenation of String

        System.out.println(var1 + var2 + str1);
        // Addition then Concatenation

        System.out.println(str1 + var1 + var2);
        // Concatenations only
        System.out.println(var1 + str1 + var2);

        System.out.println("\t Archit \n Aggarwal");

        // 2. Type Casting
        fun(99999999999l); // long -> long
        fun(200); // int -> long
        fun('A'); // char -> long

        fun2((char) 100l); // long -> char
        fun2((char) 35); // int -> char
        fun('A'); // char -> char
    }
}