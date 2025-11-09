public class AG_stringsintro{
    public static void main (String[] args){
        // Two type to define a string : 
        String str1 = new String ("deepesh");
        System.out.println(str1);

        String str2 = "Deepesh";
        System.out.println(str2);

        // String methods in Java :

        int value1 = str1.length();
        int value2 = str2.length();
        System.out.println(value1);
        System.out.println(value2);

        String lstring = str2.toLowerCase(); // string is immutable datatype but here we are creating new string using the existing string.
        String ustring = str2.toUpperCase();
        System.out.println(lstring);
        System.out.println(ustring);
        System.out.println(str2); // Original string doesn't changes 

        String str3 = new String("  hello world  ");

        str3 = str3.toUpperCase(); // here we are chnaging the address that the variable <str3> points  

        String trimmedstr= str3.trim();
        System.out.println(str3);  // prints --  HELLO WORLD  -- in place of --  hello world  --
        System.out.println(trimmedstr);

        String substr1 = str2.substring(4);  // starting index to the end of the string 
        String substr2 = str2.substring(0,3);// starting to ending index -1 i.e. for (n,m)-> n to m-1 indices
        System.out.println(substr1);         // indexing starts from 0
        System.out.println(substr2);         // start is included but end is excluded.
        System.out.println(str2.substring(2,7)); // end index can't exceed the lenght.
        //System.out.println(str2.substring(2,10)); //-> This will give an error.

        String newstr1 = str2.replace('e','x'); // (old char in single '' , new char in '') -> here two char ..
        System.out.println(newstr1);
        String newstr2 = str2.replace("esh","sha"); // here two sting (parts) thus in double ""
        System.out.println(newstr2);
        String newstr3 = str2.replace("e","sha"); // will replace every time the old "string" arrives.
        System.out.println(newstr3);
        //String newstr4 = str2.replace('e',"sha"); // this will be an error.
        //System.out.println(newstr4);

        boolean a = str2.startsWith("d"); // gives boolean values .... always inside is string not character.
        boolean b = str2.endsWith("sh");
        System.out.println(a);
        System.out.println(b);

        char ch = str1.charAt(5); // returns the character at the given index.
        System.out.println(ch); 
        int i1 = str1.indexOf('e'); // returns the index where the given character first occurs ... char thus use ''
        System.out.println(i1);
        int i2 = str1.indexOf('b'); // if cant find then returns -1.
        System.out.println(i2);
        int i3 = str1.indexOf('e',3); // (char we need to find the index of , index from where we will start )
        System.out.println(i3);
        int i4 = str1.indexOf("es"); // we can also find the starting index of a string " "
        System.out.println(i4);
        String newname = new String ("deepesheshesh");
        int i5 = newname.indexOf("esh",5); // first occurance of the string part.
        System.out.println(i5);

        int i6 = str1.lastIndexOf("e"); // returns last index of the --string-- " "
        System.out.println(i6);
        int i7 = str1.lastIndexOf("e",3); // ("str",n) -> returns last index of the --string-- " " on or before index n
        System.out.println(i7);
        int i8 = str1.lastIndexOf("z",3); // returns -1 as that of indexOf case 
        System.out.println(i8);

        boolean c = str1.equals(str2);             // since string is case sensitive 
        boolean d = str1.equalsIgnoreCase(str2);
        boolean e = str1.equals("deepesh");
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // escape seq characters 
        System.out.println("to print double qoute: \"");
        System.out.println("to print single qoute: \'"); 
        System.out.println("to print single qoute: '"); // not needed here
        System.out.println("to print back slash: \\");
        System.out.print(".");
        System.out.print("to print next line:\n--");
        System.out.print(".");
        System.out.print("to print tab:\t");
        System.out.print(".");
    }
}