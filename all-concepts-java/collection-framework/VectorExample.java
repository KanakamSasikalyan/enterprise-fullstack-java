import java.util.Vector;

public class VectorExample {
    /*
            Vector: Implements the List, Like ArrayList it also maintains the insertions order
            - It is thread-safe arraylist
            - as it is synchronized it gives poor performance
     */

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();  //it creates vector with default cap of 10

        Vector<Integer> invec = new Vector<>(10, 5); //inital capacity: 10, increments by 5

        //adding the elements
        vector.add("naruto");
        vector.addElement("demon slayer");

        System.out.println("vector: "+ vector);

        //accessing the elemets
        System.out.println(vector.get(0));
        System.out.println("first element: "+ vector.firstElement());
        System.out.println("last element: "+ vector.lastElement());

        //removing the elements
        vector.remove("demon slayer");

        System.out.println("after removal: "+ vector);


        //capacity of the vector
        System.out.println("capactiy of the vector: "+ vector.capacity());


    }
}
