public class StringDemo {

    public static void main(String[] args) {
        // String class demonstration
        String str1 = "Hello";
        String str2 = "World";

        // concat() - concatenates two strings
        String resultConcat = str1.concat(" ").concat(str2);
        System.out.println("Concatenation Result: " + resultConcat);

        // equals() - compares two strings for equality
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);

        // StringBuffer class demonstration
        StringBuffer buffer = new StringBuffer("Java");

        // setCharAt() - sets the character at the specified index
        buffer.setCharAt(1, 'X');
        System.out.println("After setCharAt: " + buffer);

        // setLength() - sets the length of the string
        buffer.setLength(2);
        System.out.println("After setLength: " + buffer);

        // append() - appends the specified string to the buffer
        buffer.append(" is fun!");
        System.out.println("After append: " + buffer);

        // insert() - inserts the specified string at the specified position
        buffer.insert(4, " programming");
        System.out.println("After insert: " + buffer);

        String st = "java ";
        String st1 = " Programming";

        String stw = st.concat(str2);
        System.out.println(stw);
    }
}
