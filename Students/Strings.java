package Students;

public class Strings {
    public static void main(String[] args) {
        String s20 = "welcome to";
        String s21 = "Hyderabad";
        System.out.print(" " + s20);
        System.out.println(" " +s21);

        //1 To find length of characters
        String s = "Jai Guru Dev";
        System.out.println("length of string" + s.length());

        //2 to find character at required position
        System.out.println(" character at 4th position " + s.charAt(4));

        //3 to find string substring
        System.out.println(" the desired subString " + s.substring(4));

        //4 to find string substring
        System.out.println(" the required subString " +s.substring(4,12));

        //5 to string concatenate
        String s1 ="Naam prabhu ka";
        System.out.println(" the required string Concatenate " + s.concat(s1));

        //6 Returns the index within the string of the first occurrence of the specified string.
        String s2 = "Be vegetarian ";
        System.out.println(" the index of Vegetarian " + s2.indexOf("vegetarian"));

        //7  Returns the index within the string of the first occurrence of the specified string,
        //  starting at the specified index.
        System.out.println(" index of a " +s2.indexOf('a',4));

        //8 Returns the index within the string of the last occurrence of the specified string.
        System.out.println("last index of a " +s.lastIndexOf(" a "));

        //9 Compares this string to the specified object
        boolean b = " Jai ".equals("Jai");
        boolean c = " jai ".equals("Jai");
        System.out.println(" " +b +" " +c);
        //10 Compares string to another string, ignoring case considerations.

        boolean d = " guru ".equalsIgnoreCase("Guru");
        boolean e = " GURU ".equalsIgnoreCase(" guru ");
        System.out.println(" " +d +" " +e);
        //11 Compares two string lexicographically.

        int comp = s1.compareTo(s2);
        int com = s2.compareTo(s);
        System.out.println(""+comp + "" +com);

        //12 Compares two string lexicographically, ignoring case considerations.
        int compa = s1.compareToIgnoreCase(s2);
        int compar = s2.compareToIgnoreCase(s);
        System.out.println(" " +compa +" " +compar);

        //13 Converts all the characters in the String to lower case.
        String s3 = "'Jai Guru Dev'";
        String s4 = s3.toLowerCase();
        System.out.println(" " +s4);

        //Converts all the characters in the String to upper case.
        String s5 = s2.toUpperCase();
        System.out.println(" " +s5);

        //Returns the copy of the String, by removing whitespaces at both ends
        String s6 = s2.trim();
        System.out.println(" " +s6);

        // Returns new string by replacing all occurrences of oldChar with newChar.
        String s7 = s3.replace("''"," ");



       /*long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 1000; i++) {
            sb.append("StringBuffer");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb1 = new StringBuilder("Java");
        for (int i = 0; i < 1000; i++) {
            sb.append("StringBuilder");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");*/
    }
}

