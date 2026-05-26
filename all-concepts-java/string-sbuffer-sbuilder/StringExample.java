public class StringExample {
    /*
            String is an immutable object which cannot be modified , if we try ti change
            it creates the new object in th heap.

            Key characteristics:
            - Immutable.
            - Thread safe since it is immutable.
            - Slower in performance.
     */

    public static void main(String[] args) {
        String str = "hello"; //string literal stores in String Pool
        String obj = new String("Naruto!"); //liternal stores in string pool and objects creats in HEAP.

        //String Methods

        //charAt method
        char c = str.charAt(0);
        System.out.println("char at index 0: "+ c);

        //substring
        String sub = obj.substring(0, 2);
        System.out.println("substring 0..2: "+ sub);

        //search methods
        System.out.println("Naruto in obj: "+ obj.indexOf("Naruto"));

        //comparsion methods
        System.out.println(str.equals(obj.toString()));
    }
}
