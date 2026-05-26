
/*
    Functional Interfaces: These are interfaces which contain only one abstract method but it can contains
    multiple default and static methods, this kind
    of interfaces were first introduced in LISP programming language.
    Functional Interfaces:

    Predicate<T> --> boolean
    Consumer<T>  --> void
    Supplier<T>  --> T
    Function<T>  --> R
    Comparator<T,T> --> int
    Runnable () --> void
 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesExample {
    public static void main(String[] args) {

        //Predicate usage and example
        System.out.println("PREDICATE USAGE:");

        Predicate<Integer> iseven = (n) -> n%2==0;
        System.out.println("iseven? :"+ iseven.test(3));

        Predicate<Integer> ispostive = (n) -> (n > 0);
        System.out.println("ispositive? "+ ispostive.test(-2));

        //Chaining predicates
        Predicate<Integer>  isEvenAndPos = iseven.and(ispostive);
        System.out.println("isEvenAndPos? "+ isEvenAndPos.test(100));

        //Function: that transforms the input to output
        System.out.println("FUNCTION USAGE: ");
        Function<String, Integer> func1 = (s) -> s.length();

        System.out.println("length of the string: "+ func1.apply("helloworld"));

        //Consumer: Takes input but it wont provide any output after processing
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("hello world!");

        //Supplier: supplies the values
        Supplier<String> supplier = () -> "SUPPLIER";
        System.out.println(supplier.get());
    }
}
