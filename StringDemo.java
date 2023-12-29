public class StringDemo {

    public static void main(String[] args) {
        // String class demonstration
        String str1 = "Hello";
        String str2 = "World";
    
        
        String resultConcat = str1.concat(" ").concat(str2);
        System.out.println("Concatenation Result: " + resultConcat);

      
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);

        StringBuffer buffer = new StringBuffer("Java");

    
        buffer.setCharAt(1, 'X');
        System.out.println("After setCharAt: " + buffer);


        buffer.setLength(2);
        System.out.println("After setLength: " + buffer);

        buffer.append(" is fun!");
        System.out.println("After append: " + buffer);

        buffer.insert(4, " programming");
        System.out.println("After insert: " + buffer);

       
    }
}
